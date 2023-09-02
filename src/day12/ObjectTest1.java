package day12;

class Member1 {
	private int id;
	private String name;
	private String password;

	Member1(int id, String name, String password) {
		this.id = id;
		this.name = name;
		this.password = password;
	}

	@Override
	public String toString() { //꼭 toString() 호출하지 않아도 참조변수 값만 넣어줘도 toString()으로 출력된다.
		return "Member1 [id=" + id + ", name=" + name + ", password=" + password + "]";
	}
}

public class ObjectTest1 {
	public static void main(String args[]) {
		Member1 obj1 = new Member1(10, "자바", "duke");
		Member1 obj2 = new Member1(10, "자바", "duke");
		
		System.out.println(obj1.equals(obj2)); //오버라이딩 안한 Object의 equals 메서드라서 주소값을 동등비교한다.
		System.out.println(obj1 == obj2); //주소값 동등비교

		Member1 obj3 = obj2;
		System.out.println(obj3.equals(obj2));
		System.out.println(obj3 == obj2);
	}
}
