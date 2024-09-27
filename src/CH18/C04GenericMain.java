package CH18;

class Animal{}

class Tiger extends Animal{
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

class Panda extends Animal{
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

class Cat extends Animal{
	String name;
	
	public Cat(String name) {
		super();
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "Cat [name=" + name + "]";
	}
}

public class C04GenericMain {
	
	public static <T extends Animal> void PrintInfo(T[] arr) {
		for(T el : arr)
			System.out.println(el);
	}
	public static void PrintInfo2(Object[] arr) {
		for(Object el : arr)
			System.out.println(el);
	}

	public static void main(String[] args) {
		Tiger[] arr1 = {new Tiger("시베리안"),new Tiger("뱅갈"),new Tiger("백두산"),};
		 PrintInfo(arr1);
		 Panda[] arr2 = {new Panda("시베리안"),new Panda("뱅갈"),new Panda("백두산"),};
		 PrintInfo(arr2);
		 System.out.println("-------------");
		 Object[] arr3 = {new Tiger("시베리안"),new Panda("뱅갈"),new Cat("백두산"),};
		 PrintInfo2(arr3);
		
	}

}
