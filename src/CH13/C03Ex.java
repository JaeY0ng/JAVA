package CH13;

class Employee {
	public String name;
	private int age;
	private String addr;

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

	public Employee(String name, int age, String addr) {
		super();
		this.name = name;
		this.age = age;
		this.addr = addr;
	}

}

class Parttimer extends Employee {
	int hour_pay;

	public void setHourPay(int hour_pay) {
		this.hour_pay = hour_pay;
	}

	public Parttimer(String name, int age, String addr, int hour_pay) {
		super(name, age, addr);
		this.hour_pay = hour_pay;
	}

	@Override
	public String toString() {
		return  getAddr() + "에 사시는 " + getAge() + "세 "+  name + "님의 시급은 " + hour_pay + "원 입니다.";
	}

}

class Regular extends Employee {
	private int salary;

	public Regular(String name, int age, String addr, int salary) {
		super(name, age, addr);
		this.salary = salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	@Override
	public String toString() {
		return getAddr() + "에 사시는 " + getAge() + "세 "+  name + "님의 월급은 " + salary + "만원 입니다.";
	}

	
	
	
}

public class C03Ex {

	public static void main(String[] args) {
		Parttimer emp1 = new Parttimer("홍길동", 25, "대구", 10000);
		Regular emp2 = new Regular("서길동", 45, "울산", 300);
		
		System.out.println(emp1);
		System.out.println(emp2);
	}

}
