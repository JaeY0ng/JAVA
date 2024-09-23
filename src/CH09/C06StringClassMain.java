package CH09;

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
		
	   
	}

}
