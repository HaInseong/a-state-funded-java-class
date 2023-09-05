package day13;

import java.io.IOException;
import java.io.PrintWriter;

public class PrintWriterTest {
	public static void main(String args[]) {
		try (PrintWriter pw = new PrintWriter("c:/iotest/output3.txt");) { //PrintWriter는 append 모드를 사용할 수 없다.
			char arr[] = { '객', '체', '지', '향', '언', '어', ' ',  'J', 'a', 'v', 'a' };
			for (int cnt = 0; cnt < arr.length; cnt++)
				pw.print(arr[cnt]);
			pw.println();
			pw.println(arr);
			pw.println("OCJP 시험 대비!!");
			pw.println(100); //int형을 받는 메서드가 있어서 아스키코드 변환되지 않고 그대로 출력된다.
			pw.println(3.14);
			pw.println(true);
			pw.printf("%,d원\n", 1000000); //기존에 사용하던 formating 가능해진다.
			pw.printf("%.2f\n", 123.5678);
			System.out.println("파일에 출력 완료!!");
		} catch (IOException ioe) {
			System.out.println("파일로 출력할 수 없습니다.");
		}
	}
}
