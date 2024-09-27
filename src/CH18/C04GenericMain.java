package CH18;

class Animal{}

class Tiger{
	String name;
	// 모든 인자 받는 생성자

	public Tiger(String name) {
		super();
		this.name = name;
	}

	@Override
	public String toString() {
		return "Tiger [name=" + name + "]";
	}
	
	// toString()
	
}

class Panda{
	String name;
	// 모든 인자 받는 생성자

	public Panda(String name) {
		super();
		this.name = name;
	}

	@Override
	public String toString() {
		return "Panda [name=" + name + "]";
	}
	
	// toString()
	
	
}

public class C04GenericMain {
	
	public static <T> void PrintInfo(T[] arr) {
		for(T el : arr)
			System.out.println(el);
	}

	public static void main(String[] args) {
		Tiger[] arr1 = {new Tiger("시베리안"),new Tiger("뱅갈"),new Tiger("백두산"),};
		 PrintInfo(arr1);
		 Panda[] arr2 = {new Panda("시베리안"),new Panda("뱅갈"),new Panda("백두산"),};
		 PrintInfo(arr2);
		
	}

}
