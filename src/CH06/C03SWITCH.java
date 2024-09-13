package CH06;

import java.util.Scanner;

public class C03SWITCH {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int num = -1;
		while(true) {
			System.out.println("-----------M E N U-------------");
			System.out.println("1 도서 조회");
			System.out.println("2 도서 조회");
			System.out.println("3 도서 조회");
			System.out.println("4 도서 조회");
			System.out.println("5 종료");
			System.out.println("-----------M E N U-------------");
			System.out.print("번호입력 : ");
			num = sc.nextInt();
		}
	}

}
