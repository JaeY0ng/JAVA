package CH18;

class Taste {
	
}

//class 민초 {
//	@Override
//	public String toString() {
//		return"민초";
//	}
//}

class 버터옥수수 extends Taste {
	@Override
	public String toString() {
		return "버터옥수수";
	}
}

class 카라멜 extends Taste {
	@Override
	public String toString() {
		return "카라멜";
	}
}

class PopCorn<T extends Taste> {
	private T Taste;

	PopCorn(T Taste) {
		this.Taste = Taste;
	}

	@Override
	public String toString() {
		return Taste + "맛 팝콘";
	}

}

public class C02GenericMain {

	public static void main(String[] args) {
		PopCorn<카라멜> ob1 = new PopCorn<카라멜>(new 카라멜());
		System.out.println(ob1); // 카라멜맛 팝콘이 출력

		PopCorn<버터옥수수> ob2 = new PopCorn<버터옥수수>(new 버터옥수수());
		System.out.println(ob2);
		
//		PopCorn<민초> ob3 = new PopCorn<민초>(new 민초());
//		System.out.println(ob3);
	}

}
