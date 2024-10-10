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
		// 별찍기(기본높이:4)
		// *****
		// *****
		// *****
		// *****

		// *
		// **
		// ***
		// ****

		// ****
		// ***
		// **
		// *

		// *
		// ***
		// *****
		// *******

		// *******
		// *****
		// ***
		// *

		// *
		// ***
		// *****
		// *******
		// *****
		// ***
		// *

		// *******
		// *****
		// ***
		// *
		// *
		// ***
		// *****
		// *******

		// 별찍기(기본높이:h)

//		Scanner sc = new Scanner(System.in);
//		
//	}
//	

		// 트리 높이를 설정
//	        int height = 10;
//
//	        // 트리의 상단부터 출력
//	        for (int i = 0; i < height; i++) {
//	            // 왼쪽 공백을 출력
//	            for (int j = 0; j < height - i - 1; j++) {
//	                System.out.print(" ");
//	            }
//	            // 트리의 별을 출력
//	            for (int k = 0; k < (2 * i + 1); k++) {
//	                System.out.print("*");
//	            }
//	            // 한 줄 끝나면 줄 바꿈
//	            System.out.println();
//	        }
//
//	        // 트리의 밑둥을 출력
//	        for (int i = 0; i < height - 1; i++) {
//	            System.out.print(" ");
//	        }
//	        System.out.println("|");
//	        

		// 트리 높이를 설정합니다.
//	                int height = 10;
//
//	                // 트리의 상단부터 출력합니다.
//	                for (int i = height - 1; i >= 0; i--) {
//	                    // 왼쪽 공백을 출력합니다.
//	                    for (int j = 0; j < height - i - 1; j++) {
//	                        System.out.print(" ");
//	                    }
//	                    // 트리의 별을 출력합니다.
//	                    for (int k = 0; k < (2 * i + 1); k++) {
//	                        System.out.print("*");
//	                    }
//	                    // 한 줄 끝나면 줄 바꿈합니다.
//	                    System.out.println();
//	                }
//
//	                // 트리의 밑둥을 출력합니다.
//	                for (int i = 0; i < height - 1; i++) {
//	                    System.out.print(" ");
//	                }
//	                System.out.println("|");
//	            }

		// ****
		// ***
		// **
		// *

//		int i = 0;
//		while(i<4) {
//			int j =0;
//			while(j < 4-i ) {
//				System.out.print("*");
//				j++;
//			}
//			System.out.println();
//			i++;
//		}
//	

		// *
		// ***
		// *****
		// *******

//		Scanner sc = new Scanner(System.in);
//		int h = sc.nextInt();
//		int i = 0;
//		while( i < h ) {
//			
//			int j = 0;
//			while( j < h-i ) {
//				System.out.print("*");
//				j++;
//			}
//			System.out.println();
//			i++;
//		}
//	
//		   *   
//		  ***
//		 *****
//		*******

		// i = 층
		// j = 왼쪽 공백 개수
		// k = 별의 개수
//	     int height = 4; // 트리의 높이
//	     
//	        for (int i = height; i >= 1; i--) {
//	            
//	        	
//	            for (int j = 1; j <= height - i; j++) { // 공백 출력
//	                System.out.print(" ");
//	            }
//	            
//	            for (int k = 1; k <= 2 * i - 1; k++) { // 별 출력
//	                System.out.print("*");
//	            }
//	            System.out.println(); // 줄바꿈
//	        }

		// 2단 - 9단 출력
//		int dan=2;
//		while(dan<=9) {
//			
//			int i=1;
//			while(i<=9) {
//				System.out.printf("%d x %d = %d\n", dan,i,dan*i);
//				i++;
//			}
//			System.out.println();
//			dan++;
//		}

		// 2단 - 9단 출력 (2x9,2x8 ,.... 9x9 ,...9x1)
//		int dan=2;
//		while(dan<=9) {
//			
//			int i=9;
//			while(i>=1) {
//				System.out.printf("%d x %d = %d\n", dan,i,dan*i);
//				i--;
//			}
//			System.out.println();
//			dan++;
//		}

		// 9단 - 2단( 9x9 9x8 - 2x1)
//		int dan=9;
//		while(dan>=2) {
//			
//			int i=9;
//			while(i>=1) {
//				System.out.printf("%d x %d = %d\n", dan,i,dan*i);
//				i--;
//			}
//			System.out.println();
//			dan--;
//		}

		// 2단 - N단(N<9)

