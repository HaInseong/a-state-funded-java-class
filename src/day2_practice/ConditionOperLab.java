package day2_practice;

public class ConditionOperLab {

	public static void main(String[] args) {
		int rand;

		do {
			rand = (int) (Math.random() * 5) + 1; // 1부터 5 사이의 랜덤한 값 추출
		} while (rand < 1 || rand > 5); // 범위를 벗어나면 다시 추출

		int result = 0; 

		if (rand == 1) {
			result = 300 + 50; 
		} else if (rand == 2) {
			result = 300 - 50; 
		} else if (rand == 3) {
			result = 300 * 50; 
		} else if (rand == 4) {
			result = 300 / 50; 
		} else if (rand == 5) {
			result = 300 % 50; 
		}
		
		System.out.println("결과값 : " + result);
	}

}
