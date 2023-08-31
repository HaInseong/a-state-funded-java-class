package day11.exercise;

import java.util.Random;

public class LottoMachine {
	private int[] nums;
	
	public LottoMachine() {
		nums = new int[6];
	}
	
	public void createLottoNums() {
		//1-20 사이의 6개 숫자를 추출하여 nums 배열에 저장한다.(단, Random 클래스를 사용)
		Random random = new Random();
		for(int i=0; i<6; i++) {
			int rNum;
			rNum = random.nextInt(20) + 1; //1부터 20사이의 난수 생성
			nums[i] = rNum;
		}
	}
	
	public void checkLottoNums() throws DuplicateException {
		//6개의 모든 숫자들이 유니크한지 체크하고 중복숫자가 발견되면 DuplicationException을 발생시킨다(throw, throws)
		 for (int i = 0; i < nums.length; i++) {
	            for (int j = i + 1; j < nums.length; j++) {
	                if (nums[i] == nums[j]) {
	                    throw new DuplicateException();
	                }
	            }
	        }
	}
	
	public int[] getNums() {
		return nums;
		
	}
}
