package CH10;

public class C01얕은복사깊은복사 {

	public static void main(String[] args) {
		// 얕은복사 ( 주소 복사 )

		int arr1[] = { 10, 20, 30 }; ///
		int arr2[];
		arr2 = arr1;
		arr1[0] = 100;

		for (int val : arr2) {
			System.out.print(val + " ");
		}
		System.out.println();

		// 깊은 복사 ( 값 복사 )
		int arr3[] = new int[3];
		for (int i = 0; i < arr3.length; i++) {
			arr3[i] = arr1[i];
		}
		System.out.println("arr1 : " + arr1);
		System.out.println("arr3 : " + arr3);
	}

}
