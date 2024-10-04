package CH31;

interface Calculator{
	int calculate(int num1, int num2);
}

public class C03LAMDA {

	public static void main(String[] args) {
		
		
		
		// 덧셈
		Calculator add = (a,b)-> a + b;
		System.out.println(add.calculate(5, 6));
		
		// 뺄셈
		Calculator sub = (a,b) -> a - b;
		System.out.println(sub.calculate(10, 15));
		
		// 곱셈
		Calculator mul = (a,b) -> a * b;
		System.out.println(mul.calculate(15, 20));
		
		// 나눗셈
		Calculator div = (a, b) -> a / b;
		System.out.println(div.calculate(20, 30));
	}

}
