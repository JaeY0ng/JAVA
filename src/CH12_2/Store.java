package CH12_2;

public class Store {
	private int count;
	private int price;

	public Store(int count, int price) {
		super();
		this.count = count;
		this.price = price;
	}

	public int receive(int money) {
		// - 4 받은 액수 / 사과 1개 가격 -> 전달할 사과 개수
		int returnCount = money / price;
		// - 5 내가 보유한 사과 개수에 전달할 사과개수 차감
		this.count -= returnCount;
		// - 6 전달할 사과개수 리턴
		return returnCount;
	}

	@Override
	public String toString() {
		return "Seller [count=" + count + ", price=" + price + "]";
	}

}
