package CH17;

class A {
	public void Ex1() {
		
	}
}
class B {
	public void Ex2(A a) {
		a.Ex1();
	}
}


public class C05ThrowAndThrowsMain {

	public static void main(String[] args) {
		
		System.out.println("실행코드 1");
		System.out.println("실행코드 2");
		A a = new A();
		B b = new B();
		b.Ex2(a);
		System.out.println("실행코드 3");
	}

}
