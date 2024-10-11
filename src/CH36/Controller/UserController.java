package CH36.Controller;

import java.util.HashMap;
import java.util.Map;

import CH36.Domain.Common.DTO.UserDTO;
import CH36.Domain.Common.Service.UserServiceImpl;

public class UserController implements SubController {

	private UserServiceImpl userServiceImpl;
	public UserController() {
		try {
			userServiceImpl = UserServiceImpl.getInstance();
		} catch (Exception e) {
			ExceptionHandler(e);
//			e.printStackTrace();
		}
	}
	
	//예외처리 함수
	public Map<String,Object> ExceptionHandler(Exception e){
		Map<String,Object> exMap = new HashMap();
		exMap.put("success", false);
		exMap.put("message", e.getMessage());
		exMap.put("exception", e);
		return exMap;
	}
	
	
	@Override
	public Map<String, Object> execute(Map<String, Object> params) {
		System.out.println("[SC] UserController execute()...");
		//파라미터 받기(1:insert, 2:update, 3:delete, 4:select, 5:selectAll, 6:login, 7:logout)
		Integer serviceNo = (Integer)params.get("serviceNo");
		UserDTO userDto = (UserDTO)params.get("userDto");
		
		// 뷰전달 변수
		Map<String, Object> returnValue = new HashMap();
		
		try {
		switch(serviceNo) {
			case 1:			//add
				System.out.println("[SC] UserController add()...");
				//유효성 확인(Data)
				if(!isValid(userDto)) {
					//유효성 체크 실패 시 처리
					returnValue.put("success", false);
					returnValue.put("message", "회원 가입 실패");
					return returnValue;
				}
				// 서비스 요청
				System.out.println("SC] UserController DTO : " + userDto);
				boolean isAdded = userServiceImpl.memberJoin(userDto);
				
				
				// 뷰로 전달
				if(isAdded) {
				returnValue.put("success", true);
				returnValue.put("message", "회원 가입을 완료 하였습니다.");
				}else {
					returnValue.put("success", false);
					returnValue.put("message", "회원 가입을 실패 하였습니다.");
				}
				break;
				
			case 2:			//update
				System.out.println("[SC] UserController update...");
				break;
			case 3:			//delete
				System.out.println("[SC] UserController delete...");
				break;
			case 4:			//select
				System.out.println("[SC] UserController select...");
				break;
			case 5:			//selectAll
				System.out.println("[SC] UserController selectAll...");
				break;
			case 6:			//login
				System.out.println("[SC] UserController login...");
				break;
			case 7:			//logout
				System.out.println("[SC] UserController logout...");
				break;
			default:
				break;
		}
		} catch(Exception e) {
			return ExceptionHandler(e);
		}
				
				
		return returnValue;
	}
	private boolean isValid(UserDTO dto) {
		
		return true;
	}
	

}
