package day10.case2;

public class TVUser {
	public static void main(String[] args) {
		//팩토리 클래스임
		TV tv = new LgTV(); //어떤 TV객체가 되었든 TV 인터페이스를 통해서 사용하므로 메서드 호출 부분을 손댈필요가 없다. 객체들이 갖게 될 메서드들의 규격화(표준화)를 이뤘기 때문이다.
		tv.powerOn();
		tv.volumnUp();
		tv.volumnDown();
		tv.powerOff();
	}

}
