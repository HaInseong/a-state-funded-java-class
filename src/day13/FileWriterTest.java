package day13;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterTest {
	public static void main(String args[]) {
		FileWriter writer = null;
		String path = "C:/iotest";
		File isDir = new File(path);
		if (!isDir.exists()) {
			isDir.mkdirs(); //습관적으로 쓰세요.
		}
		try {
			writer = new FileWriter("c:/iotest1/output.txt"); // overwrite //파일이 존재하지 않을 때 파일을 만들어주긴 하지만 디렉토리가 존재하지 않을 때 디렉토리까지 만들어주진 않아요.
			char arr[] = { '객', '체', '지', '향', '언', '어', ' ',  'J', 'a', 'v', 'a', '!' };
			for (int cnt = 0; cnt < arr.length; cnt++)
				writer.write(arr[cnt]);
			writer.write("\n");
			writer.write(arr);
			writer.write("\n");
			writer.write("OCJP 시험 대비");
			writer.write("\n");
			writer.write("우리는 한팀!! 마지막까지 서로 도우며 열심히 합시다!!");
			System.out.println("파일에 출력 완료!!");
		} catch (IOException ioe) {
			System.out.println("파일로 출력할 수 없습니다.");
			ioe.printStackTrace();
		} finally {
			try {
				if (writer != null)
					writer.close(); //writer.close()도 예외처리는 필수이다.
			} catch (Exception e) {
				System.out.println("파일을 닫는동안 오류 발생!!");
			}
		}
	}
}
