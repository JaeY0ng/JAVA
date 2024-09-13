package CH07;

import java.util.Scanner;

public class C01WHILE {

	public static void main(String[] args) {
		
		// 01 while 기본
		// while (조건식) {
		//  조건식이 참인 경우 실행되는 종속 문장 ( 1 개의 행일 때 생략 가능 )
		//}
		
		
		// 탈출용 변수
		// 탈출을 위한 조건식
		// 탈출을 위한 연산식
		
//		int i = 0;
//		while(i<5) {
//			System.out.println("HELLO WORLD");
//			i++;
//		}		
		
		// 02 1 - 10 까지 합
//		int i = 1;
//		int sum = 0;
//		while( i <= 10 ) {
//			System.out.println("i : " + i);
//			sum += i;
//			i++; // i 11 까지 증가
//		}
//		System.out.println("sum : " + sum);
//	}
		//01 1 - N 까지의 합
		
//		Scanner sc = new Scanner(System.in);
//		int n = sc.nextInt();
//		
//		int i = 1;
//		int sum = 0;
//		while( i <= n ) {
//			System.out.println("i : " + i);
//			sum += i;
//			i++;
//		}
//		System.out.printf("%d 부터 %d 까지의 합 : %d\n", 1 ,n, sum);
		
		//02 N - M 까지의 합을 구합니다. ( N < M )
		
//		Scanner sc = new Scanner(System.in);
//		int n = sc.nextInt();
//		int m = sc.nextInt();
//		
//		// 무한 루프 ( 같은 수 입력 방지 )
//		while ( n == m ) {
//			System.out.println("같은 수가 입력 되었습니다. 다시 입력하세요 . . ");
//			n = sc.nextInt();
//			m = sc.nextInt();
//		}
//		
//		
//		// n >= m 인 경우 Swap
//		int tmp;
//		if( n >= m ) {
//			tmp = m;
//			m = n;
//			n = tmp;
//		}
//		System.out.println(" n < m 인 상황입니다. n : " + n + " m : " + m );
//		
//		int i = n;
//		int sum = 0;
//		while ( i <= m ) {
//			System.out.println("i : " + i );
//			sum += i;
//			i++;
//		}
		
		
		//03 01 1 - N 까지 수중에 짝수 / 홀수 의 합을 각각 출력
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int i = 1;
		int oddSum = 0;
		int evenSum = 0;
		while( i<= n ) {
			if(i%2==0) {
				System.out.printf("%d는 짝수\n",i);
				evenSum += i;
			}else {
				System.out.printf("%d는 홀수\n",i);
				oddSum += i;
			}
			i++;
		}
		
		
		
		//04 1 - N 까지 수중에 3의 배수만 출력하고 그 합도 출력
		//05 1 - N 까지 수중에 4의 배수를 출력하고 4의 배수가 아닌 나머지의 합을 구하세요
		//06 구구단 2 단 출력
		//07 구구단 N 단출력 ( n<=9 )
		
		// 구구단 2 단
//		int i = 2;
//		int j = 1;
//		while ( i <= 9) {
//			while( j <= 9 ){
//				System.out.println(i + "X" + j + " = " + (i*j) );
//				j++;
//			}
//		}
//		
		// 구구단 2 ~ 9 단
		
//		int i = 2;
//		int j = 1;
//		while ( i <= 9) {
//			while( j <= 9 ){
//				System.out.println(i + "X" + j + " = " + (i*j) );
//				j++;
//			}
//			j = 1;
//			i++;
//		}
		
	}
}
