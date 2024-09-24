package CH12_2;

public class Buyer {

	private int money;
	private int count;

	public Buyer(int money, int count) {
		super();
		this.money = money;
		this.count = count;
	}

	@Override
	public String toString() {
		return "님이 구매한 콜라의 개수는 " + count + "개 이고, 남은 금액은 " + money + "원 입니다.";
	}

	public void payment(Store store, int money) {

		// - 1 고객의 보유금액에서 구매할 정도의 액수를 차감
		this.money -= money;
		// - 2 사과 장수 에게 고객의 보유금액 전달
		int receiveCoke = store.receive(money);
		// - 7 고객속성에 구매한 개수 만큼 차감
		this.count += receiveCoke;
	}
}
