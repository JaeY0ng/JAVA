package CH13;

import java.util.Scanner;

public class C04Ex {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int h = sc.nextInt();
		
		int m = 0;
		for (int i = 0; i < h; i++) {
			for (int j = h-1; 0 < j; j--) {
				System.out.print(" ");
			}
			for (int n = 0; n <= m; n++) {
				System.out.print("*");
			}
			System.out.println();
			m += 2;
		}
		
		
		
//		for (int i = 0; i < h; i++) {
//			for (int j = 0; j <= i; j++) {
//				
//				System.out.print("*");
//			}
//			System.out.println();
//		}
//		
	}

}
