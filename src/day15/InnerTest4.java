package day15;

interface Testable {
	final static String FS = "Interface Test";

	abstract void output(String s);
}

public class InnerTest4 {
	void pr(Testable o) {
		o.output("Test");
		System.out.println(Testable.FS);
		// System.out.println(o.su); // 자손에서 추가된 멤버는 접근할 수 없다.
	}

	public static void main(String args[]) {
		System.out.println("Main start !!");
		InnerTest4 n = new InnerTest4();
		// 이 이름 없는 Inner 클래스는 Testable 와 Object 의 자손이 된다.
		n.pr(new Testable() { //추상이나 인터페이스든 객체생성식에서는 new로 객체생성식 줘야한다.
			int su = 100;

			public void output(String s) {
				System.out.println("Anonymous Class : " + s);
				System.out.println("Anonymous Class : " + su);
			}
		});
	}
}
