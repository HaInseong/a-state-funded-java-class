package day11;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.TextStyle;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;

public class DateTimeTest {

	public static void main(String[] args) throws Exception {
		Date d = new Date();
		System.out.println(d.toString()); //Thu Aug 31 17:06:41 KST 2023 년월일시분초
		System.out.println(d.getTime()); //1693469201907, 많이 씀, 타임스탬프 시간 중에 유닉스 시간(숫자로만 이루어짐)이라고 함.
		
		
		GregorianCalendar gc = new GregorianCalendar();
		System.out.println(gc.get(GregorianCalendar.DAY_OF_WEEK)); //1이 일요일이다.
		//GregorianCalendar는 get메서드(상수 매개변수)로 모든 것을 추출한다.
		//GregorianCalendar.get메서드는 int 반환형이라 다 숫자로 반환한다.
		//자바 API는 관례를 다 지켜야한다.
		//상수는 반드시 다 대문자로 만들고 _언더라인으로 이어준다.
		gc = new GregorianCalendar(2023, 8, 1);// 0이 1월, 11은 12월
		System.out.println(gc.get(GregorianCalendar.DAY_OF_WEEK));
		

		System.out.println(timeToStrDate(new Date().getTime())); //같은 클래스 안에 있으므로 클래스명 생략하고 static 메서드 호출함.
		System.out.println(parseStrDate("2024년 01월 01일"));
		
		//LocalDate API는 신세계, 주로 쓰면 된다.
		System.out.println("================ NEW");
		//시간까지 처리하려면 LocalDateTime 사용
		//LocalDate.of(int dayOfMonth = 이번 달에서 몇일째 되는 날인지?)
		//월을 지정할 때 -1 하지 않아도 된다.
		LocalDate currentDate = LocalDate.now();
		LocalDate targetDate = LocalDate.of(2023, 9, 1);
		System.out.println(currentDate.getDayOfWeek());
		System.out.println(currentDate.getDayOfWeek().getDisplayName(TextStyle.SHORT, Locale.KOREAN));//추출할 (짧은)스타일 정보, 나라정보
		System.out.println(currentDate.getDayOfWeek().getDisplayName(TextStyle.FULL, Locale.KOREAN));		
		System.out.println(targetDate.getDayOfWeek());
		System.out.println(targetDate.getDayOfWeek().getDisplayName(TextStyle.SHORT, Locale.KOREAN));
		System.out.println(targetDate.getDayOfWeek().getDisplayName(TextStyle.FULL, Locale.KOREAN));
		
		//시간만 처리하고 싶을 때 사용
		LocalTime currentTime = LocalTime.now();
		LocalTime targetTime = LocalTime.of(9, 10, 20); //시, 분, 초
		System.out.println(currentTime);
		System.out.println(targetTime);

		LocalDateTime currentDateTime = LocalDateTime.now();
		LocalDateTime targetDateTime = LocalDateTime.of(2023, 12, 25, 12, 30);
		System.out.println(currentDateTime);
		System.out.println(targetDateTime);
	}

	public static String timeToStrDate(long time) {
		DateFormat formatter = new SimpleDateFormat("MM-dd-yyyy");//시간의 분(mm)과 구분하기 위해서 MM은 대문자로 적음
		return formatter.format(time);
	}

	public static Date parseStrDate(String strDate) throws ParseException {
		DateFormat formatter = new SimpleDateFormat("yyyy년 MM월 dd일");
		return formatter.parse(strDate);
	}

}
