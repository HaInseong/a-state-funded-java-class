package day11;
import java.util.Random;
class TestException extends Exception { //자바에 많은 Exception 클래스가 만들어져 있지만 필요에 의해서 커스텀 Exception을 만들 수 있다.
	TestException(String message){
		super(message); //??? "<<:::::테스트로 예외발생시킴:::::>>"을 Exception안에 있는 필드에 초기화시킴
	}
}
public class ExceptionTest3 {
	public static void main(String[] args)  { //a에서 예외처리를 하기 때문에 main은 throws절 예외 처리 할 필요 없이 자유로워짐
		System.out.println("main()수행시작");
		a();
		System.out.println("main()수행종료");
	}
	
	static void a()  {
		System.out.println("a()수행시작");
		try {
			b();
		} catch (TestException e){ //b에서 throws로 던져준 예외발생을 a의 catch블록에서 처리하게 된다. = b를 호출했으므로.
			System.out.println("오류 발생 : " + e.getMessage());
			//던져진 예외 객체를 catch블록에서 잡게 되는데. 우리는 그 예외 객체를 가지고 getMessage(), printStackTrace(), toString()메서드를 이용해서 출력해서 예외를 볼 수있다.
		}
		System.out.println("a()수행종료");
	}
	
	static void b() throws TestException { //c에서 예외가 발생하면 나를 호출한 a메서드로 던진다는 의미
		System.out.println("b()수행시작");
		c();
		System.out.println("b()수행종료");
	}
	
	static void c() throws TestException {
		System.out.println("c()수행시작");
		boolean flag = new Random().nextBoolean(); //자바에서 난수를 추출하는 방법은 math.random외에도 Random이라는 클래스도 있음, 내가 원하는 타입의 난수를 추출할 수 있다는게 장점임
		if(flag){
			throw new TestException("<<:::::테스트로 예외발생시킴:::::>>"); //예외 발생시 c메서드는 끝나고 c를 호출한 b를 찾아감
			//throw new 예외클래스명() = throw에 지정할 수 있는 객체는 예외클래스만 가능하다. 자바에는 수많은 예외클래스를 설정해뒀다.
		}else {
			System.out.println("ㅋㅋㅋㅋ");
		}	
		System.out.println("c()수행종료");
	}	
}








