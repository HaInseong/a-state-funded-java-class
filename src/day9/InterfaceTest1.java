package day9;

interface Printable {
	//public static final, public abstract가 자동으로 추가되니 빼고 개발하는 코드도 많다.
	public static final int PRINT_TYPE1 = 1;
	static final int PRINT_TYPE2 = 2;
	final int PRINT_TYPE3 = 3;
	int PRINT_TYPE4 = 4;

	public abstract void print(int type);
	abstract void setPage(int su);
	boolean isAvailable(); //public abstract 생략
}


abstract class Shape3 {
	String color;

	abstract void draw();

	void setColor(String color) {
		this.color = color;
	}
}


class Circle3 extends Shape3 implements Printable { //4가지 형으로 사용할 수 있다. Circle3, Shape3, Printable, Object
	int page;

	void draw() {
		System.out.println(color + " 원을 그리는 기능");
	}

	public void print(int type) {
		System.out.println(type + "번 방식으로 " + page + "페이지를 프린팅한다.");
	}

	public void setPage(int page) {
		this.page = page;
	}

	public boolean isAvailable() {
		if (color.equals("흰색"))
			return false;
		else
			return true;
	}
}


class Rectangle3 extends Shape3 {
	void draw() {
		System.out.println(color + " 사각형을 그리는 기능");
	}
}

class Triangle3 extends Shape3 {
	void draw() {
		System.out.println(color + " 삼각형을 그리는 기능");
	}
}


public class InterfaceTest1 {
	public static void main(String args[]) {
		printOut(new Circle3());
		//printOut(new Rectangle3()); // 컴파일 오류가 발생하는 행
	}

	static void printOut(Printable prt) { //Printable을 추가상속(인터페이스 구현)하고 있는 객체만 매개변수로 받는다. Rectangle3는 매개변수로 올수없음.
		prt.setPage(100);
		((Circle3) prt).setColor("파란색"); 
		((Shape3) prt).setColor("파란색"); //setCollor는 Printable 인터페이스에 존재하는 메서드가 아니므로 강제형변환 해줘야한다.
		if (prt.isAvailable())
			prt.print(Printable.PRINT_TYPE2);
	}
}
