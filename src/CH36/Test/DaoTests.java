package CH36.Test;

import java.util.List;

import org.junit.jupiter.api.Test;

import CH36.Domain.Common.DAO.BookDAOImpl;
import CH36.Domain.Common.DTO.BookDTO;
import Ch37_MVC_Add_View_Socket_Thread.Domain.Common.Dto.BookDto;


class DaoTests {

	@Test
	void BookDaoConnect() throws Exception {
		BookDAOImpl dao = BookDAOImpl.getInstance();
		
	}
	@Test
	void BookDaoInsert() throws Exception{
		BookDAOImpl dao = BookDAOImpl.getInstance();
		dao.insert(new BookDTO(3, "이것이리눅스다","한빛미디어","111-111"));
	}
	@Test
	void BookDaoUpdate() throws Exception{
		BookDAOImpl dao = BookDAOImpl.getInstance();
		dao.update(new BookDTO(3,"이것이자바다","혼빛미디어","222-222"));
	}
	@Test
	void BookDaoDelete() throws Exception{
		BookDAOImpl dao = BookDAOImpl.getInstance();
		dao.delete(1);
	}
	@Test
	void BookDaoSelect() throws Exception{
		BookDAOImpl dao = BookDAOImpl.getInstance();
		BookDTO dto = dao.select(3000024553014L);
		System.out.println(dto);
	}
}
