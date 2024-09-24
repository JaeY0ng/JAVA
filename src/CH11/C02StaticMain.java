package CH11;

class C02Simple {
	int n1;
	static int n2;

	void func1() {
		n1 = 10;
		n2 = 20;
	}

	static void func2() {
		n2 = 10; // static 함수는 객체 생성 이전에 만들어지므로 static 객체 말고는 접근 X
	  //n1 = 20; X
	}
	
}

public class C02StaticMain {
	
	public static void main(String[] args) {
		
	}

}
