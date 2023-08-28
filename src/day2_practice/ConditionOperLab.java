package day2_practice;

public class ConditionOperLab {

	public static void main(String[] args) {
		int rand;

		do {
			rand = (int) (Math.random() * 5) + 1; // 1부터 5 사이의 랜덤한 값 추출
		} while (rand < 1 || rand > 5); // 범위를 벗어나면 다시 추출

		int result = 0; // 결과를 저장할 변수 초기화

		// 추출된 값에 따라 연산 수행
		if (rand == 1) {
			result = 300 + 50; // 덧셈 연산
		} else if (rand == 2) {
			result = 300 - 50; // 뺄셈 연산
		} else if (rand == 3) {
			result = 300 * 50; // 곱셈 연산
		} else if (rand == 4) {
			result = 300 / 50; // 나눗셈 연산
		} else if (rand == 5) {
			result = 300 % 50; // 나머지 연산
		}

		// 결과 출력
		System.out.println("결과값 : " + result);
	}

}
