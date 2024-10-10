package CH36.Domain.Common.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class BookDAOImpl {
	
	
	//DBCONN 속성
	private String id = "root";
	private String pw = "1234";
	private String url = "jdbc:mysql://localhost:3306/bookDB";
	
	private Connection conn;
	private PreparedStatement pstmt;
	private ResultSet rs;
	
	
	// 싱글톤 패턴 처리코드
	private BookDAOImpl() throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		conn = DriverManager.getConnection(url,id,pw);
		System.out.println("DB Connection Success");
		
	}
	
	private static BookDAOImpl instance = null;
	
	public static BookDAOImpl getInstance() throws ClassNotFoundException, SQLException {
		if(instance == null)
			instance = new BookDAOImpl();
		return instance;
	}
	
	//CRUD
	
	
}
