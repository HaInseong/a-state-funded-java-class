package day10.exercise;

public class TVTest {

	public static void main(String[] args) {
		SaleTV stv = new SaleTV(300000, "SALETV-1", 40, 1);
		RentalTV rtv = new RentalTV(100000, "RENTALTV-10", 42, 1);

		stv.channelUp();
		stv.channelUp();

		rtv.chennelDwon();
		rtv.chennelDwon();
		rtv.chennelDwon();

		TVTest.printAllTV(stv);

		
		
		TVTest.printAllTV(rtv);
		TVTest.printRentalTV(rtv);

	}

	static void printAllTV(TV tv) {
		// 조건1. 매개변수로 전달된 객체의 toString()을 호출하여 각 상품의 정보를 출력한다.
		System.out.println(tv.toString());
		
		// 조건2. 매개변수로 전달된 객체의 play() 호출한다.
		if(tv instanceof SaleTV) {
			((SaleTV) tv).play();
		}
		else {
			((RentalTV)tv).play();
		}
		// 조건3. 매개변수로 전달된 객체가 SaleTV 타입이면 sale()메서드를 호출한다.
		if (tv instanceof SaleTV) {
			((SaleTV) tv).sale();
		}
	}

	static void printRentalTV(Rentable tv) {
		// 조건1. 매개변수로 전달된 Rentable 객체의 rent() 호출한다. = RentalTV만 가능.
		tv.rent();
	}

}
