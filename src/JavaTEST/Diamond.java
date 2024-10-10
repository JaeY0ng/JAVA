package JavaTEST;

import java.util.Scanner;

public class Diamond {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("홀수 높이를 입력하세요: ");
		int height = sc.nextInt(); // 높이 height에 저장
		if (height % 2 == 0) {
			System.out.println("홀수 값만 입력해 주세요."); // 홀수가 아닐 경우 예외처리
		} else {
			printDia(height);
		}
	}

	public static void printDia(int height) { // 별 출력 메서드
		int mid = height / 2; // 중간 지점 계산
		for (int i = 0; i <= mid; i++) { // 위쪽 부분 for 문
			for (int j = 0; j < mid - i; j++) { // 공백 출력
				System.out.print(" ");
			}
			for (int j = 0; j < 2 * i + 1; j++) { // 별 출력
				System.out.print("*");
			}
			System.out.println();
		}
		for (int i = mid - 1; i >= 0; i--) { // 아래쪽 for 문
			for (int j = 0; j < mid - i; j++) { // 공백 출력
				System.out.print(" ");
			}
			for (int j = 0; j < 2 * i + 1; j++) { // 별 출력
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
