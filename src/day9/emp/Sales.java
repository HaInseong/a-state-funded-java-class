package day9.emp;

public class Sales extends Employee implements Bonus {
	
	public Sales() {}
	public Sales(String name, int number, String department, int salary) {
		//전부 조상에게 보내서 조상 필드에 세팅해야 함
		super(name, number, department, salary);
	}
	
	@Override
	public double tax() {
		return super.getSalary() * 0.13;
	}
	@Override
	public void incentive(int pay) {
		super.setSalary(super.getSalary() + (int)(pay * 1.2));
	}
	
	//추가 메서드
	public double getExtraPay() {
		return super.getSalary() * 0.03;
	}

}
