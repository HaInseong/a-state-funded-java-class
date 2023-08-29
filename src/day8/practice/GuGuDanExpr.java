package day8.practice;

public class GuGuDanExpr extends Multiplication {
	GuGuDanExpr() {}
	GuGuDanExpr(int dan) {
	    super(dan);
	}

	GuGuDanExpr(int dan, int number) {
	    super(dan, number);
	}
	
	public static void printAll() { //멤버 필드와 상관없이 단독으로 사용하는 메서드의 경우는 static으로 사용할 수 있다. 메모리 할당하는 시기를 신경쓸 필요 없으므로.
	    for (int i=1; i<=9; i++) {
	        for (int j = 1; j <= 9; j++) {
	            System.out.print(i + "*" + j + "=" + i * j + " ");
	        }
	        System.out.println();
	    }
	}
}
