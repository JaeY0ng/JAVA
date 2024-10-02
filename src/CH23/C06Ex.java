package CH23;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

class ChargeStation{
	private int no;
	private String section;
	private String station;
	private String name;
	private int zipcode;
	private String address;
	@Override
	public String toString() {
		return "ChargeStation [no=" + no + ", section=" + section + ", station=" + station + ", name=" + name
				+ ", zipcode=" + zipcode + ", address=" + address + "]";
	}
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getSection() {
		return section;
	}
	public void setSection(String section) {
		this.section = section;
	}
	public String getStation() {
		return station;
	}
	public void setStation(String station) {
		this.station = station;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getZipcode() {
		return zipcode;
	}
	public void setZipcode(int zipcode) {
		this.zipcode = zipcode;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public ChargeStation(int no, String section, String station, String name, int zipcode, String address) {
		super();
		this.no = no;
		this.section = section;
		this.station = station;
		this.name = name;
		this.zipcode = zipcode;
		this.address = address;
	}
	
	//Getter and Setter
	//toString
	//모든 인자 생성자 
	
	
}

public class C06Ex {
	//DB CONN DATA
	static String id = "root";
	static String pw = "1234";
	static String url = "jdbc:mysql://localhost:3306/testdb";
	
	//JDBC참조변수
	static Connection conn = null;
	static PreparedStatement pstmt = null;
	static ResultSet rs = null;
	
	public static void connect() throws Exception {
		//DB연결
		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("Driver Loading Success...");
		conn = DriverManager.getConnection(url,id,pw);
		System.out.println("DB CONNECTED...");
	}
	public static void Select() throws Exception {
		//조회
		pstmt = conn.prepareStatement("select * from tbl_sample order by 순번 desc ");
		rs = pstmt.executeQuery();
		if(rs!=null) {
			while(rs.next()) {
				System.out.print(rs.getInt(1)+" ");
				System.out.print(rs.getString(2)+" ");
				System.out.print(rs.getString(3)+" ");
				System.out.print(rs.getString(4)+" ");
				System.out.print(rs.getInt(5)+" ");
				System.out.print(rs.getString(6)+" ");
				System.out.println();
			}
		}
		//자원제거
		freeConnection(pstmt,rs);
	}
	public static void Insert(ChargeStation obj) throws Exception {
		//삽입
		pstmt = conn.prepareStatement("insert into tbl_sample values(?,?,?,?,?,?)");
		pstmt.setInt(1, obj.getNo()); 	//순번
		pstmt.setString(2, obj.getSection());
		pstmt.setString(3, obj.getStation());
		pstmt.setString(4, obj.getName());
		pstmt.setInt(5, obj.getZipcode());	//우편번호
		pstmt.setString(6, obj.getAddress());
		
		int result = pstmt.executeUpdate();
		if(result>0)
			System.out.println("INSERT 성공");
		else 
			System.out.println("INSERT 실패");
		//자원제거
		freeConnection(pstmt);
	}
	public static void Update() throws Exception {
		//수정
	}
	public static void Delete() throws Exception {
		//삭제
	}
	
	//자원제거용 함수 오버로딩
	public static void freeConnection(Connection conn) throws Exception  {}
	public static void freeConnection(PreparedStatement pstmt) throws Exception{
		pstmt.close();
	}
	public static void freeConnection(PreparedStatement pstmt,ResultSet rs)throws Exception {
		pstmt.close();
		rs.close();
	}
	
	
	public static void main(String[] args) {
		try {
			connect();
			Insert(new ChargeStation(201,"대구광역시","대구지사","대구가스",10101,"대구"));
			Select();
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		
//		현재 tbl_sample에 JDBC 를 이용해서 CRUD 를 합니다
//
//		INSERT 해서 값 추가
//		UPDATE/DELETE 사용해 table안의 값 수정/삭제
//		SELECT 값 조회

	}
}
