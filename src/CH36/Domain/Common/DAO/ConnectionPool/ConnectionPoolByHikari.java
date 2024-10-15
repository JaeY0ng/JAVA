//package CH36.Domain.Common.DAO.ConnectionPool;
//
//
//import java.sql.Connection;
//import java.sql.SQLException;
//
//import com.atomikos.jdbc.AtomikosDataSourceBean;
//import com.zaxxer.hikari.HikariConfig;
//import com.zaxxer.hikari.HikariDataSource;
//
//public class ConnectionPoolByHikari {
//
//	private final int size=10;
//	private String url="jdbc:mysql://localhost:3306/bookDB";
//	private String id="root";
//	private String pw="1234";
//	
//	private HikariDataSource dataSource;
//	//TX
//    private AtomikosDataSourceBean xaDataSource;
//
//	//싱글톤 패턴
//	private ConnectionPoolByHikari() {
//		HikariConfig config = new HikariConfig();
//		config.setDriverClassName("com.mysql.cj.jdbc.Driver");
//		config.setJdbcUrl(url);
//		config.setUsername(id);
//		config.setPassword(pw);
//		//Size
//		config.setMaximumPoolSize(size);
//		
//		this.dataSource = new HikariDataSource(config);
//	
//		
//	};
//	
//	private static ConnectionPoolByHikari instance;
//	public static ConnectionPoolByHikari getInstance() {
//		if(instance==null)
//			instance = new ConnectionPoolByHikari();
//		return instance;
//	}
//	
//	public Connection getConnection() throws SQLException {
//		return dataSource.getConnection();
//	}
//	
//	
//	
//	
//	
//	
//}
