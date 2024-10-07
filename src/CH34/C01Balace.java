package CH34;

class Balance{
	private String name;
	private int age;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		if(0<name.length() && name.length() < 5 )
			this.name = name;
		else {
			System.out.println("이름의 길이가 잘못 되었습니다");
		}
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		if (0 < age && age < 100)
			this.age = age;
		else {
			System.out.println("너무 어리거나, 너무 많습니다");
		}
	}
	@Override
	public String toString() {
		return "Balance [name=" + name + ", age=" + age + "]";
	}

	
	
}


public class C01Balace {

	public static void main(String[] args) {

		Balance balance = new Balance();
		balance.setAge(100);
		System.out.println(balance.getAge());
		
		balance.setName("이재용가리빠리");
		System.out.println(balance.getName());
		
		System.out.println(balance);
	}

}
