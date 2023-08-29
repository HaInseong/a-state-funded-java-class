package day1.practice;

public class Exercise3 {
	public static void main(String[] args) {
		char name1 = '하';
		char name2 = '인';
		char name3 = '성';
		
		//case1
		System.out.println(name1 + "" + name2 + "" + name3);

		//case2
		String result = String.valueOf(name1) + String.valueOf(name2) + String.valueOf(name3);
		System.out.println(result);
	}

}
