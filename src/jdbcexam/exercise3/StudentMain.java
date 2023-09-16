package jdbcexam.exercise3;

import java.util.Scanner;

public class StudentMain {

	public static void main(String[] args) {
//		StudentDAO crud = new StudentDAO();
		Scanner scan = new Scanner(System.in);
		StudentController crud = new StudentController();

		loop: while (true) {
			System.out.println("[ 처리하려는 기능을 선택하세요. ]");
			System.out.println("1. 학생 정보 출력"); // R, StudentController의 printAll()을 호출한다.
			System.out.println("2. 학생 정보 입력"); // C
			System.out.println("3. 학생 정보 삭제"); // D
			System.out.println("4. 학생 정보 수정"); // U
			System.out.println("5. 학생 점수 확인"); // R
			System.out.println("6. 종료");
			String aws = "";
			aws = scan.nextLine();


			switch (aws) {
			case "1":
				crud.printAll();
				break;
			case "5":
				System.out.print("조회할 학생 이름을 입력해주세요 : ");
				String name = scan.nextLine();
				crud.printScore(name);

			}
		}
	}

}
