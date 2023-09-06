package day15;

class ThreadEx03 {
	public static void main(String args[]) throws Exception {
		ThreadEx3_1 t1 = new ThreadEx3_1();
		t1.run(); //이건 스레드 실행이 아님, 스레드를 기동시키려면 무조건 start() 호출부터..
		//start()메서드를 실행하면 스레드가 실행될 수 있느 환경을 구축하고 자동으로 run()메서드를 호출한다.
	}
}

class ThreadEx3_1 extends Thread {
	public void run() {
		throwException();
	}

	public void throwException() {
		try {
			throw new Exception();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
