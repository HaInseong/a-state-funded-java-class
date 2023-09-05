package day13;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderTest4 {
	public static void main(String args[]) {
		try (FileReader reader = new FileReader("c:/iotest/output.txt");
				BufferedReader br = new BufferedReader(reader);) { //BufferedReader를 보조 스트림으로 사용하면 속도가 더 빨라져서 스트림 연결하여 사용한다.
			String data;
			while (true) {
				data = br.readLine();
				if (data == null)
					break;
				System.out.println(data);
			}
		} catch (FileNotFoundException fnfe) {
			System.out.println("파일이 존재하지 않습니다.");
		} catch (IOException ioe) {
			System.out.println("파일을 읽을 수 없습니다.");
		}
	}
}
