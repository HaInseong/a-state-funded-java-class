package day11;
//자바에서 메서드 호출시 반드시 예외처리를 꼭 해야하는 애들이 있다는 것을 보여주기 위한 코드입니다.
public class ExceptionTest1 {
	public static void main(String[] args) throws InterruptedException{ //InterruptedException이 정말 발생하면 프로그램을 끝내라는 의미  
		//main 메서드는 JVM이 호출하는데 throws는 호출한 애한테 넘기라는 의미인데 JVM에게 던진다는 것은 CallStack정보와 예외메세지를 출력하고 프로그램 종료하겠다는 의미
		//JVM이 하는 예외처리는 CallStack정보와 예외메시지를 출력하고 프로그램을 종료하는 것임.
		//throws절을 가지고 있는 메서드의 헤더가 Exception이면 필수, RuntimeException이면 예외처리는 선택이다.
		System.out.println("수행시작");
		Thread.sleep(5000); //예외처리 안하면 이 메서드를 호출 못함
		//5000 = 5초동안 쉬어라
		//java.lang?에 있는 클래스구나? 어케 알지?
		//= java.lang 패키지는 import없이 바로 사용할 수 있기 때문에 import 구문이 없는데 static 클래스를 사용한다는 것은 java.lang패키지 안에 있다는 것을 의미한다. 
		//ex. System, Thread
		System.out.println("수행종료");
	}
}
