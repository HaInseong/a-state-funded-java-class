package day15;

public class ThreadEx10 {
	public static void main(String[] args) {
		StatePrintThread statePrintThread = new StatePrintThread(new TargetThread());
		statePrintThread.start();
	}
}

class StatePrintThread extends Thread {
	private Thread targetThread;

	public StatePrintThread(Thread targetThread) { //생성자, targetThread를 감시하는 역할의 스레드 클래스 생성
		this.targetThread = targetThread;
	}

	public void run() {
		while (true) {
			Thread.State state = targetThread.getState();
			System.out.println("타겟 스레드 상태: " + state);
			if (state == Thread.State.NEW) {
				System.out.println("START"); //스레드 객체는 생성되어있다는 의미
				targetThread.start(); //Runnable 상태로 들어감.
				// sleep() == TIMED_WAITING
				// join() == WAITING
			}
			if (state == Thread.State.TERMINATED) {
				break;
			}
			try {
				// 0.5초간 일시 정지
				Thread.sleep(50);
			} catch (Exception e) {
			}
		}
	}
}

class TargetThread extends Thread {
	public void run() {
		for (long i = 0; i < 1000000000; i++) {
		}

		try {
			Thread.sleep(1500); //TIMED_WAITING 상태 진입
		} catch (Exception e) {
		}

		for (long i = 0; i < 1000000000; i++) {
		}
	}
}