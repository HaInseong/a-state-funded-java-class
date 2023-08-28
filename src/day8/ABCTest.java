package day8;

// 세개 다 Object라는 클래스의 자손이 됨
// 이중에 최상위 클래스는 A
class A {
	A() {
		System.out.println("A 클래스의 객체 생성~~");
	}
}

class B extends A {
	B(int num) {
		System.out.println("B 클래스의 객체 생성~~");
	}
}

class C extends B {
	C() {
		super(10); //컴파일러가 생성자의 첫행에 this가 있는지 확인하고 없으면 super()를 자동으로 넣어준다.
		//this(), super()는 반드시 생성자 메서드 안에서만 사용가능하다.
		//부모 클래스에 기본 생성자가 없다면? 자손에서 에러가 난다.
		//조상의 클래스가 가지고 있는 매개변수가 있는 생성자를 직접 호출해줘야한다.
		System.out.println("C 클래스의 객체 생성~~");
	}
}

public class ABCTest {

	public static void main(String[] args) {
		
		new C();
	}

}
