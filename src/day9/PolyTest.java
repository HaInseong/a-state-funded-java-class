package day9;

public class PolyTest {

	public static void main(String[] args) {
		printObjInfo(new Object()); //메서드의 매개변수 타입이 Object이므로 다양한 매개변수를 받을 수 있다.
		printObjInfo("가나다");
		printObjInfo(new String("abc"));
		printObjInfo(new java.util.Date());
		printObjInfo(new java.io.File("c:\\"));
		printObjInfo(new int[10]);
		printObjInfo(new double[5]);
		printObjInfo(Integer.valueOf(100)); //이처럼 가끔 생성자로 객체 생성 못하고 다른 메소드로 객체 생성해야하는 경우가 있다.
		//100이라는 숫자를 가지고 Integer라는 클래스의 객체를 만들라는 의미
		printObjInfo(10); //int 원시형
	}
	static void printObjInfo(Object o) { //main메서드에서 조금 더 간단하게 호출하기 위해서 static으로 만듬
		if(o instanceof String) { //어떤 객체가 전달되었는지 체크할 때 사용하는 연산자 instanceof
			System.out.println("문자열 객체가 전달됨 : " + o.toString()+"-"+((String)o).length());
			String s = (String)o;
		} else {
			System.out.println("전달된 객체의 클래스명(타입) : " + o.getClass().getName()); //클래스 이름 확인 메서드
			
		}
	}


}
