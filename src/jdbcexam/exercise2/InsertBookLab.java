package jdbcexam.exercise2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class InsertBookLab {

	public static void main(String[] args) {
		String url = "jdbc:mysql://localhost:3306/edudb?characterEncoding=UTF-8&serverTimezone=UTC";
		String user = "jdbctest";
		String passwd = "jdbctest";

		try (Connection conn = DriverManager.getConnection(url, user, passwd);
				PreparedStatement pstmt = conn.prepareStatement("insert into book (title, price, kind) values (?, ?, ?)");
				Scanner scan = new Scanner(System.in);) {
			int dataCount = 0;
			while (true) {
				System.out.print("도서명을 입력하세요 : ");
				String title = scan.nextLine();
				System.out.print("가격을 입력하세요 : ");
				int price = Integer.parseInt(scan.nextLine());
				System.out.println("도서 분류에 대한 넘버를 입력하세요.");
				System.out.println("1. 프로그래밍 언어");
				System.out.println("2. 웹 프로그래밍");
				System.out.println("3. 빅데이터");
				System.out.println("4. 데이터베이스");
				System.out.println("5. 인프라");
				System.out.print("선택(1~5) : ");
				String kind = scan.nextLine();
				if(kind.equals("1")) {
					kind = "b01";
				} else if(kind.equals("2")) {
					kind = "b02";
				} else if(kind.equals("3")) {
					kind = "b03";
				} else if(kind.equals("4")) {
					kind = "b04";
				} else if(kind.equals("5")) {
					kind = "b05";
				} else {
					System.out.println("잘못입력하셨습니다. 다시 입력해주세요.");
					continue;
				}
				
				pstmt.setString(1, title);
				pstmt.setInt(2, price);
				pstmt.setString(3, kind);
				pstmt.executeUpdate();
				System.out.println("정보가 입력되었습니다.");
				dataCount++;
				
				
				System.out.print("계속 입력하겠습니까?(y/n)");
				String aws = scan.nextLine();
				if (aws.equalsIgnoreCase("y")) {
					continue;
				}

				System.out.println(dataCount + "개의 데이터 입력 완료!");
				break;
			}
		} catch (SQLException se) {
			System.out.println(se.getMessage());

		}
	}
}
