package day12.exercise;

import java.util.HashSet;
import java.util.Random;

public class HashSetLab1 {

	public static void main(String[] args) {

		HashSet<Integer> set = new HashSet<>();
		int num;
		Random random = new Random();
		
		System.out.print("오늘의 로또 번호: ");
		for (int i=0; i<10; i++) {
			do {
				num = random.nextInt(30) + 1;
			} while(!set.add(num)); //중복 데이터시 false 반환함.
				System.out.print(num + " ");
			
		}
		System.out.println();
		System.out.println("set에 저장된 값 -> " + set); //추출할 때 순서를 지키지 않고 무작위 출력
	}
}
