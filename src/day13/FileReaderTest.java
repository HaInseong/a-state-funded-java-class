package day13;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderTest {
	public static void main(String args[]) {
		FileReader reader = null;
		try {
			reader = new FileReader("c:/iotest/output.txt"); //생성 기능은없고, 존재하지 않는 파일을 읽을때는 FileNotFoundException 발생
			while (true) {
				int data = reader.read(); //read() 한글이든 영문이든 한글자씩 읽음. 더이상 읽을게 없으면 -1을 리턴함.
				//한 행단위로 읽는 방법을 가장 많이 쓴다. 하지만 FileReader는 한행단위를 읽는 메서드가 없다.
				if (data == -1)
					break;
				char ch = (char) data; //(char)형변환 하지 않으면 문자열이 아니라 코드값으로 출력된다.
				System.out.print(ch);
			}
		} catch (FileNotFoundException fnfe) { //FileNotFoundException이 IOException보다 위에 있어야한다. 
			//이유는? Exception은 자손이 항상 위로 와야한다. 조상 예외 클래스일 수록 아래에 있어야한다.
			//조상 예외클래스로 다 처리 할 수 있지만, 정확하게 구분해서 예외처리하고 싶은 경우 나눠서 예외처리한다.
			System.out.println("파일이 존재하지 않습니다.");
		} catch (IOException ioe) {
			System.out.println("파일을 읽을 수 없습니다.");
		} finally {
			try {
				if (reader != null) //객체가 생성되지 않았는데 if문으로 처리하지 않아서 무작정 close가 실행된다면 NullPointException(Runtime Exception)이 발생할 수 있다. 
					reader.close(); //FileReader 객체가 생성되지 않았기 때문에 close를 호출하지 않아도 된다.
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}
