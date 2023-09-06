package day15;

class ThreadEx01 {
	public static void main(String args[]) {
		ThreadEx1_1 t1 = new ThreadEx1_1();

		Runnable r = new ThreadEx1_2(); //Runnable로 구현하면 바로 start()호출이 안되서 절차가 한단계 더 늘어남.
		Thread t2 = new Thread(r); // 생성자 Thread(Runnable target)

		t1.start();
		t2.start();
	}
}

class ThreadEx1_1 extends Thread { //java.lang.Thread 상속
	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println(getName()); // 조상인 Thread의 getName()을 호출, 스레드 이름을 출력하는 메서드
		}
	}
}

class ThreadEx1_2 implements Runnable {
	public void run() {
		for (int i = 0; i < 5; i++) {
			// Thread.currentThread() - 현재 실행중인 Thread를 반환한다.
			System.out.println(Thread.currentThread().getName());
		}
	}
}
