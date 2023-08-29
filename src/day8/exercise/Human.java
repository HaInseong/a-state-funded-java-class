package day8.exercise;

public class Human {
	//멤버변수
	public String name;
	public int age;
	public int height;
	public int weight;
	
	//생성자
	Human() {}
	Human(String name, int age, int height, int weight) {
		this.name = name;
		this.age = age;
		this.height = height;
		this.weight = weight;
	}
	
	//메서드
	public String printInformation() {
		String humanInfo = name + " " + age + " " + height + " " + weight;
		return humanInfo;
				
	}
}
