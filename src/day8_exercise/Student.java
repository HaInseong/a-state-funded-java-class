package day8_exercise;

public class Student extends Human {
	//멤버변수
	public String number;
	public String major;
	
	//생성자
	Student() {}
	Student(String name, int age, int height, int weight, String number, String major) {
		super(name, age, height, weight);
//		super.name = name;
//		super.age = age;
//		super.height = height;
//		super.weight = weight;
		this.number = number;
		this.major = major;
	}
	
	//메서드
	public String printInformation() {
		return super.printInformation() + " " + number + " " + major; //조상에 저장된 필드 호출
	}
}
