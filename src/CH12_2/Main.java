package CH12_2;





public class Main {

	public static void main(String[] args) {
		
		Buyer 홍길동 = new Buyer(10000,0);
		Buyer 남길동 = new Buyer(20000,0);
		Buyer 서길동 = new Buyer(30000,0);
		
		Store GS감삼편의점 = new Store(100,1000);
		Store GS동성로편의점 = new Store(200,1000);
		
		홍길동.payment(GS감삼편의점, 1000);
		남길동.payment(GS감삼편의점, 3000);
		서길동.payment(GS동성로편의점, 10000);
		
		System.out.println("홍길동 " + 홍길동);
		System.out.println("남길동 " + 남길동);
		System.out.println("서길동 " + 서길동);
	}

}
