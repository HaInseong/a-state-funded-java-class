package day12;

import java.util.Date;

class Value { // 접근제어자가 없으므로 객체생성 후에 같은 패키지에 한해서만 접근할 수 있다. 메서드는 없지만 Object로부터 상속받은 메서드들을 가지고
				// 있다.
	int value;

	Value(int value) {
		this.value = value;
	}

	@Override
	public boolean equals(Object obj){
		boolean result = false;
		if (obj != null && obj instanceof Value) {
			if (value == ((Value) obj).value) { // 자손에서 추가된 멤버는 조상유형으로 접근 못한다. 그러므로 강제 형변환해야한다. 강제 형변환은 꼭 instanceof와 어울린다.
				result = true;
			}
		}
		return result;
	}
}

public class EqualsTest3 {
	public static void main(String[] args) {
		Value v1 = new Value(10);
		Value v2 = new Value(10);
		Value v3 = new Value(20);
		System.out.println(v1.equals(null));
		System.out.println(v1.equals(v3));
		System.out.println(v1.equals(v2)); // Object에 있는 참조값 등가연산 equals가 호출된다.
		System.out.println(v1.equals(new Date()));

		if (v1.equals(v2))
			System.out.println("v1과 v2는 같습니다.");
		else
			System.out.println("v1과 v2는 다릅니다.");
		v2 = v1; // 참조값 대입 -> 같은 객체를 공유하게 된다. v2의 객체는 가비지 컬렉터가 회수한다.
		if (v1.equals(v2))
			System.out.println("v1과 v2는 같습니다.");
		else
			System.out.println("v1과 v2는 다릅니다.");
	}
}
