package day15;

import java.util.ArrayList;
import java.util.Date;

public class GenericMethodTest1 {
	//제네릭 메소드
	public static <T> void test1(T t) { //어떤 타입의 객체든 매개변수에 전달될 수 있다. 예전에는 Object로 받아야했지만 이제는 제네릭스로 전달 받는게 이점이 많다. 
		//제어자와 리턴값의 유형 사이에 <T> 타입파라미터 선언하지않으면 매개변수 전달시 그냥 T 클래스로 인식해버린다.
		System.out.println("어떤 객체가 전달되었을까요? "+t.getClass().getName());
	}
	
	public static <T> String test2(T t) {
		return "제네릭 메서드 : " + t;
	}
	
	public static <T> ArrayList<T> test3(int num) {	//ArrayList객체를 리턴하는 얘인데, 리턴받는 ArrayList객체를 어떠한 ArrayList객체에 담느냐에 따라서 ArrayList<T>가 달라진다.
		//즉, 리턴 받는 값을 어떤 유형의 변수에 담느냐에 따라 타입이 정의된다.
		return new ArrayList<T>(num);
	}
	
	public static <T> T test4(ArrayList<T> t) {
		return t.get(0);		
	}

	public static void main(String[] args) {		
		test1("가나다");
		test1(new java.util.Date());
		test1(100);
		System.out.println("-----------------------");
		System.out.println(test2("가나다"));
		System.out.println(test2(new java.util.Date()));
		System.out.println(test2(100));
		System.out.println("-----------------------");
		ArrayList<Date> l1 = test3(10);
		l1.add(new Date());
		l1.add(new Date());
		System.out.println(l1);
		ArrayList<String> l2 = test3(10);
		l2.add("가나다");
		l2.add("abc");
		l2.add("123");
		System.out.println(l2);
		System.out.println("-----------------------");
		Date d = test4(l1);
		String s = test4(l2);
		System.out.println(d);
		System.out.println(s);
	}
}