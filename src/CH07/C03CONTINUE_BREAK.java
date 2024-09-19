package CH07;

import java.util.Scanner;

public class C03CONTINUE_BREAK {

	public static void main(String[] args) {

		
//       BREAK
		
		// -1 을 입력하기 전까지 계속 정수값을 받아 누적 합 계산
		Scanner sc = new Scanner(System.in);
		int n;
		int sum = 0;
		while(true) {
			n = sc.nextInt();
			if(n == -1)
				break;
			sum+=n;
		}
		System.out.println("sum : " + sum);
		

//       CONTINUE
	}

}
