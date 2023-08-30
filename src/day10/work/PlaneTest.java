package day10.work;

public class PlaneTest {

	public static void main(String[] args) {
		Plane[] plane = new Plane[2];
		plane[0] = new Airplane("L747", 1000);
		plane[1] = new Cargoplane("C40", 1000);

		PlaneTest.printTile();
		PlaneTest.printPlaneInfo(plane);
//		for (Plane transfer : plane) {
//			System.out.println(transfer.getPlaneName() + "\t\t" + transfer.getFuelSize());
//		}

		System.out.println("\n" + "[100 운항]");
		PlaneTest.printTile();
		plane[0].flight(100);
		plane[1].flight(100);
		PlaneTest.printPlaneInfo(plane);
//		for (Plane transfer : plane) {
//			System.out.println(transfer.getPlaneName() + "\t\t" + transfer.getFuelSize());
//		}

		System.out.println("\n" + "[200 주유]");
		PlaneTest.printTile();
		plane[0].refuel(200);
		plane[1].refuel(200);
		PlaneTest.printPlaneInfo(plane);
//		for (Plane transfer : plane) {
//			System.out.println(transfer.getPlaneName() + "\t\t" + transfer.getFuelSize());
//		}

	}



	public static void printPlaneInfo(Plane[] plane) {
		for (Plane transfer : plane) {
			System.out.println(transfer.getPlaneName() + "\t\t" + transfer.getFuelSize());
		}
	}

	public static void printTile() {
		System.out.println("Plane" + "\t\t" + "fuelSize");
		System.out.println("------------------------------");
	}

}
