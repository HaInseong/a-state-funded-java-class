package day8_practice;

public class GuGuDanApp {
	public static void main(String args[]) {
		int dan = (int) (Math.random() * 20) + 1;
		int number = (int) (Math.random() * 20) + 1;
		
	    if (dan >= 1 && dan <= 9 && number >= 1 && number <= 9) {
	        GuGuDanExpr expr1 = new GuGuDanExpr(dan, number);
	        System.out.print(dan + "*" +  number + "=");
	        expr1.printPart();
	    } else if (dan >= 1 && dan <= 9 && number >= 10) {
	        GuGuDanExpr expr2 = new GuGuDanExpr(dan);
	        System.out.print(dan + "단:");
	        expr2.printPart();
	    } else if (dan >= 10) {
	        GuGuDanExpr.printAll();
	    } 
	}

}
