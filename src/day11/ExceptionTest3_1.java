package day11;
import java.util.Random;

//전부 다 throws절 예외처리한 코드입니다.
public class ExceptionTest3_1 {
	public static void main(String[] args) throws TestException {
		System.out.println("main()수행시작");
		a();
		System.out.println("main()수행종료");
	}
	static void a() throws TestException {
		System.out.println("a()수행시작");
		b();		
		System.out.println("a()수행종료");
	}
	static void b() throws TestException {
		System.out.println("b()수행시작");
		c();
		System.out.println("b()수행종료");
	}
	static void c() throws TestException { //예외를 발생시키는 코드가 있을 때는 이 메서드를 호출하는 대상에게 던져줄 throws절을 꼭 써줘야한다.
		System.out.println("c()수행시작");
		boolean flag = new Random().nextBoolean();
		if(flag){
			throw new TestException("<<:::::테스트로 예외발생시킴:::::>>");
		}else {
			System.out.println("ㅋㅋㅋㅋ");
		}	
		System.out.println("c()수행종료");
	}	
}








