package day15.exercise;

public class ThreadLab {

	public static void main(String[] args) throws Exception {
		Thread mainThread = Thread.currentThread();

		WorkerThread1 thread1 = new WorkerThread1();
		WorkerThread2 thread2 = new WorkerThread2();
		WorkerThread3 thread3 = new WorkerThread3();
		WorkerThread4 thread4 = new WorkerThread4();

		thread1.start();
		thread2.start();
		thread3.start();
		thread4.start();
		thread1.join();
		thread2.join();
		thread3.join();
		thread4.join();

		System.out.println(mainThread.getName() + " 수행 종료");

	}

}

class WorkerThread1 extends Thread {
	public void run() { //메서드 오버라이딩시에는 조상에 throws절 없으면 자손에서도 구현 못함.
		for (int i = 65; i < 77; i++) {
			System.out.println("자식 스레드1 : " + (char) i);
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

	}
}

class WorkerThread2 extends Thread {
	public void run() {
		for (int i = 97; i < 105; i++) {
			System.out.println("자식 스레드2 : " + (char) i);
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

class WorkerThread3 extends Thread {
	public void run() {
		for (int i = 1; i < 31; i++) {
			System.out.println("자식 스레드3 : " + i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

class WorkerThread4 extends Thread {
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println("자식 스레드4 : " + "JAVA");
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
