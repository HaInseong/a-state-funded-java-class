package lambdastream;

//@FunctionalInterface 
interface Test {
	void run();

	void print();
}
//추상 메서드가 2개라 람다식은 불가능하지만 어나니머스 이너 클래스로 구현은 가능하다.
public class LambdaTest4 {
	public static void main(String[] args) {
		Test test = new Test() {
			@Override
			public void run() {
				System.out.println("run");
			}

			@Override
			public void print() {
				System.out.println("print");
			}
		};
		test.run();
		test.print();
	}
}
