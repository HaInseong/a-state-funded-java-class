package mvclab1;

import java.util.Scanner;

public class StudentMain {
	public static void main(String[] args) {
	StudentController crud = new StudentController();
	Scanner scan = new Scanner(System.in);
	loop: while (true) {
		System.out.println("처리하려는 기능을 선택하세요.");
		System.out.println("1. 학생 정보 출력 "); //C
		System.out.println("2. 학생 정보 입력"); //R
		System.out.println("3. 학생 정보 삭제"); //U
		System.out.println("4. 학생 정보 수정"); //D
		System.out.println("5. 학생 점수 확인"); 
		System.out.println("6. 종료");
		System.out.print("입력 : ");
		String aws = "";
		aws = scan.nextLine();		
		String name;
		int score;
		switch (aws) {
		case "1":
			crud.printAll();				
			break;
		case "2":
			System.out.println("학생의 이름을 입력하시오 : ");
			name = scan.next();
			System.out.println("학생의 점수를 입력하시오 : ");
			score = scan.nextInt();	
			scan.nextLine();
			crud.insert(name,score);			
			break;
		case "3":
			System.out.println("삭제할 학생의 이름을 입력하시오 : ");
			name = scan.nextLine();
			crud.delete(name);				
			break;
		case "4":
			System.out.println("수정할 학생의 이름을 입력하시오 : ");
			name = scan.nextLine();
			System.out.println("수정할 학생의 점수를 입력하시오 : ");
			score = scan.nextInt();
			scan.nextLine();
			crud.update(name,score);			
			break;
		case "5":
			System.out.println("학생의 이름을 입력하시오 : ");
			name = scan.nextLine();
			crud.printScore(name);
			break;
		case "6":
			break loop;
		}				
		System.out.print("계속 입력하겠습니까?(y/n)");
        aws = scan.nextLine();			
		if (aws.equalsIgnoreCase("y")) {
			continue;
		}else {
			scan.close();
			break;
		}			
		
	}
	System.out.println("방명록 애플리케이션을 종료합니다.");
}

}
