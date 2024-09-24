package CH12;





public class Main {

	public static void main(String[] args) {
		
		Buyer 홍길동 = new Buyer(10000,0);
		Buyer 김철수 = new Buyer(20000,0);
		
		Seller 사과장수 = new Seller(100000,100,1000);
		
		홍길동.payment(사과장수, 5000);
		김철수.payment(사과장수, 12000);
		
		System.out.println(홍길동);
		System.out.println(김철수);
		System.out.println(사과장수);
	}

}
