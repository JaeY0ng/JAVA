package CH36.Test;

import java.util.HashMap;
import java.util.Map;

import org.junit.jupiter.api.Test;

import CH36.Controller.FrontController;

class ControllerTests {

	@Test
	void FcControllerTests() {
		// 요청사항 받을 FC 생성
		FrontController fc = new FrontController();
		// 전달할 파라미터 준비
		Map<String,Object> params = new HashMap();
		params.put("endPoint", "/user");
//		params.put("service", "add");
		
		//요청사항 전달
		fc.execute(params);
		
	}
	
	@Test
	void FcControllerTests_2() {
		// 요청사항 받을 FC 생성
		FrontController fc = new FrontController();
		// 전달할 파라미터 준비
		Map<String,Object> params = new HashMap();
		params.put("endPoint", "/book");
		params.put("serviceNo", 1);
		
		//요청사항 전달
		fc.execute(params);
		
	}

}
