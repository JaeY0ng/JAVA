package CH25;

class IncrementThread implements Runnable {
	private static int counter = 0;

	// lock object 설정( 임계영역 접근 여부를 판단하는 기준 )
	private static final Object lock = new Object();

	public int getCounter() {
		return counter;
	}

	@Override
	public void run() {

		for (int i = 0; i < 100000; i++) {
			synchronized (lock) {
				counter++; // 공유변수값증가
				System.out.println(Thread.currentThread().getName() + "s counter : " + counter);

				if (i < 99999) {
					try {
						lock.notifyAll();
						lock.wait(5);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
		}

	}
}

public class C04ThreadMain_Ex_문제코드 {

	public static void main(String[] args) throws InterruptedException {

		IncrementThread incrementThread1 = new IncrementThread();
		IncrementThread incrementThread2 = new IncrementThread();
		IncrementThread incrementThread3 = new IncrementThread();

		Thread thread1 = new Thread(incrementThread1);
		Thread thread2 = new Thread(incrementThread2);
		Thread thread3 = new Thread(incrementThread2);

		thread1.setName("TH1");
		thread2.setName("TH2");
		thread3.setName("TH3");

		thread1.start();
		thread2.start();
		thread3.start();

		// 메인 스레드가 thread1,thread2의 작업이 모두 완료될 때까지 대기하도록 설정
		thread1.join();
		thread2.join();
		thread3.join();

		System.out.println("Final value: " + incrementThread1.getCounter());

	}
}
