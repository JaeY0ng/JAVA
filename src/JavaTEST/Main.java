package JavaTEST;

class Buyer { // 구매자 Class
	private int myMoney; // 구매자 보유 금액
	private int appleCnt; // 구매자 상품 보유 개수

	public Buyer(int money, int cnt) {
		super();
		this.myMoney = money;
		this.appleCnt = cnt;
	}

	public void payment(Seller seller, int money) { // 판매자 이름과 구매할 금액 입력

		this.myMoney -= money; // 구매자 보유금액 차감

		int receiveGoods = seller.receive(money); // 판매자에게 금액 전달

		this.appleCnt += receiveGoods; // 상품 개수 누적
	}

	@Override
	public String toString() {
		return "구매자(Buyer) : 보유금액 = " + myMoney + ", 보유 상품 개수 = " + appleCnt + "개";
	}
}

class Seller {
	private int myMoney;
	private int appleCnt;
	private int price;

	public Seller(int money, int cnt, int price) {
		super();
		this.myMoney = money; // 판매자의 보유 금액
		this.appleCnt = cnt; // 상품 개수
		this.price = price; // 상품 개당 가격
	}

	public int receive(int money) {
		this.myMoney += money; // 구매자로 부터 받은 돈 누적

		int returnCnt = money / price; // 받은 액수 / 상품 1개 가격 = 전달할 상품 개수

		this.appleCnt = returnCnt; // 보유한 상품 개수에서 전달할 상품 개수 차감

		return returnCnt; // 전달할 상품 개수 return
	}

	@Override
	public String toString() {
		return "판매자(Seller) : 보유금액 = " + myMoney + "원, 보유상품 개수 = " + appleCnt + "개, 상품개당 가격 = " + price + "원";
	}

}

public class Main {

	public static void main(String[] args) {

		Buyer 박재영 = new Buyer(20000, 0);
		Buyer 지윤서 = new Buyer(30000, 0);

		Seller 이재용 = new Seller(10000, 200, 2000);
		Seller 정민수 = new Seller(15000, 300, 1500);

		박재영.payment(이재용, 10000);
		지윤서.payment(정민수, 20000);

		System.out.println(박재영);
		System.out.println(지윤서);
		System.out.println(이재용);
		System.out.println(정민수);
	}

}
