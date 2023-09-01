package day12;

import java.util.HashSet;
import java.util.Iterator;

public class SetExample1 {
	public static void main(String args[]) {
		HashSet<String> set = new HashSet<String>();
		System.out.println(set.add("자바"));
		System.out.println(set.add("카푸치노"));
		System.out.println(set.add("에스프레소"));
		System.out.println(set.add("자바")); //add했는데 리턴값이 true면 데이터가 잘 들어간 것
		System.out.println("저장된 데이터의 수 = " + set.size());//add 했는데 사이즈 변경이 있다면 데이터가 잘 들어간 것

		for (String s : set)
			System.out.println(s);
		
		Iterator<String> iterator = set.iterator(); //HashSet은 데이터 추출 get 메서드가 없다. 그래서 Iterator를 사용해서 추출한다.
		while (iterator.hasNext()) {
			String str = iterator.next();
			System.out.println(str);
		}
		System.out.println(set);
	}
}
