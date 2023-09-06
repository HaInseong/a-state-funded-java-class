package day15;
//anonymous local class 예제코드
abstract class Test {
	Test() {
		System.out.println("No Argument sample");
	}

	abstract void output(String s);
}

public class InnerTest3 {
	void pr(Test o) {
		o.output("Test");
	}

	public static void main(String args[]) {
		System.out.println("Main start !!");
		InnerTest3 n = new InnerTest3();
		n.pr(new Test() { //어나니머스 이너 클래스를 정의하는 블록, Test라는 클래스의 자식이 된다.
			int su = 100;
			
			@Override
			public void output(String s) {
				System.out.println("Anonymous Class : " + s);
				System.out.println("Anonymous Class : " + su);
			}
		});
	}
}
