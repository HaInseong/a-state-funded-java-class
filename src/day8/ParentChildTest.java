package day8;

import day7.Card;

class Parent {  
	int x = 1, y = 2;
	public String toString() { //오버라이딩시 조상의 메소드의 이름과 매개변수 사양과 리턴값, 접근제한자를 맞춰야 하는데, 접근제어자는 같거나 넓힐 순 있어도 좁아질 순 없다.
		//Object의 toString은 public이므로 접근제어자가 더이상 좁아질 수 없다.
		return "Parent 클래스의 객체 입니당";
	}	
}
class Child extends Parent {
	int x = 10;
	void printInfo() {
		int x = 100; //멤버변수와 지역변수의 이름은 같을 수 있다.
		System.out.println(x);			//	100 항상 가까이에 있는 변수가 우선이다.
		System.out.println(this.x);		//  10 this = 이 클래스를 의미함
		System.out.println(super.x);	//	1
		System.out.println(y);			//  2	
		System.out.println(this.y);		//	2
		System.out.println(super.y);	//  2	
		//System.out.println(z);
	}
//	public String toString() {
//		return "Child 클래스의 객체 입니당";
//	}
}

public class ParentChildTest {
	public static void main(String[] args) {
		Parent p = new Parent();
		System.out.println(p.toString());
		System.out.println(p); //자동으로 toString()을 호출하여 리턴함.
		System.out.println("출력 1-" + p);
		
		Card c = new Card();
		System.out.println(c.toString()); //Card 클래스는 toString을 오버라이딩 하지 않았으므로 참조값을 출력하는 Object의 toString()가 호출된다.
		System.out.println("출력 2-" + c);
		//생성한 객체의 클래스가 public이더라도 멤버변수, 메서드들도 public으로 선언해야만 해당 클래스의 속성과 기능에 접근가능하다.
		
		
		java.util.Date d = new java.util.Date();
		System.out.println(d.toString()); //Date클래스는 자동으로 toString메서드가 오버라이딩 되어있다.
		System.out.println("출력 3-" + d);
		
		Child ch = new Child();
		System.out.println("출력 4-" + ch);
		ch.printInfo();
		System.out.println(ch.x);
		System.out.println(ch.y);
	}
}



