package day15;
//조인 메서드 사용한 예제
public class ThreadEx09 {
	public static void main(String[] args) throws Exception {
		Thread mainThread = Thread.currentThread();
		System.out.println("[ 프로그램 시작 스레드 이름 ] : " + mainThread.getName());
		System.out.println("-------------------------------");
		ThreadD threadA = new ThreadD();
		System.out.println("작업 스레드 이름: " + threadA.getName());

		ThreadE threadB = new ThreadE("ThreadE");
		System.out.println("작업 스레드 이름: " + threadB.getName());

		ThreadF threadC = new ThreadF();
		System.out.println("작업 스레드 이름: " + threadC.getName());
		threadA.start();
		threadB.start();
		threadC.start();
		threadA.join(); //해당 스레드 객체의 기능이 끝날 때 까지 메인스레드는 일시정지 하는 기능
		threadB.join(); //쓰레드 b라는 객체로 기동된 스레드가 끝날 때 까지 메인 스레드는 대기해라.
		threadC.join(); //자식 스레드 수행이 끝날 때 까지 기다렸다가 메인 스레드를 실행할 때 사용하는 메서드임
		//3개의 워커스레드를 다 실행하고 메인 스레드를 실행하겠다는 의미이다.

		for (int i = 0; i < 3; i++)
			System.out.println("프로그램 시작 스레드 이름: " + mainThread.getName());
	}
}

class ThreadD extends Thread {
	public ThreadD() {
		setName("ThreadD");
	}

	public void run() {
		for (int i = 0; i < 2; i++) {
			System.out.println(getName() + "가 출력한 내용");
		}		
	}
}

class ThreadE extends Thread {
	public ThreadE(String name) {
		super(name);
	}

	public void run() {
		for (int i = 0; i < 2; i++) {
			System.out.println(getName() + "가 출력한 내용");
		}		
	}
}

class ThreadF extends Thread {
	public void run() {
		for (int i = 0; i < 2; i++) {
			System.out.println(getName() + "가 출력한 내용");
		}		
	}
}