package day13;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderTest2 {
	public static void main(String args[]) {
		FileReader reader = null;
		BufferedReader br = null;
		try {
			reader = new FileReader("c:/iotest/output.txt");
			br = new BufferedReader(reader);
			//생성된 FileReader객체를 BufferedReader에 전달하게 하여 스트림을 연결하여 한 행단위로 읽어올 수 있는 메서드를 쓸 수 있게 만든다. 
			while (true) {
				String data = br.readLine(); //한 행단위로 읽어올 수 있는 메서드, 예전에는 많이 썼지만 지금은 Scanner에서 한 행단위 읽는 메서드 많이 쓴다.
				//readLine는 더이상 읽을게 없을 때는 null을 리턴한다.
				if (data == null)
					break;
				System.out.println(data);
			}
		} catch (FileNotFoundException fnfe) {
			System.out.println("파일이 존재하지 않습니다.");
		} catch (IOException ioe) {
			System.out.println("파일을 읽을 수 없습니다.");
		} finally {
			try {
				br.close();
				reader.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}
