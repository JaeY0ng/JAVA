package CH07;

import java.util.Scanner;

public class C02WHILE {

	public static void main(String[] args) {
		
		// 별찍기 ( 기본 높이 : 4 )
		
		// *****
		// *****
		// *****
		// *****
//		int i = 0;
//		while( i < 4 ) {
//			
//			int j = 0;
//			while( j < 5 ) {
//				System.out.print("*");
//				j++;
//			}
//			System.out.println();
//			i++;
//		}
//		
//		
//		
//		// 별찍기 ( 높이 : h )
//		Scanner sc = new Scanner(System.in);
//		
//	}
//	
	
	        // 트리 높이를 설정
	        int height = 10;

	        // 트리의 상단부터 출력
	        for (int i = 0; i < height; i++) {
	            // 왼쪽 공백을 출력
	            for (int j = 0; j < height - i - 1; j++) {
	                System.out.print(" ");
	            }
	            // 트리의 별을 출력
	            for (int k = 0; k < (2 * i + 1); k++) {
	                System.out.print("*");
	            }
	            // 한 줄 끝나면 줄 바꿈
	            System.out.println();
	        }

	        // 트리의 밑둥을 출력
	        for (int i = 0; i < height - 1; i++) {
	            System.out.print(" ");
	        }
	        System.out.println("|");
	    }
	}



