package day11.exercise;
import day6.MethodTest9;

public class LottoGame {

	public static void main(String[] args) {
		LottoMachine machine = new LottoMachine();
		machine.createLottoNums(); // 로또번호 생성

		try {
			machine.checkLottoNums();
			int[] lottoNumbers = machine.getNums();
			System.out.print("로또 번호: ");
			//메서드 호출 여러가지 방법으로 시도해봄.
//			for (int lotto : lottoNumbers) {
//				System.out.print(lotto + " ");
//			}
			
//			LottoGame.printArray(lottoNumbers);
			
//			day6.MethodTest9.printArray(lottoNumbers);
			
			MethodTest9.printArray(lottoNumbers);
			
		} catch (DuplicateException e) {
			System.out.println(e.getMessage());
		}
	}

//	static void printArray(int[] p2) {
//		int index = 0;
//		for (int d : p2) {
//			System.out.printf("%d", d);
//			index++;
//			if (index < p2.length) {
//				System.out.print(", ");
//			}
//		}
//		System.out.printf("\n");
//	}
}
