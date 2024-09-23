package CH09;

import java.util.Scanner;

public class C06StringClassMain {

	public static void main(String[] args) {
		String str1 = "Java Powerful";
		String str2 = new String("java Programming");
		String str3 = str1 + str2;
		String str4 = str1.concat(str2);
		
		//문자열 확인
		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str3);
		System.out.println(str4);
		//위치확인
	    System.out.printf("%x\n", System.identityHashCode(str1));
	    System.out.printf("%x\n", System.identityHashCode(str2));
	    System.out.printf("%x\n", System.identityHashCode(str3));
	    System.out.printf("%x\n", System.identityHashCode(str4));
		
	   //StringBuilder , StringBuffer
	    StringBuffer str5 = new StringBuffer();
	    System.out.println("----------------------");
	    System.out.printf("%x\n", System.identityHashCode(str5));
	    str5.append(str1).append(str2).append(str3).append(str4);
	    System.out.printf("%x\n", System.identityHashCode(str5));
	    System.out.println(str5);
	    System.out.println("----------------------");
	    
	    System.out.println("문자열 길이 : " + (str1.length()));
	    System.out.println("문자 찾기 : " + (str1.charAt(1)));
//	    Scanner sc = new Scanner (System.in);
//	    char ch = sc.next().charAt(1);
//	    System.out.println("ch : " + ch);
	    
	    System.out.println("문자찾기 : " + (str1.indexOf("a")));
	    System.out.println("문자찾기 : " + (str1.lastIndexOf("a")));
	    
	    System.out.println("문자 포함여부 : " + (str1.contains("va")));
	    System.out.println("문자 포함여부 : " + (str1.contains("abs")));
	}

}
