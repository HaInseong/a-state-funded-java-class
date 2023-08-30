package day10.exercise;

public class TVTest {

	public static void main(String[] args) {
		SaleTV stv = new SaleTV(300000, "SALETV-1", 40, 1);
		RentalTV rtv = new RentalTV(100000, "RENTALTV-10", 42, 1);
		
		
		int upOrDwon = 2;
		for(int i=0; i<upOrDwon; i++) {
			stv.channelUp();
		}
//		stv.channelUp();
//		stv.channelUp();
		
		upOrDwon = 3;
		for(int i=0; i<upOrDwon; i++) {
			stv.channelUp();
		}
//		rtv.chennelDwon();
//		rtv.chennelDwon();
//		rtv.chennelDwon();

		TVTest.printAllTV(stv);

		
		
		TVTest.printAllTV(rtv);
		TVTest.printRentalTV(rtv);

	}

	static void printAllTV(TV tv) {
		// 조건1. 매개변수로 전달된 객체의 toString()을 호출하여 각 상품의 정보를 출력한다.
		System.out.println(tv.toString());
		
		// 조건2. 매개변수로 전달된 객체의 play() 호출한다.
		if(tv instanceof SaleTV) {
			((SaleTV) tv).play(); //TV형이므로 자손에서 추가된 메서드에 접근이 불가능한 상황이므로 강제 형변환해서 접근한다.
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
