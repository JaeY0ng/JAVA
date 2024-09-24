//package CH13;
//
//// 상위클래스
//class Point2D {
//	int x;
//	int y;
//	Point2D(){
//		System.out.println("Point2D() 생성자 호출 !");
//	}
//	Point2D(int x){
//		this.x = x;
//		System.out.println("Point2D(int x) 생성자 호출 !");
//	}
//	Point2D(int x, int y){
//		this.x = x;
//		this.y = y;
//		System.out.println("Point2D(int x, int y) 생성자 호출 !");
//	}
//	
//	
//	
//	@Override
//	public String toString() {
//		return "Point2D [x=" + x + ", y=" + y + "]";
//	}
//	//
//
//}
//
//// 하위클래스
//class Point3D extends Point2D {
//	int z;
//
//	Point3D(){
//		System.out.println("Point3D 생성자 호출 !");
//	}
//	@Override
//	public String toString() {
//		return "Point3D [z=" + z + ", x=" + x + ", y=" + y + "]";
//	}
//
//}
//
//public class C01InheritanceMain {
//
//	public static void main(String[] args) {
//		
//		Point3D p3 = new Point3D();
//		p3.x = 10;
//		p3.y = 20;
//		p3.z = 30;
//		System.out.println(p3);
//	}
//
//}
