package CH31;

interface Printer { // 함수형 인터페이스
//	void print(String message);
	String print(String message);
}

public class C02LAMDA {

	public static void main(String[] args) {
		// 01
//		Printer printer = (message)->{
//			System.out.println(message);
//		};
//		printer.print("HELLOWORLD");

		// 02
//		Printer printer = (message)->{
//			return message;
//		};
//		String msg = printer.print("TEST");
//		System.out.println(msg);

		Printer printer = (message) -> message + "!!!";
		String msg = printer.print("TEST");
		System.out.println(msg);
	}

}
