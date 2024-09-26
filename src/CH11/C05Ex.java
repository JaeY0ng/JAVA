package CH11;


class ShopService{
	
	private static ShopService instance;
	
	private ShopService() {};
	static ShopService getInstance() {
		if(instance==null)
			instance = new ShopService();
		return instance;
	}
	
}
public class C05Ex {
	public static void main(String[] args) {
		//---------------------------------------
		//Practice
		//---------------------------------------
		//shopService 객체를 싱글톤으로 만들어 보세요 
		ShopService obj1 = ShopService.getInstance();
		ShopService obj2 = ShopService.getInstance();
		if (obj1 == obj2) {
			System.out.println("같은 ShopService 객체입니다.");
		} else {
			System.out.println("다른 ShopService 객체 입니다.");
		}
	}
}
