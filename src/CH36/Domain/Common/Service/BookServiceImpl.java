package CH36.Domain.Common.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import CH36.Domain.Common.DAO.BookDAO;
import CH36.Domain.Common.DAO.BookDAOImpl;
import CH36.Domain.Common.DAO.ConnectionPool.ConnectionPool;
import CH36.Domain.Common.DTO.BookDTO;
import CH36.Domain.Common.DTO.SessionDTO;
public class BookServiceImpl implements BookService {

	
	//BookDao 연결
	private BookDAO bookDaoImpl;
	
	//UserService 연결
	private UserServiceImpl userServiceImpl;
	
	//ConnectionPool
	private ConnectionPool connectionPool;
	
	//싱글톤 패턴 처리코드
	private BookServiceImpl() throws Exception {
		System.out.println("[SERVICE] BookServiceImpl()..");
		bookDaoImpl = BookDAOImpl.getInstance();
		//TX
		this.connectionPool = ConnectionPool.getInstance();
		//
		this.userServiceImpl = userServiceImpl.getInstance();

	};
	private static BookService instance;
	public static BookService getInstance() throws Exception {
		if(instance==null)
			instance = new BookServiceImpl();
		return instance;
	}
	
	//도서등록
	@Override
	public Map<String,Object> bookRegistration(BookDTO dto,int sessionId) throws Exception{

		Map<String,Object> returnValue = new HashMap();
		try {
			connectionPool.beginTransaction(); //tx start
			
			//
			SessionDTO sessionDto =  userServiceImpl.getSession(sessionId);
			if(sessionDto==null) {
				returnValue.put("success", false);
				returnValue.put("message", "로그인이 필요한 서비스입니다.");	
			}else{
				
				String role = sessionDto.getRole(); 
				//ROLE_MEMBER인지 확인
				if(!"ROLE_MEMBER".equals(role)) {
					returnValue.put("success", false);
					returnValue.put("message", "사서계정권한이 필요합니다.");			
				}
				else {
					//사서권한 확인(ROLE_MEMBER)
					BookDTO dbBookDto = bookDaoImpl.select(dto.getBookCode());
					if(dbBookDto!=null) {
						returnValue.put("success", false);
						returnValue.put("message", "동일 도서가 존재합니다.");					
					}else {
						
					  int result = bookDaoImpl.insert(dto);
					  if(result>0) {
							returnValue.put("success", true);
							returnValue.put("message", "도서등록 완료!"); 				  
					  }else {
							returnValue.put("success", false);
							returnValue.put("message", "도서등록 실패.. 관리자에게 문의하세요"); 		  
					  }
						
					  
					}
					
					
				}
				
			}
	
			connectionPool.commitTransaction(); //tx end
		
		}catch(Exception e) {
			connectionPool.rollbackTransaction();//
			throw e;
		}
		

		return returnValue;
	}
	
	
	
	//도서내용수정
	@Override
	public boolean bookUpdate(BookDTO dto) throws Exception {
		
		return bookDaoImpl.update(dto) > 0;
	}
	//도서삭제
	@Override
	public boolean bookRemove(long bookCode) throws Exception {
		return bookDaoImpl.delete(bookCode) > 0;
	}
	
	//도서 조회(단건 - BookDto)
	@Override
	public BookDTO getBook(long bookCode) throws Exception{
		return bookDaoImpl.select(bookCode);
	}
	//도서 조회(다건 - List<BookDto))
	@Override
	public List<BookDTO> getBooks() throws Exception {
		return bookDaoImpl.select();
	}
	
	@Override
	public void txTests() throws Exception{
			
		try {
		connectionPool.beginTransaction();	//TX 시작
		BookDTO dto1 = new BookDTO(101010L,"a","a","a");
		BookDTO dto2 = new BookDTO(101011L,"a","a","a");
		BookDTO dto3 = new BookDTO(101012L,"a","a","a");	//오류발생 !
		BookDTO dto4 = new BookDTO(101013L,"a","a","a");
		bookDaoImpl.insert(dto1);
		bookDaoImpl.insert(dto2);
		bookDaoImpl.insert(dto3);
		bookDaoImpl.insert(dto4);
		connectionPool.commitTransaction();
		}catch(Exception e) {
			connectionPool.rollbackTransaction();
			throw e;
		}
		
	}
	
	
	

}
