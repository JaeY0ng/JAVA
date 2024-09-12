package CH03;

public class C03TypeChange {

	public static void main(String[] args) {
		
		int n1 = 129;		// 00000000 00000000 00000000 10000001
		int n2 = 130;       // 00000000 00000000 00000000 10000010
		byte n3 = (byte)n1; // 10000001
		byte n4 = (byte)n2; // 10000010
		
		System.out.printf("%d\n", n1);
		System.out.printf("%d\n", n2);
		
		System.out.printf("%d\n", n3);
		System.out.printf("%d\n", n4);
	}

}
