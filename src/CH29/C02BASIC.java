package CH29;

import java.lang.reflect.Method;

class Simple {
	String name;
	int age;
	String addr;
	
	
	//Getter and Setter
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	
	
	// toString 재정의
	@Override
	public String toString() {
		return "Simple [name=" + name + ", age=" + age + ", addr=" + addr + "]";
	}
	
	
}


public class C02BASIC {

	public static void main(String[] args) throws Exception {
		System.out.println(Simple.class);
		Class<?> clazz = Class.forName(String.valueOf(Simple.class).split(" ")[1]);
		Method method = clazz.getDeclaredMethod("getAge", null);
		Object result = method.invoke(new Simple(), null);

		
	}

}
