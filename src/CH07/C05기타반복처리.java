package CH07;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class C05기타반복처리 {

	public static void main(String[] args) {

		List<String> lists = new ArrayList();
		lists.add("JAVA");
		lists.add("JSP / SERVLET");
		lists.add("SPRING STS");
		lists.add("SPRING BOOT");
		lists.add("NODEJS");

		lists.stream().forEach((item) -> {
			System.out.println(item);
		});
		
		Map<String,String> map = new HashMap();
		map.put("k1", "v1");
		map.put("k2", "v2");
		map.put("k3", "v3");
		map.put("k4", "v4");
		map.put("k5", "v5");
		
		for(String key : map.keySet()) {
			System.out.println("KEY : " + key + " VALUE : " + map.get(key));
		}
	}

}
