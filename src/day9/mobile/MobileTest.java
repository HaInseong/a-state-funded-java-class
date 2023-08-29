package day9.mobile;

public class MobileTest {

	public static void main(String[] args) {
		
		Mobile ltab = new Ltab("Ltab", 500, "ABC-01");
		Mobile otab = new Otab("Otab", 1000, "XYZ-20");
		
		//생성된 객체 정보 출력
		MobileTest.printTile(); //같은 클래스에 있는 메서드라서 클래스명을 붙이지 않아도 호출되지만 static 메서드는 항상 클래스명을 사용해서 접근하는게 좋은 습관이다.
		System.out.println("-----------------------------------------");
		MobileTest.printMobile(ltab);
		MobileTest.printMobile(otab);
		
		System.out.println();
		
		System.out.println("[10분 충전]");
		System.out.println("-----------------------------------------");
		MobileTest.printTile();
		ltab.charge(10);
		otab.charge(10);
		MobileTest.printMobile(ltab);
		MobileTest.printMobile(otab);
		
		System.out.println();
		
		System.out.println("[5분 통화]");
		System.out.println("-----------------------------------------");
		MobileTest.printTile();
		ltab.operate(5);
		otab.operate(5);
		MobileTest.printMobile(ltab);
		MobileTest.printMobile(otab);


	}
	public static void printMobile(Mobile mobile) { // 상속되었으므로 Ltab, Otab 모두 Mobile형을 대신할 수 있다.
		System.out.println(mobile.getMobileName() + "\t\t" + mobile.getBatterySize() + "\t\t" + mobile.getOsType());
	}
	public static void printTile() {
		System.out.println("Mobile" + "\t\t" + "Battery" + "\t\t" + "OS");
	}
}