//		Scanner sc = new Scanner(System.in);
//		int n = sc.nextInt();
//		
//		while(n>10||n<=2) {
//			System.out.println("다시입력하세요.");
//			n = sc.nextInt();
//		}
//		
//		int dan=2;
//		while(dan<=n) {
//			
//			int i=1;
//			while(i<=9) {
//				System.out.printf("%d x %d = %d\n", dan,i,dan*i);
//				i++;
//			}
//			System.out.println();
//			dan++;
//		}

		// N단 - M단(N<M , N<9 , M<9)
//		Scanner sc = new Scanner(System.in);
//		int n = sc.nextInt();
//		int m = sc.nextInt();
//		
//		while(n>=m) {
//			System.out.println("다시입력하세요.");
//			n = sc.nextInt();
//			m = sc.nextInt();
//		}
//		
//		int dan=n;
//		while(dan<=m) {
//			
//			int i=1;
//			while(i<=9) {
//				System.out.printf("%d x %d = %d\n", dan,i,dan*i);
//				i++;
//			}
//			System.out.println();
//			dan++;
//		}

		// 별찍기(기본높이:4)

		// *****
		// *****
		// *****
		// *****
//		i(행)	j(별)
//		0	0-4
//		1	0-4
//		2	0-4
//		3	0-4
//		i=0	j=0
//		i++	j++
//		i<4	j<5

//		int i = 0;
//		while(i<4) {
//			
//			int j=0;
//			while(j<5) {
//				System.out.print("*");
//				j++;
//			}
//
//			System.out.println();
//			i++;
//		}

		// *
		// **
		// ***
		// ****
//		i(행)	j(별)
//		0	0-0
//		1	0-1-
//		2	0-2
//		3	0-3
//		------------------
//		i=0	j=0
//		i++	j++
//		i<4	j<=i

//		int i=0;
//		while(i<4) {
//			
//			int j=0;
//			while(j<=i) {
//				System.out.print("*");
//				j++;
//			}
//			System.out.println();
//			i++;
//		}

		// ****
		// ***
		// **
		// *

//		i(행)	j(별)
//		0	0-3
//		1	0-2
//		2	0-1
//		3	0-0
//		-----------------
//		i=0	j=0
//		i++	j++
//		i<4	j<4-i

//		int i=0;
//		while(i<4) {
//			
//			int j=0;
//			while(j<4-i) {
//				System.out.print("*");
//				j++;
//			}
//			System.out.println();
//			i++;
//		}

		// *
		// ***
		// *****
		// *******

//		i(행) 		j(공백)		k(별)
//		0		0-2				0-0
//		1		0-1				0-2
//		2		0-0				0-4
//		3		x				0-6
//		-----------------------------------------
//		i=0		j=0				k=0
//		i++		j++				k++
//		i<4		j<3-i			k<=2*i

//		int i=0;
//		while(i<4) {	
//			//공백
//			int j=0;
//			while(j<3-i) {
//				System.out.print(" ");
//				j++;
//			}
//			//별
//			int k=0;
//			while(k<=2*i) {
//				System.out.print("*");
//				k++;
//			}
//			System.out.println();
//			i++;
//		}

		// *******
		// *****
		// ***
		// *
//		i(행)		j(공)		k(별)
//		0		x		0-6
//		1		0-0		0-4
//		2		0-1		0-2
//		3		0-2		0-0
//		-----------------------------------------------
//		i=0		j=0		k=0
//		i++		j++		k++
//		i<4		j<i		k<=(3*2)-2*i

//		int i=0;
//		while(i<4) {
//			//공백
//			int j=0;
//			while(j<i) {
//				System.out.print(" ");
//				j++;
//			}
//			//별
//			int k=0;
//			while(k<=(3*2)-2*i) {
//				System.out.print("*");
//				k++;
//			}
//			
//			System.out.println();
//			i++;
//		}

		// *
		// ***
		// *****
		// *******
		// *****
		// ***
		// *

//		i(행)		j(공)		k(별)
//		0		0-2		0-0
//		1		0-1		0-2
//		2		0-0		0-4
//		3		x		0-6
//		-------------------------------------------
//				j=0		k=0
//				j++		k++
//				j<3-i		k<=2*i
//
//		4		0-0		0-4
//		5		0-1		0-2
//		6		0-2		0-0
//		-------------------------------------------
//		i=0		j=0		k=0
//		i++		j++		k++
//		i<7		j<=(i-4)	k<=(6*2)-2*i
//		int i=0;
//		while(i<7) {
//			
//			if(i<4) {
//				//공백
//				int j=0;
//				while(j<3-i) {
//					System.out.print(" ");
//					j++;
//				}
//				//별
//				int k=0;
//				while(k<=2*i) {
//					System.out.print("*");
//					k++;
//				}
//				
//				
//			}else {
//				
//				//공백
//				int j=0;
//				while(j<=(i-4)) {
//					System.out.print(" ");
//					j++;
//				}
//				//별
//				int k=0;
//				while(k<=(6*2)-2*i) {
//					System.out.print("*");
//					k++;
//				}
//			}
//			
//			System.out.println();
//			i++;
//		}

		// *******
		// *****
		// ***
		// *
		// *
		// ***
		// *****
		// *******

		// 별찍기(기본높이:h)
