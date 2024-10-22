package CH36.Test;

import java.sql.SQLException;

import org.junit.jupiter.api.Test;

import CH36.Domain.Common.Service.BookService;
import CH36.Domain.Common.Service.BookServiceImpl;

class TxTests {

	@Test
	void Tx_1() throws Exception {
		
		BookService service = BookServiceImpl.getInstance();
		service.txTests();
	
	}

}
