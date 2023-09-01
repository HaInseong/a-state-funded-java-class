package day12;
import java.util.Date;
public class CreateGenericTest {
	public static void main(String[] args) {
		Value1 v1 = new Value1();
		v1.put("가나다");
		String s1 = v1.get();
		System.out.println(s1);
		
		Value2 v2 = new Value2();
		v2.put("가나다");
		String s2 = (String)v2.get();
		System.out.println(s2);		
		v2.put(new Date());
		Date d1 = (Date)v2.get();
		System.out.println(d1);		
		
		Value3<String> v3 = new Value3<>();
		v3.put("가나다");
		String s3 = v3.get();
		System.out.println(s3);	
		
		Value3<Date> v4 = new Value3<>();
		v4.put(new Date());
		Date d2 = v4.get();
		System.out.println(d2);		
	}
}

class Value1 { //String형에 특화된 클래스
	String obj;
	void put(String obj) { //obj의 값을 초기화해주는 메서드
		this.obj = obj;		
	}
	String get() {
		return obj;
	}
}
class Value2 { //Object의 다형성 측면에서 모든 자료형에 특화된 클래스
	Object obj;
	void put(Object obj) {
		this.obj = obj;		
	}
	Object get() {
		return obj; //Date형을 가져온다면 get()는 Object형으로 반환하기 때문에 Date형으로 다시 변환해서 사용해야한다.
	}
}
//제네릭을 이용하면 Object형보다 다양한 객체에 대한 처리를 세련되게 할 수 있다.
//Value3를 객체생성하는데 어떤 객체를 다룰 것인지 Value3 객체를 생성하는 시점에서 타입을 전달한다는 의미이다.
// Value3<Date> v = new Value3<Date>(); Value3 객체를 생성하면 T가 모두 Date로 바뀐다.
// Value3<Friend> v = new Value3<Friend>(); T가 모두 Friend로 바뀐다. 클래스를 만드는 시점이 아니라 클래스를 사용하는 시점에서 데이터의 타입을 결정한다.
class Value3<T> { //<T> = Type parameter라 한다.
	T obj;
	void put(T obj) {
		this.obj = obj;		
	}
	T get() {
		return obj;
	}
}

