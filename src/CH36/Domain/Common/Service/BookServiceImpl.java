package CH36.Domain.Common.Service;

public class BookServiceImpl {
	
	//싱글톤 패턴 처리코드
	private BookServiceImpl() {};
	private static BookServiceImpl instance;
	public static BookServiceImpl getInstance() {
		if(instance==null)
			instance = new BookServiceImpl();
		return instance;
	}
}
