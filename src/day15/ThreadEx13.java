package day15;

public class ThreadEx13 {
	public static void main(String[] args) {
		Thread thread = new PrintThread2();
		thread.start();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
		}

		thread.interrupt();
	}
}

class PrintThread2 extends Thread {
	public void run() {
		while (true) {
			System.out.println("실행 중");
			if (Thread.interrupted()) { //static 메서드, 지금 얘가 interrupted 상태인지 체크하는 메서드
				// 자원 정리
				break;
			}
		}
		System.out.println("자원 정리");
		System.out.println("실행 종료");
	}
}
