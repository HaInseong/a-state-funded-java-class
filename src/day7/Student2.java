package day7;

import java.io.Serializable;

public class Student2 implements Serializable {
	String name;
	int age;
	String subject;

//	Student2() {
//		
//	} // 생성자를 선언하지 않았다면 args가 아무것도 없는 생성자가 자동 생성되지만 이미 하나라도 생성자를 선언하였을때 아무것도 없는 args를 호출하려고 한다면 이처럼 정의를 해주어야 한다.

	/**
	 * 
	 */
	public Student2() {
//		name = "도우너";
//		age = 10;
//		subject = "과학";
		this("도우너", 10, "과학"); // 다른 생성자의 기능을 끝낸 후
		System.out.println("디폴트 생성자로 객체생성"); // 출력메서드 실행함
	}

	public Student2(String name, int age, String subject) {
		this.name = name;
		this.age = age;
		this.subject = subject;
		System.out.println("구현생성자");
	}

	void study() {
		System.out.println(name + "학생은 " + subject + "과목을 학습합니다.");
	}

	public String getStudentInfo() {
		return name + "--" + age;
	}
}

class Student2Test {
	public static void main(String args[]) {
		Student2 st1 = new Student2("순자", 28, "과학");
//		System.out.println(st1);

		Student2 st2 = new Student2("영철", 33, "수학");
//		System.out.println(st2);

		Student2 st3 = new Student2();
//		System.out.println(st3);

		st1.study();
		System.out.println(st1.getStudentInfo());

		st2.study();
		System.out.println(st2.getStudentInfo());

		st3.study();
		System.out.println(st3.getStudentInfo());
	}
}
