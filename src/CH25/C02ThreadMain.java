package CH25;

public class C02ThreadMain {

	public static void main(String[] args) throws InterruptedException {

		// Runnable Interface 이용한 스레드 분할

		// 01
		C02Worker1 w1 = new C02Worker1();
		C02Worker2 w2 = new C02Worker2();

		// 02 스레드별 분리
		Thread th1 = new Thread(w1);
		Thread th2 = new Thread(w2);

		// 03 스레드 실행
		th1.start();
		th2.start();


		// ----------------------
		// Thread 를 이용한 스레드 분
		// ----------------------
		new Thread() {
			@Override
			public void run() {
				for(int i = 0; i < 5; i++) {
					System.out.println("TASK03..");
					try {
						Thread.sleep(300);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
		}.start();

		// 04 MAIN THREAD 작업
		for (int i = 0; i < 10; i++) {
			System.out.println("MAIN THREAD...");
			Thread.sleep(500);
		}
	}

}
