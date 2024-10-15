package CH36.Test;

import java.util.List;
import java.util.Map;

import org.junit.jupiter.api.Test;

import CH36.Domain.Common.DTO.BookDTO;
import CH36.Domain.Common.DTO.SessionDTO;
import CH36.Domain.Common.DTO.UserDTO;
import CH36.Domain.Common.Service.BookServiceImpl;
import CH36.Domain.Common.Service.UserServiceImpl;

class ServiceTests {

//	@Test
//	void bookServiceImpl_1() throws Exception {
//		BookServiceImpl service = BookServiceImpl.getInstance();
//		boolean isSuccess = service.bookRegistration(new BookDTO(1122L, "이것이C언어다", "오렌지미디어", "121212"));
//		System.out.println("도서 등록여부 : " + isSuccess);
//	}

	@Test
	void bookServiceImpl_2() throws Exception {
		BookServiceImpl service = BookServiceImpl.getInstance();
		List<BookDTO> list = service.getBooks();
		list.forEach(el -> System.out.println(el));
	}

	
	//로그인
	@Test
	void userServiceImpl_login() throws Exception{
		UserServiceImpl service = UserServiceImpl.getInstance();
		UserDTO dto = new UserDTO();
		dto.setUsername("member1");
		dto.setPassword("111");
		Map<String,Object> response = service.login(dto, null);
		for(String key : response.keySet()) {
			System.out.println(key + " : " + response.get(key));
		}
	}
		//로그아웃
	
	@Test
	void userServiceImpl_logout() throws Exception {
		UserServiceImpl service = UserServiceImpl.getInstance();
		SessionDTO dto = new SessionDTO();
		dto.setSessionId(2);
		Map<String, Object> response = service.logout(dto.getSessionId());
		for (String key : response.keySet()) {
			System.out.println(key + " : " + response.get(key));
		}
	}

	@Test
	void userServiceImpl_session() throws Exception {
		BookServiceImpl service = BookServiceImpl.getInstance();
		Map<String, Object> response = service.bookRegistration(new BookDTO(1111L, "이것이 자바다", "오렌지미디어", "121212"), 10);
		for (String key : response.keySet()) {
			System.out.println(key + " : " + response.get(key));
		}

	}
}
