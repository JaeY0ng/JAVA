package CH13;

class Super{
	int n1;
}
class Sub extends Super{
	int n2;
}

public class C06UpDownCastingMain {

	public static void main(String[] args) {
		//NoCasting
		Super ob1 = new Super();
		ob1.n1=100;
		Sub ob2 = new Sub();
		ob2.n1=100;
		ob2.n2=200;
		
		//UpCasting(상위클래스형 참조변수 = 하위클래스형 객체),자동형변환
		Super ob3 = new Sub();
		ob3.n1=100;
		//ob3.n2=200;
		Super ob4 = ob2;
		ob4.n1=400;
		//ob4.n2=200;
		
		//DownCasting(하위클래스형 참조변수 = 상위클래스형 객체),강제형변환
		//Upcasting을 전제로 확장된(추가된)멤버에 접근하기 위해 사용
		
		//
		//Sub ob5 = (Sub)new Super();
		
		Sub down=(Sub)ob3;
		down.n1=10;
		down.n2=20;
		

	}

}