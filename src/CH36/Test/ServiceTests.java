package CH36.Test;

import java.util.List;

import org.junit.jupiter.api.Test;

import CH36.Domain.Common.DTO.BookDTO;
import CH36.Domain.Common.Service.BookServiceImpl;

class ServiceTests {

	@Test
	void bookServiceImpl_1() throws Exception {
		BookServiceImpl service = BookServiceImpl.getInstance();
		boolean isSuccess =
		service.bookRegistration(new BookDTO(1122L,"이것이C언어다","오렌지미디어","121212"));
		System.out.println("도서 등록여부 : " + isSuccess);
	}

	@Test
	void bookServiceImpl_2() throws Exception {
		BookServiceImpl service = BookServiceImpl.getInstance();
		List<BookDTO> list = service.getBooks();
		list.forEach(el->System.out.println(el));
	}
}
