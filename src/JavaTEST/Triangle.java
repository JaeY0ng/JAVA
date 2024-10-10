package JavaTEST;

import java.util.Scanner;

public class Triangle {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("별의 높이를 입력하세요 : ");

		int height = sc.nextInt(); // 높이 height에 저장

		int i = 0; // i 0으로 초기화

		while (i < height) { 		// 높이 값 (height) 동안 반복하는 while 문
			int j = 0;
			while (j < (height - 1) - i) {	// 왼쪽 여백 while 문
				System.out.print(" "); 
				j++; 
			}
			int k = 0;	// k 0으로 초기화
			while (k <= 2 * i) {	// 2 * i + 1 만큼 별을 출력	
				System.out.print("*");
				k++; 
			}
			System.out.println();
			i++;
		}
	}
}
