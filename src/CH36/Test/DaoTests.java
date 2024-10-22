package CH36.Test;

import java.util.List;

import org.junit.jupiter.api.Test;

import CH36.Domain.Common.DAO.BookDAOImpl;
import CH36.Domain.Common.DAO.SessionDAOImpl;
import CH36.Domain.Common.DAO.UserDAOImpl;
import CH36.Domain.Common.DTO.BookDTO;
import CH36.Domain.Common.DTO.SessionDTO;
import CH36.Domain.Common.DTO.UserDTO;

class DaoTests {

	
	@Test
	void BookDaoConnect() throws Exception{
		BookDAOImpl dao= BookDAOImpl.getInstance();
	}
	@Test
	void BookDaoInsert() throws Exception{
		BookDAOImpl dao= BookDAOImpl.getInstance();
		dao.insert(new BookDTO(1,"이것이리눅스다","한빛미디어","111-111"));
	}
	@Test
	void BookDaoUpdate() throws Exception{
		BookDAOImpl dao= BookDAOImpl.getInstance();
		dao.update(new BookDTO(1,"이것이자바다","한빛미디어","222-222"));
	}
	@Test
	void BookDaoDelete() throws Exception{
		BookDAOImpl dao= BookDAOImpl.getInstance();
		dao.delete(1);
	}
	@Test
	void BookDaoSelect() throws Exception{
		BookDAOImpl dao=BookDAOImpl.getInstance();
		List<BookDTO> list = dao.select();
		list.forEach(dto->System.out.println(dto));		
	}
	@Test
	void BookDaoSelect2() throws Exception{
		BookDAOImpl dao=BookDAOImpl.getInstance();
		BookDTO dto =  dao.select(30000002453014L);
		System.out.println(dto);
	}
	@Test
	void UserDaoInsert() throws Exception{
		UserDAOImpl dao = UserDAOImpl.getInstance();
		int result = dao.insert(new UserDTO("ddd","111","ROLE_USER",false));
		System.out.println("계정 INSERT 성공여부 : " + result);
	}
	
	@Test
	void BookDaoTest_Pool() throws Exception {
			BookDAOImpl dao = BookDAOImpl.getInstance();
			dao.insert(new BookDTO(8777L,"a","a","a"));

	}
	
	@Test
	void UserDaoTest_Pool() throws Exception {
			UserDAOImpl dao = UserDAOImpl.getInstance();
			dao.insert(new UserDTO("eee","123","ROLE_USER",false));
	}
	
	@Test
	void SessionTest_Insert() throws Exception{
		SessionDTO session = new SessionDTO(2,"user2","ROLE_USER"); 
		SessionDAOImpl dao = SessionDAOImpl.getInstance();
		dao.insert(session);
		System.out.println(dao.select(1));
	}
	@Test
	void SessionTest_Delete() throws Exception{
		SessionDAOImpl dao = SessionDAOImpl.getInstance();
		dao.delete(2);
	}
	@Test
	void UserDaoTest_Select() throws Exception{
		UserDAOImpl dao = UserDAOImpl.getInstance();
		UserDTO dto = dao.select("ddd");
		System.out.println(dto);
	}
	
	
}
