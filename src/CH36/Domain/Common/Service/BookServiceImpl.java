package CH36.Domain.Common.Service;

import java.util.List;

import CH36.Domain.Common.DAO.BookDAOImpl;
import CH36.Domain.Common.DTO.BookDTO;

public class BookServiceImpl {
	
	//BookDAO 연결
	private BookDAOImpl bookDaoImpl;
	
	//싱글톤 패턴 처리코드
	private BookServiceImpl() throws Exception {
		bookDaoImpl = BookDAOImpl.getInstance();
	};
	private static BookServiceImpl instance;
	public static BookServiceImpl getInstance() throws Exception {
		if(instance==null)
			instance = new BookServiceImpl();
		return instance;
	}
	
	// 도서 등록
	public boolean bookRegistration(BookDTO dto) throws Exception{
		// 추가사항(role 에 따른 사용가능 여부체크, 비즈니스 유효성 체크, Tx처리)  
		return bookDaoImpl.insert(dto) > 0;
	}
	// 도서 내용 수정
	public boolean bookUpdate(BookDTO dto) throws Exception{
		return false;
	}
	// 도서 삭제
	public boolean bookRemove(BookDTO dto) throws Exception{
		return false;
	}
	// 도서 조회(단건 - BookDTO)
	public BookDTO getBook(long bookCode) throws Exception {
		return bookDaoImpl.select(bookCode);
	}
	// 도서 조회(다건)
	public List<BookDTO> getBooks() throws Exception{
		return bookDaoImpl.select();
	}
	
	
	
}