//		높이 : h
//		i(행)	j(별)
//		0	0-4
//		1	0-4
//		2	0-4
//		3	0-4
//		---------------
//		i=0	j=0
//		i++	j++
//		i<h	j<5
		//
//		Scanner sc = new Scanner(System.in);
//		int h = sc.nextInt();
//		int i = 0;
//		while(i<h) {
//			
//			int j=0;
//			while(j<5) {
//				System.out.print("*");
//				j++;
//			}
//
//			System.out.println();
//			i++;
//		}
//		

		// *
		// **
		// ***
		// ****
//		입력:h
//		i(행)	j(별)
//		0	0-0
//		1	0-1-
//		2	0-2
//		3	0-3
//		------------------
//		i=0	j=0
//		i++	j++
//		i<h	j<=i
//		
//		Scanner sc = new Scanner(System.in);
//		int h = sc.nextInt();
//		int i=0;
//		while(i<h) {
//			
//			int j=0;
//			while(j<=i) {
//				System.out.print("*");
//				j++;
//			}
//			System.out.println();
//			i++;
//		}

//		입력:h
//		i(행)	j(별)
//		0	0-3
//		1	0-2
//		2	0-1
//		3	0-0
//		-----------------
//		i=0	j=0
//		i++	j++
//		i<h	j<h-i

//		Scanner sc = new Scanner(System.in);
//		int h = sc.nextInt();
//		int i=0;
//		while(i<h) {
//			
//			int j=0;
//			while(j<h-i) {
//				System.out.print("*");
//				j++;
//			}
//			System.out.println();
//			i++;
//		}
//		

		// *
		// ***
		// *****
		// *******
//		Scanner sc = new Scanner(System.in);
//		int h = sc.nextInt();
//		int i=0;
//		while(i<h) {	
//			//공백
//			int j=0;
//			while(j<(h-1)-i) {
//				System.out.print(" ");
//				j++;
//			}
//			//별
//			int k=0;
//			while(k<=2*i) {
//				System.out.print("*");
//				k++;
//			}
//			System.out.println();
//			i++;
//		}

		// *******
		// *****
		// ***
		// *
//		입력:h
//		i(행)		j(공)		k(별)
//		0		x		0-6
//		1		0-0		0-4
//		2		0-1		0-2
//		3		0-2		0-0
//		-----------------------------------------------
//		i=0		j=0		k=0
//		i++		j++		k++
//		i<h		j<i		k<((h-1)*2)-2*i

//		Scanner sc = new Scanner(System.in);
//		int h = sc.nextInt();
//		int i=0;
//		while(i<h) {
//			//공백
//			int j=0;
//			while(j<i) {
//				System.out.print(" ");
//				j++;
//			}
//			//별
//			int k=0;
//			while(k<=((h-1)*2)-2*i) {
//				System.out.print("*");
//				k++;
//			}
//			
//			System.out.println();
//			i++;
//		}

		//
//	    
//	      int height = 5;
//	      
//	      for (int i = height; 0 < i ; i--) {
//	    	  for (int j = 0; j < height - i  ; j++) {
//	    		  System.out.print(" ");
//	    	  }
//	    	  for (int k = 1; k <= 2 * i - 1; k++) {
//	    		  System.out.print("*");
//	    	  }
//			System.out.println();
//		}
//	   

//		Scanner sc = new Scanner(System.in);
//		int height = sc.nextInt();
//		 
//		int height = 9;
//		for (int i = height; i > 0; i--) {
//			if(height / 2 + 1 >= i){
//			for (int j = 1; j <= height - i; j++) {
//				System.out.print(" ");
//			}
//			for (int k = 0; k < 2 * i - 1; k++) {
//				System.out.print("*");
//			}
//			} else {
//			for (int j = 1; j <= height - i; j++) {
//				System.out.print(" ");
//			}
//			for (int k = 0; k < (6*2)-2*i; k++) {
//				System.out.print("*");
//			}
//			}
//			System.out.println();
//		}

//	      int height = 5;
//	      
//	      for (int i = 0 ; i <= 5; i++) {
//			for (int j = 0; j < i ; j++) {
//				System.out.print(" ");
//			}
//			for (int k = 9 ; k >= 2*i + 1 ; k--) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
	}
}
