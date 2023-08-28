package day8;

public class PointTest {
	public static void main(String args[]) {
		Point3D p3 = new Point3D(1, 2, 3);
		System.out.println(p3.getLocation());
	}
}

class Point {
	int x;
	int y;

	Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	String getLocation() {
		return "x :" + x + ", y :" + y;
	}
}

class Point3D extends Point {
	int z;

	Point3D(int x, int y, int z) {
		//부모클래스에 기본생성자가 없으므로 super()로 호출이 불가능하다.
		//직접 super()를 구현하여 부모의 생성자에 알맞는 것을 생성하면 된다.
		super(x, y);
		this.z = z;
	}

	String getLocation2() { // 오버라이딩
		//return super.getLocation() + ", z :" + z;
		//super생략시 가장 가까운 getLocation을 호출한다. = stackoverflow에러 발생 
		return super.getLocation() + ", z :" + z;
		//getLocation2로 바꾸면 겹치지 않으므로 자동으로 조상의 메서드를 호출할 수 있게된다.
		
	}
}
