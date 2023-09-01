package day12.exercise;

import java.util.HashMap;
import java.util.Scanner;

public class HashMapLab1 {

	public static void main(String[] args) {
		HashMap<String, Integer> map = new HashMap<>();
		//단 입력되는 나라명은 달라야한다. containsKey
		
		String local = null;
		int num = 0;
		Scanner scanner = new Scanner(System.in);
		
		for(int i=0; i<5; i++) {
			System.out.print("나라 이름을 입력하세요: ");
			local = scanner.next();
			if(map.containsKey(local)) {
				System.out.println("나라명 " + local + "은 이미 저장되었습니다. 다른 나라를 입력해주세요.");
				i--;
			} else {
				System.out.print("인구수를 입력하세요: ");
				num = scanner.nextInt();
				System.out.println("저장되었습니다.");
				map.put(local, num); 
			}
		} 
		System.out.println("5개가 모두 입력되었습니다.");
		System.out.print("입력된 데이터: ");
		
		for(String key : map.keySet()) {
			System.out.printf("%s(%d) ", key, map.get(key));
		}
		scanner.close();
	}

}
