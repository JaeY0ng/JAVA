package CH13;

// 상위클래스
class Point2D {
	int x;
	int y;
	Point2D(){
		System.out.println("Point2D() 생성자 호출 !");
	}
	Point2D(int x){
		this.x = x;
		System.out.println("Point2D(int x) 생성자 호출 !");
	}
	Point2D(int x, int y){
		this.x = x;
		this.y = y;
		System.out.println("Point2D(int x, int y) 생성자 호출 !");
	}
	
	@Override
	public String toString() {
		return "Point2D [x=" + x + ", y=" + y + "]";
	}
	//

}

// 하위클래스
class Point3D extends Point2D {
	int z;

	Point3D(){
		super();        // 상속관계의 상위 클래스의 생성자 호출
		System.out.println("Point3D() 생성자 호출 !");
	}
	Point3D(int x){
		super(x);       
		System.out.println("Point3D(int x) 생성자 호출 !");
	}
	Point3D(int x, int y){
		super(x,y);        
		System.out.println("Point3D(int x, int y) 생성자 호출 !");
	}
	Point3D(int x, int y, int z){
		super(x,y);    
		this.z = z;
		System.out.println("Point3D(int x, int y, int z) 생성자 호출 !");
	}
	@Override
	public String toString() {
		return "Point3D [z=" + z + ", x=" + x + ", y=" + y + "]";
	}

}

public class C02InheritanceMain {

	public static void main(String[] args) {
		
//		Point3D p3 = new Point3D();
//		Point3D p3 = new Point3D(10, 20);		
		Point3D p3 = new Point3D(10, 20, 30);		
		System.out.println(p3);
	}
	
}
