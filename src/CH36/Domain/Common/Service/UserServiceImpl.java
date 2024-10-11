package CH36.Domain.Common.Service;

import java.sql.SQLException;

import CH36.Domain.Common.DAO.UserDAOImpl;
import CH36.Domain.Common.DTO.UserDTO;

public class UserServiceImpl {
	// UserDAO 연결
	private UserDAOImpl userDaoImpl;

	// 싱글톤 패턴 처리코드
	private UserServiceImpl() throws Exception {
		userDaoImpl = UserDAOImpl.getInstance();
	};

	private static UserServiceImpl instance;

	public static UserServiceImpl getInstance() throws Exception {
		if (instance == null)
			instance = new UserServiceImpl();
		return instance;
	}

	// CRUD

	// 회원가입 함수명(1)
	public boolean memberJoin(UserDTO userDto) throws SQLException {
		return userDaoImpl.insert(userDto) > 0;
	}
	// 회원수정(2)

	// 회원탈퇴(3)

	// 회원정보조회(4)

	// 회원전체정보조회(5)

	// 로그인 함수명(6 - )

	// 로그아웃 함수명(7 - )

	//
}
