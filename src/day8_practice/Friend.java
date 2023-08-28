package day8_practice;

class Friend extends Person {
	private String phoneNum;
	private String email;

	Friend(String name, String phoneNum, String email) { //모든 생성자는 생성될 때 부모의 생성자를 먼저 자동 호출한다.
		super(name); //super를 사용하지 않으면 해결할 수 없는 실습문제이다.
		this.phoneNum = phoneNum;
		this.email = email;
	}

	public String getInfo() {
		return super.getInfo() + "	" + phoneNum + "	" + email;
		//getInfo 호출시에는 StackOverFlowError 발생, 그래서 조상의 getInfo 호출
	}
}

