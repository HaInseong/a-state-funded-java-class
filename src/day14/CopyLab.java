package day14;

import java.io.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class CopyLab {

	public static void main(String[] args) {
		String sourceFilePath = "sample.txt";//이클립스는 프로젝트 폴더가 현재 디렉토리이므로 절대경로가 아니라 파일명만 주어도 인식한다.
		String folderPath = "c:/iotest";
		
		//Scanner가 최근에 나와서 더 간단하지만 회사에서는 FileReader, BufferedReader 사용법도 알아야한다.
		try (BufferedReader br = new BufferedReader(new FileReader(sourceFilePath))) { //append모드는 FileWriter 객체가 필요하다.
			String data;

			LocalDate currentDate = LocalDate.now();
			DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("yyyy_MM_dd", Locale.KOREA);
			String formattedDate = currentDate.format(dateFormatter);
			String filePath = folderPath + "/sample_" + formattedDate + ".txt";

			File dir = new File(folderPath);
			if (!dir.exists()) {
				dir.mkdirs();
			}

			try (PrintWriter out = new PrintWriter(new FileWriter(filePath, true))) {
				while ((data = br.readLine()) != null) {
					out.println(data);
				}

				System.out.println("저장이 완료되었습니다.");
			} catch (IOException ioe) {
				System.out.println("파일에 저장하는 동안 오류가 발생했습니다.");
			}
		} catch (FileNotFoundException fnfe) {
			System.out.println("sample.txt 파일을 찾을 수 없습니다.");
		} catch (IOException ioe) {
			System.out.println("입출력을 처리하는 동안 오류가 발생했습니다.");
		}
	}
}
