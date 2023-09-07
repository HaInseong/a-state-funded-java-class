package day15;

public class ThreadEx12 {
	public static void main(String[] args) {
		PrintThread1 printThread = new PrintThread1();
		printThread.start();

		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
		}

		printThread.setStop(true);
	}
}

class PrintThread1 extends Thread {
	private boolean stop; //false로 기본값 초기화

	public void setStop(boolean stop) {
		this.stop = stop;
	}

	public void run() {
		while (!stop) { //stop이 false라면 무한 반복
			System.out.println("실행 중");
		}
		System.out.println("자원 정리");
		System.out.println("실행 종료");
	}
}