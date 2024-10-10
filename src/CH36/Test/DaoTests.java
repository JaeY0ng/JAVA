package CH36.Test;

import java.sql.SQLException;

import org.junit.jupiter.api.Test;

import CH36.Domain.Common.DAO.BookDAOImpl;


class DaoTests {

	@Test
	void BookDaoConnect() throws Exception {
		BookDAOImpl dao = BookDAOImpl.getInstance();
		
	}

}
