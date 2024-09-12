package CH06;

import java.util.Scanner;

public class C01IF {

	public static void main(String[] args) {
		// 01_IF기본
		// if(조건식)
		// {
		// 참인 경우 실행되는 종속 문장
		// }
//		Scanner sc = new Scanner(System.in);
//		System.out.print("나이 : ");
//		int age = sc.nextInt();
//		if(age >= 8)
//			System.out.println("학교에 다닙니다");
//		System.out.println("첫번째 IF 블럭 종료");
//		if(age < 8)
//			
//			System.out.println("학교에 다니지 않습니다");
//		System.out.println("두번째 IF 블럭 종료");
//		System.out.println("프로그램을 종료합니다");

		// 02_IF_ELSE
//		Scanner sc = new Scanner(System.in);
//		System.out.print("나이 : ");
//		int age = sc.nextInt();
//		if(age >= 8)
//			System.out.println("학교에 다닙니다");
//		else
//			System.out.println("학교에 다니지 않습니다");
//		System.out.println("두번째 IF 블럭 종료");
//		System.out.println("프로그램을 종료합니다");
//      

		// 문제
		// 정수 한개 값을 입력받아 3의 배수이면 해당 수를 출력하세요
		// 3의 배수 이면서 5의 배수라면 출력
//
//		Scanner sc = new Scanner(System.in);
//		System.out.print("3의 배수 or 5의 배수인 정수 입력 : ");
//
//		int num = sc.nextInt();
//
//		if (num % 3 == 0) {
//			System.out.println(num + " 는 3의 배수 입니다");
//		} else if (num % 5 == 0) {
//			System.out.println(num + " 는 5의 배수 입니다");
//		} else {
//			System.out.println("정수가 아니거나 3의 배수, 5의 배수가 아닙니다.");
//		}
		
		// 문제
		// 두 수를 입력 받아 두 수 중에 큰 수를 출력
//		Scanner sc = new Scanner(System.in);
//		System.out.print("첫 번째 정수 입력 : ");
//		int num1 = sc.nextInt();
//		System.out.print("두 번째 정수 입력 : ");
//		int num2 = sc.nextInt();
//		
//		if(num1 > num2) {
//			System.out.println("더 큰수는 " + num1 + " 입니다.");
//		}else if(num2 > num1) {
//			System.out.println("더 큰수는 " + num2 + " 입니다.");
//		}
		
		
		
		// 문제
		// 세 개의 정수를 입력받아 해당 수의 합과 평균을 출력
//		Scanner sc = new Scanner(System.in);
//		System.out.print("첫 번째 정수 입력 : ");
//		int n1 = sc.nextInt();
//		System.out.print("두 번째 정수 입력 : ");
//		int n2 = sc.nextInt();
//		System.out.print("세 번째 정수 입력 : ");
//		int n3 = sc.nextInt();
//		
//		int sum = n1 + n2 + n3;
//		int Avg = sum / 3 ;
//		
//		
//		System.out.println("");
//		System.out.println("세 수의 합 : " + sum);
//		System.out.println("세 수의 평균 : " + Avg);
		
		
		
		// 문제
		// 세 개의 정수를 입력 받아 가장 큰 수와 가장 작은 수를 각각 출력
		
		
		Scanner sc = new Scanner(System.in);
		System.out.print("첫 번째 정수 입력 : ");
		int n1 = sc.nextInt();
		System.out.print("두 번째 정수 입력 : ");
		int n2 = sc.nextInt();
		System.out.print("세 번째 정수 입력 : ");
		int n3 = sc.nextInt();
		
		if (n1 > n2 && n1 > n3) {
			System.out.println(n1);
		} else if(n2 > n1 && n2 > n3) {
			System.out.println(n2);
		} else if(n3 > n2 && n3 > n1) {
			System.out.println(n3);
		}
	}

}
