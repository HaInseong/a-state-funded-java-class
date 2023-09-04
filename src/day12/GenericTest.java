package day12;

import java.util.Iterator;
import java.util.LinkedList;

public class GenericTest {
	public static void main(String[] args) {
		LinkedList list = new LinkedList();//API Document보면 제네릭스 구문이므로 warning 발생. 자동으로 <Object>가 쓰임.
		list.add("java");
		list.add(100);
		list.add("servlet");
		list.add("jdbc");

		for (int i = 0; i < list.size(); i++)
			System.out.println(list.get(i));
		System.out.println();

		for (Object value : list) {
			String s = (String) value; //Object형의 데이터값이 저장되어 있으므로 추출할 때는 강제형변환 필요.
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
