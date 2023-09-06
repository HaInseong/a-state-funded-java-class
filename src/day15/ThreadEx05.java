package day15;

class ThreadEx05 {
	static long startTime = 0;

	public static void main(String args[]) throws InterruptedException {
		startTime = System.currentTimeMillis();
		ThreadEx5_1 th1 = new ThreadEx5_1();
		th1.start();
		for (int i = 0; i < 20; i++) {
			System.out.print("-");
			Thread.sleep(1000);
		}

		System.out.print("소요시간:" + (System.currentTimeMillis() - ThreadEx05.startTime));
	}
}

class ThreadEx5_1 extends Thread { //워커 스레드(추가 스레드) = 메인스레드와 동시에 번갈아가면서 출력된다.
	public void run() {
		for (int i = 0; i < 20; i++) {
			try {
				System.out.print("|");
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
