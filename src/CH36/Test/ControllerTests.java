package CH36.Test;

import java.util.HashMap;
import java.util.Map;

import org.junit.jupiter.api.Test;

import CH36.Controller.FrontController;
import CH36.Domain.Common.DTO.BookDTO;

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
	
	@Test
	void FcControllerTests_3() {
		// 요청사항 받을 FC 생성
		FrontController fc = new FrontController();
		// 전달할 파라미터 준비
		Map<String,Object> params = new HashMap();
		params.put("endPoint", "/book");
		params.put("serviceNo", 1);
		params.put("bookDTO", new BookDTO(11223344L,"","한빛미디어","1234"));
		//요청사항 전달
		Map<String,Object> rValue = fc.execute(params);
		boolean isSuccess = (Boolean)rValue.get("success");
		String message = (String)rValue.get("message");
		System.out.println("성공여부 : " + isSuccess);
		System.out.println("message : " + message);
		
	}

	@Test
	void FcControllerTests_4() {
		// 요청사항 받을 FC 생성
		FrontController fc = new FrontController();
		// 전달할 파라미터 준비
		Map<String,Object> params = new HashMap();
		params.put("endPoint", "/book");
		params.put("serviceNo", 1);
		params.put("bookDTO", new BookDTO(99999L,"자바의정석","한빛미디어","1234"));
		//요청사항 전달
		Map<String,Object> rValue = fc.execute(params);
		//확인
		boolean isSuccess = (Boolean)rValue.get("success");
		String message = (String)rValue.get("message");
		Exception ex = (Exception)rValue.get("exception");
		System.out.println("성공여부 : " + isSuccess);
		System.out.println("message : " + message);
		System.out.println("exception : " + ex);
		
	}
	
}
