package day9.emp;

public class Company {
	public static void main(String[] args) {

		Employee[] employee = new Employee[2];

		employee[0] = new Secretary("Duke", 1, "secretary", 800);
		employee[1] = new Sales("Tuxi", 2, "sales", 1200);

		printEmployee(employee, false);
		
		//모든 직원에게 인센티브 100씩 지급 (직원에 따라 적용되는 인센티브 금액은 다르다)
//		for(Employee emp : employee) {
//			if(emp instanceof Secretary) { //전달된 자손의 객체가 어떤 것인지 확인하고 싶을 때 instanceof를 사용한다.
//				((Secretary)emp).incentive(100); 
//				//인터페이스 클래스로부터 물려받은 메서드의 경우 선조형 타입으로 호출하면 한번에 자손에서 구현된 메서드들을 동시에 모두 처리할 수 있다.
//				//ex. Bonus.incentive(100);
//			} else if(emp instanceof Sales) {
//				((Sales)emp).incentive(100);
//			} //else;
//		}
		
		for(Employee e : employee) {
			((Bonus)e).incentive(100);
		}
		
		
		//printEmployee() 메서드를 호출하여 Employee 배열의 객체들 정보와 세금을 출력한다.
		printEmployee(employee, true);
	}

	public static void printEmployee(Employee[] emp, boolean isTax) {
		if (isTax) {
			System.out.println("[인센티브 100 지급]");
			System.out.println("name" + "\t\t" + "department" + "\t\t" + "salary" + "\t\t" + "tax" + "\t\t" + "extra pay"); //tax 출력
			System.out.println("---------------------------------------------------------------------------------");
			for (Employee employee : emp) {
				if(employee instanceof Sales) { //만약 employee가 Sales 타입이라면 true
					System.out.println(employee.getName() + "\t\t" + employee.getDepartment() + "\t\t\t" + employee.getSalary() + "\t\t" + ((Sales)employee).tax() + "\t\t" + ((Sales)employee).getExtraPay());
				} 
				else {
					System.out.println(employee.getName() + "\t\t" + employee.getDepartment() + "\t\t" + employee.getSalary() + "\t\t" + ((Secretary)employee).tax()); //tax는 Employee형이라 굳이 자식형으로 형변환 할 필요 없었음
				}
			}
		} else { //isTax에 대한 if문의 else
			System.out.println("name" + "\t\t" + "department" + "\t\t" + "salary" + "\t\t" + "extra pay"); //tax 미출력
			System.out.println("-----------------------------------------------------------------");
			for (Employee employee : emp) {
				if(employee instanceof Sales) {
					System.out.println(employee.getName() + "\t\t" + employee.getDepartment() + "\t\t\t" + employee.getSalary() + "\t\t" + ((Sales)employee).getExtraPay() + "\n");
				} 
				else {
					System.out.println(employee.getName() + "\t\t" + employee.getDepartment() + "\t\t" + employee.getSalary() + "\t\t");
				}
			}
		}

	}

}
