package day11;
//try~catch~finally를 공부하기 위한 코드입니다.
public class ExceptionTest2 {
	public static void main(String[] args){
		System.out.println("수행시작");
		try {
			int num1 = Integer.parseInt(args[0]);
			int num2 = Integer.parseInt(args[1]);
			int result = num1/num2;
			System.out.println("연산 결과 : "+result);
			//세개의 Exception 모두 RuntimeException이라 선택적 예외처리이다.
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("프로그램 아규먼트를 2 개 전달하세요!!");
		} catch (ArithmeticException e) {
		 System.out.println(e.getMessage()); // /by zero라는 에러 메시지 출력
			System.out.println("두번째 프로그램 아규먼트는 0이 아닌 값을 전달하세요!!");
			return; // main메서드에서 리턴한다는것은 jvm에게 되돌아 가겠다는 의미인데 이는 프로그램을 종료하겠다는 의미이다.
			//return을 하더라도 finally 블록은 수행하고 간다는게 핵심이다.
		} catch (NumberFormatException e) {
			e.printStackTrace();
			System.out.println("프로그램 아규먼트로 숫자를 전달하세요!!");
		} catch (Exception e) { 
			//따로 처리하고 싶은 예외는 위에 세가지 예외처럼 각각 catch블록을 작성하고 그 외에 모든 예외처리를 하고 싶다면 마지막에 선조형 Exception 사용. 
			//but Exception은 맨위로 올라가면 안된다.
			System.out.println("예외 발생!!--- " + e); 
			//어떤 예외가 발생하든 세가지 예외를 한번에 잡겠다는 의미, 각각 catch해서 예외처리하기가 번거로울 때 조상유형을 사용해서 예외객체를 전달받게 하면 된다.
		}
		finally {
			System.out.println("항상 수행!!");
		}
		System.out.println("수행종료");
	}
}
