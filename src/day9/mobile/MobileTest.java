package day9.mobile;

public class MobileTest {

	public static void main(String[] args) {
		
		Mobile Ltab = new Ltab("Ltab", 500, "ABC-01");
		Mobile Otab = new Otab("Otab", 1000, "XYZ-20");
		
		//생성된 객체 정보 출력
		MobileTest.printTile();
		System.out.println("-----------------------------------------");
		MobileTest.printMobile(Ltab);
		MobileTest.printMobile(Otab);
		
		System.out.println();
		
		System.out.println("[10분 충전]");
		System.out.println("-----------------------------------------");
		MobileTest.printTile();
		Ltab.charge(10);
		Otab.charge(10);
		MobileTest.printMobile(Ltab);
		MobileTest.printMobile(Otab);
		
		System.out.println();
		
		System.out.println("[5분 통화]");
		System.out.println("-----------------------------------------");
		MobileTest.printTile();
		Ltab.operate(5);
		Otab.operate(5);
		MobileTest.printMobile(Ltab);
		MobileTest.printMobile(Otab);


	}
	public static void printMobile(Mobile mobile) {
		System.out.println(mobile.getMobileName() + "\t\t" + mobile.getBatterySize() + "\t\t" + mobile.getOsType());
	}
	public static void printTile() {
		System.out.println("Mobile" + "\t\t" + "Battery" + "\t\t" + "OS");
	}
}
