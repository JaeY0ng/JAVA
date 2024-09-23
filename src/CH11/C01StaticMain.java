package CH11;

class C01Simple{
	static int num1; // 공유 메모리 영역 ( 클래스 , 메서드 영역 ) 에 할당
	int num2;		 // 객체 생성과는 무관하게 사용가능 ( 클래스명.static 변수명)
	
	C01Simple(){
		this.num1 = 0;
		this.num2 = 0;
	}

	@Override
	public String toString() {
		return "C01Simple [num2=" + num2 + "]";
	}
}


public class C01StaticMain {
	public static void main(String[] args) {
		C01Simple.num1 = 100;
		System.out.println("num1 : " + C01Simple.num1);
	}
}
