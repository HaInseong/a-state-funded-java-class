package day13;

import java.io.InputStreamReader;

public class StandardInput2 {

	public static void main(String[] args) throws Exception { //이 메서드 안에서 발생하는 어떤 예외든 main메서드를 호출한 JVM에게 넘기겠다는 의미.
		System.out.print("입력 : ");
		int input = new InputStreamReader(System.in).read(); 
		//System.in = 운영체제가 표준 입력장치로서 키보드로 지정해뒀다. in은 자동으로 inputStream을 참조하도록 되어있다.
		//read()메서드는 int형을 반환한다. inputStream 객체는 대표적인 바이트스트림 객체이다. read()는 바이트로 읽어온다.
		//영문은 1바이트이지만 한글은 2바이트이므로 제대로 읽지 못한다.
		//InputStreamReader의 read()는 바이트 스트림을 문자 스트림으로 변환하는 브릿지 스트림이다. 영문은 1바이트, 한글은 2바이트로 인식한다.
		System.out.println("입력된 데이터 : " + (char)input);
	}

}
