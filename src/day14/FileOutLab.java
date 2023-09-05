package day14;

import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.TextStyle;
import java.util.Locale;

public class FileOutLab {
	public static void main(String[] args) {
		String path = "C:/Temp";
		File dir = new File(path);
		if (!dir.exists()) {
			dir.mkdirs();
		}
		try (FileWriter writer = new FileWriter("C:/Temp/event.txt", false);

				PrintWriter out = new PrintWriter(writer);) { //파일 여는 기능 가지고 있고, append 기능만 없음.
			// FileWriter생성하지 않고 PrintWriter(파일명) 파일명 바로 매개변수로 전달해도 됩니다.

			LocalDate ld = LocalDate.now();
			DayOfWeek day = ld.getDayOfWeek();
			String koreanDay = day.getDisplayName(TextStyle.SHORT, Locale.KOREA);

			out.printf("2023년 10월 3일은 %s요일입니다.\n", koreanDay);
			out.printf("2023년 12월 25일은 %s요일입니다.\n", koreanDay);
			//getDay 메서드 만들어서 해당 일자의 요일을 가져와야한다.

			System.out.println("저장이 완료되었습니다.");

		} catch (Exception e) {
			System.out.println("파일에 저장하는 동안 오류가 발생했습니다.");
		}
	}
}
