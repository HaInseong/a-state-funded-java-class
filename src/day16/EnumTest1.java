package day16;

enum Season {
	SPRING, SUMMER, FALL, WINTER //상수이면서 값 자체가 된다.
}
public class EnumTest1 {
	public static void main(String args[]) {
		System.out.println(Season.SPRING);
		System.out.println(Season.SUMMER);
		System.out.println(Season.FALL);
		System.out.println(Season.WINTER);
		Season data1 = Season.FALL; //값의 타입만 제한하는게 아니라 갖을 수 있는 값도 enum에 선언된 값들로만 대입이 제한되어있다.
		if (data1 == Season.FALL)
			System.out.println("당신이 좋아하는 계절은 가을!!");
		
		//switch는 int, String만 매개변수로 대입 가능하다
		switch (data1) {
		case SPRING:
			System.out.println("대저토마토");
			break;
		case SUMMER:
			System.out.println("복숭아");
			break;
		case FALL:
			System.out.println("홍로");
			break;
		case WINTER:
			System.out.println("레드향");
			break;
		}

		for (Season v : Season.values()) //values()는 상수들을 보관하고 있는 배열들을 리턴해준다.
			System.out.print(v + " ");
		System.out.println();
		
		Season data2 = Season.valueOf("SUMMER");
		System.out.println(data2);
	}
}
