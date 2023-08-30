package day10;

public class RuntimeTest {

	public static void main(String[] args) throws Exception {
		Runtime r = Runtime.getRuntime(); //자바 프로그램이 아닌 외부 응용프로그램을 띄울 수 있음
		r.exec("c:/windows/notepad.exe");
		//JVM이 하나이기 때문에 1개만 생성 가능하다.
		//JVM = Runtime이라고 생각하면된다.
		//메모장을 JVM이 실행시켜주는 것이다.
		System.out.println(r);
		Runtime r1 = Runtime.getRuntime();
		Runtime r2 = Runtime.getRuntime(); //객체를 여러개 생성한다고해서 3개가 생성되는게 아니라 1개만 생성해서 계속 재활용함.
		System.out.println(r1);
		System.out.println(r2); //참조값이 모두 같음
		r.gc(); //가비지 컬렉터를 jvm에게 요청함.
	}

}
