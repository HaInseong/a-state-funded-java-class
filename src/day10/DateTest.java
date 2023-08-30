package day10;
import java.util.Date; // 클래스 하나만 쓸 때는 알아보기 쉽게 직접 클래스명 써주는게 관례
//import java.util.*; util 안에 있는 클래스 모두를 가져다 쓸 수 있음.

public class DateTest {

	public static void main(String[] args) {
		Date d = new Date(); //Date는 시스템에 저장되어 있는 시간을 가지고 초기화한다.
		//컴퓨터에서 월은 0부터 시작
		System.out.println(d);
	}

}
