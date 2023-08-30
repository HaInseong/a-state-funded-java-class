package day11;
public class ExceptionTest1 {
	public static void main(String[] args) throws InterruptedException{ //InterruptedException이 정말 발생하면 정말 끝내라는 의미 = main 메서드는 JVM이 호출하는데 throws는 호출한 애한테 넘기라는 의미임 = JVM에게 던진다는 것은 프로그램 종료하겠다는 것임
		System.out.println("수행시작");
		Thread.sleep(5000); //예외처리 안하면 이 메서드를 호출 못함
		System.out.println("수행종료");
	}
}
