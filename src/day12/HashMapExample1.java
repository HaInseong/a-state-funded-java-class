package day12;

import java.util.HashMap;

public class HashMapExample1 {
	public static void main(String args[]) {
//		HashMap<String, Integer> map = new HashMap<String, Integer>();
		HashMap<String, Integer> map = new HashMap<>();
		map.put("해리", Integer.valueOf(95)); //Integer.valueOf(95) = Integer형 객체 생성
		map.put("헤르미온느", 100);
		map.put("론", 85);
		map.put("드레이코", 93);
		map.put("네빌", 70);
		map.put("헤르미온느", 55); // JDK 1.5 Auto Boxing 구문 -> 자동으로 Integer 객체로 바뀐다. -> 이전에 보관된 100 값을 55로 대체된다.
		//HashSet은 키에 같은 값이 있다면 값을 넣지 않는다.
		System.out.println(map);
		Integer num = map.get("헤르미온느");
		System.out.println("헤르미온느의 성적은? " + num);
		System.out.println(map); //toString 오버라이딩되어 있음.
	}
}
