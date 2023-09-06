package day15;

public class ThreadEx08 {
	public static void main(String[] args) {
		Thread mainThread = Thread.currentThread();
		System.out.println("[ 프로그램 시작 스레드 이름 ] : " + mainThread.getName());
		System.out.println("-------------------------------");
		ThreadA threadA = new ThreadA();
		System.out.println("작업 스레드 이름: " + threadA.getName());

		ThreadB threadB = new ThreadB("ThreadB");
		System.out.println("작업 스레드 이름: " + threadB.getName());

		ThreadC threadC = new ThreadC(); //따로 이름을 지정하는 부분이 없으므로 JVM이 알아서 자동으로 이름을 부여해줌.
		System.out.println("작업 스레드 이름: " + threadC.getName());

		//스레드는 스레드 객체마다 satrt() 해야 함.
		threadA.start();
		threadB.start();
		threadC.start();

		for (int i = 0; i < 3; i++)
			System.out.println("프로그램 시작 스레드 이름: " + mainThread.getName());
	}
}
//워커스레드1
class ThreadA extends Thread {
	public ThreadA() {
		setName("ThreadA");
	}

	public void run() {
		for (int i = 0; i < 2; i++) {
			System.out.println(getName() + "가 출력한 내용");
		}		
	}
}
//워커스레드2
class ThreadB extends Thread {
	public ThreadB(String name) {
		super(name);
	}

	public void run() {
		for (int i = 0; i < 2; i++) {
			System.out.println(getName() + "가 출력한 내용");
		}		
	}
}
//워커 스레드3 = 원래는 기능별로 워커 스레드 만들어야 함.
class ThreadC extends Thread {
	public void run() {
		for (int i = 0; i < 2; i++) {
			System.out.println(getName() + "가 출력한 내용");
		}		
	}
}