package day12;

import java.util.Iterator;
import java.util.LinkedList;

public class GenericTest {
	public static void main(String[] args) {
		// 제네릭스 라는 구문이 적용되어 만들어진 클래스의 객체 생성
		//타입 파라미터라는 것을 사용한다.
		LinkedList list = new LinkedList();
		list.add("java");
		list.add(100);
		list.add("servlet");
		list.add("jdbc");

		for (int i = 0; i < list.size(); i++)
			System.out.println(list.get(i));
		System.out.println();

		for (Object value : list) {
			String s = (String) value;
			System.out.println(s);
		}
		System.out.println();

		Iterator iter = list.iterator();
		while (iter.hasNext()) {
			Object value = iter.next();
			String s = (String) value;
			System.out.println(s);
		}
	}
}
