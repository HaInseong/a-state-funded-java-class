package day8_practice;

class Multiplication {
	//static은 public 설정이 일반적이다.
	private int dan; //인스턴스 멤버변수는 잘못된 값이 설정되는 것을 막기 위해 private 설정, 메서드와 생성자를 통해서만 추출하고 설정할 수 있게 하는게 일반적이다.
	private int number;
	Multiplication() {}
	Multiplication(int dan) {
		this.dan = dan;
	}
	
	Multiplication(int dan, int number){ //number가 0이 아닌 경우는 이 생성자를 사용하여 객체를 생성하게 된다.
		this.dan = dan;
		this.number = number;
	}
	
	void printPart() {
		if (number == 0) {	       
			for(int n=1; n <= 9; n++)
				System.out.print("\t"+dan + "*" + n+ "="+dan*n);
			System.out.println();
		} else {
			System.out.println(dan*number);
		}
	}
}

