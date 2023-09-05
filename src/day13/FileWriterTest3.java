package day13;

import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.TextStyle;
import java.util.Locale;

//append 모드
public class FileWriterTest3 {
	public static void main(String[] args) {
		String path = "C:/iotest";
		File dir = new File(path);
		if (!dir.exists()) {
			dir.mkdirs();
		}
		try (FileWriter writer = new FileWriter("C:/iotest/today.txt", true); //AutoClosable 문법 적용
			//우선 출력 스트림 객체를 생성하고, printWriter 객체의 매개변수로 보낸다.
				PrintWriter out = new PrintWriter(writer);) { //close가 필요한 객체 2개 생성
			//PrintWriter는 스트림 객체를 연결하여 사용할 수 있다. 갯수 제한 없음.
			LocalDate ld = LocalDate.now();
			int yearNum = ld.getYear();
			int monthNum = ld.getMonthValue();
			int dateNum = ld.getDayOfMonth();
			DayOfWeek day = ld.getDayOfWeek();
			String korday = day.getDisplayName(TextStyle.FULL, Locale.KOREAN);

			out.printf("오늘은 %d년 %d월 %d일입니다.\r\n", yearNum, monthNum, dateNum);
			out.printf("오늘은 %s입니다.\r\n", korday);

			LocalDate myld = LocalDate.of(2022, 7, 17);
			DayOfWeek myday = myld.getDayOfWeek();
			String mykorday = myday.getDisplayName(TextStyle.FULL, Locale.KOREAN);
			out.printf("%s은 %s에 태어났습니다.%n", "XXX", mykorday);
			System.out.println("저장이 완료되었습니다.");

		} catch (Exception e) {
			System.out.println("파일에 저장하는 동안 오류가 발생했습니다.");
		}
	}
}