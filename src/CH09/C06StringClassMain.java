package CH09;

import CH01.C01SystemOut;

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
	    System.out.println("------------------");
	    System.out.printf("%x\n", System.identityHashCode(str5));
	    str5.append(str1).append(str2).append(str3).append(str4);
	    System.out.printf("%x\n", System.identityHashCode(str5));
	    System.out.println("----------------------");
	}

}
