package day15;

class ThreadEx02 {
	public static void main(String args[]) throws Exception {
		ThreadEx2_1 t1 = new ThreadEx2_1();
		t1.start();
		//쓰레드의 기능을 가지고 있는 run()메서드는 우리가 직접 호출해서 실행하면 안된다. 우리는 start()를 호출해서 쓰레드를 사용할 환경을 구축해줘야한다.
		//환경 구축이 끝나면 start() 메서드가 자동으로 run()메서드를 호출함.
	}
}

class ThreadEx2_1 extends Thread {
	public void run() {
		throwException();
	}

	public void throwException() {
		try {
			throw new Exception();
		} catch (Exception e) { //일부러 call stack정보를 보여주기 위해서 이런식으로 코드를 짯음. 흔치 않은 경우임.
			e.printStackTrace();
		}
	}
}
