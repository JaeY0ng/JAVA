package CH06;

import java.util.Scanner;

public class C01IF {

	public static void main(String[] args) {
		//01_IF기본
		//if(조건식)
		//{
		// 참인 경우 실행되는 종속 문장
		//}
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
		
		
		//02_IF_ELSE
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
		
		//문제
		// 정수 한개 값을 입력받아 3의 배수이면 해당 수를 출력하세요
		// 3의 배수 이면서 5의 배수라면 출력
		
		Scanner sc = new Scanner(System.in);
		System.out.print("3의 배수 or 5의 배수인 정수 입력 : ");
		
		int num = sc.nextInt();
		
		if(num % 3 == 0 || num % 5 == 0) {
			System.out.println(num);
		}else{
			System.out.println("정수가 아니거나 3의 배수, 5의 배수가 아닙니다.");
		}
		
		
		
		
	}

}
