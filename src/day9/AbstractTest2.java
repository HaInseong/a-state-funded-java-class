package day9;

abstract class Shape {
	String color;

	abstract void draw(); //기능을 구현하지 않은 추상 메서드, 호출 방식은 똑같지만 각각 구현한 내용이 다르므로 자식에서 구현해줘야 함, 반드시 세미콜론으로 끝나야한다.

	void setColor(String color) {
		this.color = color;
	}
}

class Circle2 extends Shape {
	void draw() { //추상메서드를 각각의 클래스에 알맞게 오버라이딩함
		System.out.println(color + " 원을 그리는 기능");
	}
}

class Rectangle2 extends Shape {
	void draw() {
		System.out.println(color + " 사각형을 그리는 기능");
	}
}

class Triangle2 extends Shape {
	void draw() {
		System.out.println(color + " 삼각형을 그리는 기능");
	}
}

public class AbstractTest2 {
	public static void main(String args[]) {
		Shape s = new Circle2();
		s.setColor("파란색");
		printInfo(s);
		s = new Rectangle2();
		s.setColor("분홍색");
		printInfo(s);
		s = new Triangle2();
		s.setColor("연두색");
		printInfo(s);
	}

	static void printInfo(Shape obj) { //조상 타입으로 모든 자손 객체들을 매개변수로 받을 수 있게 해준다.
		obj.draw(); //조상변수로 각각의 객체의 메서드를 호출해도 항상 자손객체의 오버라이딩이 있는지 먼저 확인한다.
	}
}
