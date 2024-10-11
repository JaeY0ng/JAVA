package CH36.Domain.Common.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import CH36.Domain.Common.DTO.BookDTO;
import CH36.Domain.Common.DTO.UserDTO;

public class UserDAOImpl {
	// DBCONN 속성
	private String id = "root";
	private String pw = "1234";
	private String url = "jdbc:mysql://localhost:3306/bookdb";

	private Connection conn;
	private PreparedStatement pstmt;
	private ResultSet rs;

	// 싱글톤 패턴
	private UserDAOImpl() throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		conn = DriverManager.getConnection(url, id, pw);
		System.out.println("UserDAOImpl DB Connection Success");
	};

	private static UserDAOImpl instance;

	public static UserDAOImpl getInstance() throws Exception {
		if (instance == null)
			instance = new UserDAOImpl();
		return instance;

	}
	
	public List<UserDTO> select(){
		return null;
	}
	
	public UserDTO select(UserDTO userDto) {
		return null;
	}
	
	public int insert(UserDTO dto) throws SQLException {
		pstmt = conn.prepareStatement("insert into tbl_user values(?,?,?,?)");
		pstmt.setString(1, dto.getUsername());
		pstmt.setString(2, dto.getPassword());
		pstmt.setString(3, dto.getRole());
		pstmt.setBoolean(4, false);
		
		int result = pstmt.executeUpdate();
		return result;
	}
	
	public int update(UserDTO dto) {
		return 0;
	}
	
	public int delete(long bookCode) {
		return 0;
	}
	
}
