package day9.mobile;

public class MobileTest {

	public static void main(String[] args) {
		
		Mobile m1 = new Ltab("Ltab", 500, "ABC-01");
		Mobile m2 = new Otab("Otab", 1000, "XYZ-20");
		
		//생성된 객체 정보 출력
		MobileTest.printTile();
		System.out.println("-----------------------------------------");
		MobileTest.printMobile(m1);
		MobileTest.printMobile(m2);
		
		System.out.println();
		
		System.out.println("[10분 충전]");
		System.out.println("-----------------------------------------");
		MobileTest.printTile();
		m1.charge(10);
		m2.charge(10);
		MobileTest.printMobile(m1);
		MobileTest.printMobile(m2);
		
		System.out.println();
		
		System.out.println("[5분 통화]");
		System.out.println("-----------------------------------------");
		MobileTest.printTile();
		m1.operate(5);
		m2.operate(5);
		MobileTest.printMobile(m1);
		MobileTest.printMobile(m2);


	}
	public static void printMobile(Mobile mobile) {
		System.out.println(mobile.getMobileName() + "\t\t" + mobile.getBatterySize() + "\t\t" + mobile.getOsType());
	}
	public static void printTile() {
		System.out.println("Mobile" + "\t\t" + "Battery" + "\t\t" + "OS");
	}
}
