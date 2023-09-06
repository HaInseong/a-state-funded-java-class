package day15;

class ThreadEx04 {
	public static void main(String args[]) throws InterruptedException {
		long startTime = System.currentTimeMillis(); //currentTimeMillis은 스태틱이고, 현재 시스템 시간을 기준으로 해서..

		for (int i = 0; i < 20; i++) {
			System.out.printf("%s", new String("-"));
			Thread.sleep(1000);
		}
		//System.out.println("소요시간1:" +(System.currentTimeMillis()- startTime));

		for (int i = 0; i < 20; i++) {
			System.out.printf("%s", new String("|")); // pipe
			Thread.sleep(1000);
		}

		System.out.print("소요시간2:" + (System.currentTimeMillis() - startTime));
	}
}
