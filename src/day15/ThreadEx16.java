package day15;

class FamilyThread extends Thread {
	private Washroom wr;
	private String who;

	public FamilyThread(Washroom wr, String who) {
		this.wr = wr;
		this.who = who;
	}

	@Override
	public void run() {
		try {
			wr.openDoor(who);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
//스레드란? = 프로그램 내의 코드의 실행 흐름
class Washroom {
	public void openDoor(String name) throws InterruptedException { //동시에 호출되서는 안되는 메서드
		//현재 access가 끝날 때까지 다른 스레드가 접근할 수 없게끔 동기화를 시켜줘야하는데 이는 메서드 헤더에 synchronized라는 제어자만 추가해주면 된다.
		System.out.println(name + "님이 입장");
		for (int i = 0; i < 50000; i++) {
			if (i % 10000 == 0) {
				Thread.sleep(500);
				System.out.println(name + "님이 볼일보는중..");
			}
		}
		System.out.println(name + "님이 퇴장");
	}
}

public class ThreadEx16 {
	public static void main(String[] args) {
		Washroom wr = new Washroom();

		FamilyThread father = new FamilyThread(wr, "father");
		FamilyThread mother = new FamilyThread(wr, "mother");
		FamilyThread sister = new FamilyThread(wr, "sister");
		FamilyThread brother = new FamilyThread(wr, "brother");
		FamilyThread me = new FamilyThread(wr, "me");

		father.start();
		mother.start();
		sister.start();
		brother.start();
		me.start();
	}
}
