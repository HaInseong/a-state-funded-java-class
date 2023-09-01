package day12.exercise;

import java.util.LinkedList;

class Person {
	private String name;

	Person(String name){
		this.name = name;
	}

	public String getInfo() {
		return name;
	}
}

class Friend extends Person {
	private String phoneNum;
	private String email;
	
	Friend(String name, String phoneNum, String email){
		super(name);
		this.phoneNum = phoneNum;
		this.email = email;
	}
	
	public String getInfo() {
		return super.getInfo() + " " + phoneNum + " " + email;
	}
}
public class LinkedListLab1 {

	public static void main(String args[]) {
		LinkedList<Friend> list = new LinkedList<>();
		
		System.out.println("이름  전화번호  메일주소");
		System.out.println("-------------------");
		for(int i=0; i < 5; i++) {
			Friend friend = new Friend("이름"+i,"11111111","abc"+i+"@gmail.com");
			list.add(friend);
			System.out.println(friend.getInfo());
		}
	}
}






