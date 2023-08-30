package day10.case1;
public class TVUser {
	public static void main(String[] args) {
		LgTV tv = new LgTV(); //학습을 위해 다른 타입줘서 에러 발생시킴, SamsungTV로 바꾸면 에러 사라짐
		tv.powerOn();
		tv.volumnUp();
		tv.volumnDown();
		tv.powerOff();
	}
}
