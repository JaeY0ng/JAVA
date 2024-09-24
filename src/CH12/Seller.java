package CH12;

public class Seller {
	private int money;
	private int count;
	private int price;

	public Seller(int money, int count, int price) {
		super();
		this.money = money;
		this.count = count;
		this.price = price;
	}

	public int receive(int money) {
		// - 3 고객으로 부터 돈 받기 -> 내 보유금액 누적
		this.money += money;
		// - 4 받은 액수 / 사과 1개 가격 -> 전달할 사과 개수
		int returnCount = money / price;
		// - 5 내가 보유한 사과 개수에 전달할 사과개수 차감
		this.count -= returnCount;
		// - 6 전달할 사과개수 리턴
		return returnCount;
	}

	@Override
	public String toString() {
		return "Seller [money=" + money + ", count=" + count + ", price=" + price + "]";
	}

}
