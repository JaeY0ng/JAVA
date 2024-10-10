package CH36.Controller;

import java.util.Map;

import CH36.Domain.Common.DTO.BookDTO;

public class BookController implements SubController{

//	Endpoint 	serviceNo		parameter		return
//	/book		add(0)			BookDTO			boolean
//	/book		update(1)		BookDTO			boolean
//	/book		delete(2) 		BookDTO			boolean
//	/book		select(3) 		bookCode		BookDTO
//	/book		selectAll(5)	x->(변경예정)		List<BookDTO>
	
	
	@Override
	public Map<String, Object> execute(Map<String, Object> params) {
		System.out.println("[SC] BookController execute()...");
		//파라미터 받기
		Integer serviceNo = (Integer)params.get("serviceNo");
		BookDTO bookDTO = (BookDTO)params.get("bookDTO");
		
		
		switch(serviceNo) {
			case 1:			//add
				System.out.println("[SC] BookController add()...");
				//유효성 확인(Data)
				if(!isValid(bookDTO)) {
					//유효성 체크 실패 시 처리
				}
				// 서비스 요청
				System.out.println("SC] BookController DTO : " + bookDTO);
				// 뷰로 전달
				
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
		
		//유효성 (Data)
		
		
		// 서비스 요청
		
		
		//뷰로 전달
		
		
		
		return null;
	}
		
	
	private boolean isValid(BookDTO dto) {
		
		
		return true;
	}
	
}
