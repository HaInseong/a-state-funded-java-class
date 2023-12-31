package day13;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
//이 코드는 CollectionSort라기에는 무리가 있고, Collections 클래스를 배우기 위해 만들어졌다.
//자바에는 Collection & Collections(Objects, Arrays)이라는 클래스 두 개가 있다.
public class CollectionSort {
	public static void main(String[] args) {
		String[] array = { "JAVA", "SERVLET", "JDBC", "JSP", "RMI" };
		List<String> list = new ArrayList<String>();
		Collections.addAll(list, array); //list에 array 배열 저장하는 메서드
		System.out.println("list에 저장된 모든 데이터 : " + list); //[JAVA, SERVLET, JDBC, JSP, RMI]

		int index = Collections.binarySearch(list, "JDBC");
		System.out.println("\"JDBC\" 가 저장된 위치 : " + index); //2

		String maxStr = Collections.max(list);
		String minStr = Collections.min(list);
		System.out.println("최대값:" + maxStr); //SERVLET
		System.out.println("최소값:" + minStr); //JAVA

		Collections.sort(list);
		System.out.println("list의 데이터들을 오름차순으로 소팅한 결과 : " + list); //[JAVA, JDBC, JSP, RMI, SERVLET]

		Collections.shuffle(list); //순서 뒤섞음
		System.out.println("list의 데이터들을 섞은 결과 : " + list); //[JSP, RMI, JDBC, SERVLET, JAVA]

		List<Integer> list2 = new ArrayList<Integer>();
		list2.add(10);
		list2.add(20);
		list2.add(15);
		list2.add(5);
		System.out.println(list2); //[10, 20, 15, 5]
		int maxNum = Collections.max(list2);
		int minNum = Collections.min(list2);
		System.out.println("최대값:" + maxNum);
		System.out.println("최소값:" + minNum);

	}
}
