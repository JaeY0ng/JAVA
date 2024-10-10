package CH36.Domain.Common.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import CH36.Domain.Common.DTO.BookDTO;

public class BookDAOImpl {
	
	
	//DBCONN 속성
	private String id = "root";
	private String pw = "1234";
	private String url = "jdbc:mysql://localhost:3306/bookdb";
	
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
	public List<BookDTO> select() throws Exception{
		
		List<BookDTO> list = new ArrayList();
		
		pstmt = conn.prepareStatement("select * from tbl_book");
		
		rs = pstmt.executeQuery();
		BookDTO dto = null;
		if(rs!=null) {
			while(rs.next()) {
				dto = new BookDTO();
				dto.setBookCode(rs.getLong("bookCode"));
				dto.setBookName(rs.getString("bookName"));
				dto.setPublisher(rs.getString("publisher"));
				dto.setIsbn(rs.getString("isbn"));
				
				list.add(dto);
				
			}
		}
		
		return list;
	}
	public List<BookDTO> select(int bookCode){
		return null;
	}
	public int insert(BookDTO dto) throws Exception {
		pstmt = conn.prepareStatement("insert into tbl_book values(?,?,?,?)");
		pstmt.setLong(1, dto.getBookCode());
		pstmt.setString(2, dto.getBookName());
		pstmt.setString(3, dto.getPublisher());
		pstmt.setString(4, dto.getIsbn());
		
		int result = pstmt.executeUpdate();
				
		// 자원제거
		pstmt.close();
		
		return result;
	}
	public int update(BookDTO dto) throws Exception{
		pstmt = conn.prepareStatement("update tbl_book set BookName=?,Publisher=?,Isbn=? where BookCode=?");
		pstmt.setString(1, dto.getBookName());
		pstmt.setString(2, dto.getPublisher());
		pstmt.setString(3, dto.getIsbn());
		pstmt.setLong(4, dto.getBookCode());
		
		int result = pstmt.executeUpdate();
				
		// 자원제거
		pstmt.close();
		
		return result;
	}
	public int delete(Long bookCode) throws Exception {
		pstmt = conn.prepareStatement("delete from tbl_book where bookCode=?");
		pstmt.setLong(1,bookCode);
		
		int result = pstmt.executeUpdate();
				
		// 자원제거
		pstmt.close();
		
		return result;
	}
	
	
}
