package day12;

import java.util.HashSet;

class Member2 {
	private int id;
	private String name;
	private String password;

	Member2(int id, String name, String password) {
		this.id = id;
		this.name = name;
		this.password = password;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) //참조값이 같다면
			return true;
		if (o != null && o instanceof Member2) { //o가 null이 아니고 Member2형인 경우
			Member2 m = (Member2) o; //부모에서 자손에 대입하므로 강제형변환 연산자를 써줘야한다.
			if (id == m.id && name.equals(m.name) && password.equals(m.password))
				return true;
		}
		return false;
	}
}

public class ObjectTest2 {
	public static void main(String args[]) {
		Member2 obj1 = new Member2(10, "자바", "duke");
		Member2 obj2 = new Member2(10, "자바", "duke");
		Member2 obj3 = new Member2(20, "자바", "duke");
		System.out.println(obj1.equals(obj2));
		System.out.println(obj1 == obj2);
		System.out.println(obj1.equals(null));
		System.out.println(obj1.equals(new java.util.Date()));
		System.out.println(obj1.equals(obj3));
		
		HashSet<Member2> set = new HashSet<>(); //Member2 객체를 저장하는 HashSet객체를 만듬
		System.out.println(set.add(obj1)); //add후 데이터 값이 저장되었는지 확인되는 방법은 add()메서드의 리턴 값이 true인지 확인하는 방법과 size를 체크하는 방법이 있다.
		System.out.println(set.add(obj2)); //같은 내용의 객체여도 add 됨. 왜냐하면 HashSet은 해시코드 메서드와 equals 메서드 모두 사용하여 판단함. 참조값이 다르므로 중복으로 보지 않는 것임.
		System.out.println(set.add(obj3));
	}
}
