package CH36.Controller;

import java.util.HashMap;
import java.util.Map;

import CH36.Domain.Common.DTO.BookDTO;
import CH36.Domain.Common.Service.BookServiceImpl;


public class BookController implements SubController{

//  API DOCUMENT
//	Endpoint 	serviceNo		parameter		return
//	/book		add(0)			BookDTO			boolean
//	/book		update(1)		BookDTO			boolean
//	/book		delete(2) 		BookDTO			boolean
//	/book		select(3) 		bookCode		BookDTO
//	/book		selectAll(5)	x->(변경예정)		List<BookDTO>
	
	//예외처리함수
	public Map<String,Object> ExceptionHandler(Exception e){
		Map<String,Object> exMap = new HashMap();
		exMap.put("success", false);
		exMap.put("exception", e);
		return null;
	}
	
	private BookServiceImpl bookServiceImpl;
	public BookController() {
		try {
		bookServiceImpl = BookServiceImpl.getInstance();
	} catch (Exception e) {
		
		
		ExceptionHandler(e);
	}
	}
	
	@Override
	public Map<String, Object> execute(Map<String, Object> params) {
		System.out.println("[SC] BookController execute()...");
		//파라미터 받기
		Integer serviceNo = (Integer)params.get("serviceNo");
		BookDTO bookDTO = (BookDTO)params.get("bookDTO");
		
		// 뷰전달 변수
		Map<String, Object> returnValue = new HashMap();
		
		try {
		switch(serviceNo) {
			case 1:			//add
				System.out.println("[SC] BookController add()...");
				//유효성 확인(Data)
				if(!isValid(bookDTO)) {
					//유효성 체크 실패 시 처리
					returnValue.put("success", false);
					returnValue.put("message", "도서 등록을 실패하였습니다.");
					
					return returnValue;
				}
				// 서비스 요청
				System.out.println("SC] BookController DTO : " + bookDTO);
				boolean isAdded = bookServiceImpl.bookRegistration(bookDTO);
				
				
				// 뷰로 전달
				if(isAdded) {
				returnValue.put("success", true);
				returnValue.put("message", "도서 등록을 완료 하였습니다.");
				}else {
					returnValue.put("success", false);
					returnValue.put("message", "도서 등록을 실패 하였습니다.");
				}
				break;
				
			case 2:			//update
				System.out.println("[SC] BookController update()...");
				break;
			case 3:			//delete
				System.out.println("[SC] BookController delete()...");
				break;
			case 4:			//select
				System.out.println("[SC] BookController select()...");
				break;
			case 5:			//selectAll
				System.out.println("[SC] BookController selectAll()...");
				break;
			default:
				break;
		}
		} catch(Exception e) {
			return ExceptionHandler(e);
		}
		return returnValue;
	}
		
	
	private boolean isValid(BookDTO dto) {
		if(dto.getBookCode()==0)
			return false;
		else if (dto.getBookName().trim()==null || dto.getBookName().trim().equals(""))
			return false;
		return true;
	}
	
}
