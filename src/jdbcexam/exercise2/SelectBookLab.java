package jdbcexam.exercise2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class SelectBookLab {

	public static void main(String[] args) {

		String url = "jdbc:mysql://localhost:3306/edudb?characterEncoding=UTF-8&serverTimezone=UTC";
		String user = "jdbctest";
		String passwd = "jdbctest";

		try (Connection conn = DriverManager.getConnection(url, user, passwd);
				Statement stmt = conn.createStatement();
				Scanner scan = new Scanner(System.in);) {

			while (true) {
				System.out.println("1. 모두 출력하기");
				System.out.println("2. 가격이 높은 순으로 출력하기");
				System.out.println("3. 20000 이상의 도서들만 출력하기");
				System.out.println("4. 웹 프로그래밍 도서들만 출력하기");
				System.out.println("5. 데이터베이스와 인프라 도서들만 출력하기");
				System.out.println("6. 도서명에 '자바'를 포함하는 도서들만 출력하기");
				System.out.println("7. 분류별 도서 가격의 평균을 출력하기");
				System.out.print("원하는 메뉴의 번호를 선택 : ");
				String num = scan.nextLine();

				if (num.equals("1")) { // 모든 행과 열 출력
					ResultSet rs = stmt
							.executeQuery("select id, title, concat(format(price, 0), '원') price, kind from book");
					System.out.printf("%s%25s%30s%30s\n", "id", "제목", "가격", "종류");
					System.out.println(
							"---------------------------------------------------------------------------------------------");
					while (rs.next()) {
						System.out.printf("%-5d%25s%30s%30s\n", rs.getInt("id"), rs.getString("title"),
								rs.getString("price"), rs.getString("kind"));
					}
					rs.close();
				}

				if (num.equals("2")) { // 모든 행과 열 출력
					ResultSet rs = stmt.executeQuery(
							"select id, title, concat(format(price, 0), '원') price, kind from book order by price desc");
					System.out.printf("%s%25s%30s%30s\n", "id", "제목", "가격", "종류");
					System.out.println(
							"---------------------------------------------------------------------------------------------");
					while (rs.next()) {
						System.out.printf("%-5d%25s%30s%30s\n", rs.getInt("id"), rs.getString("title"),
								rs.getString("price"), rs.getString("kind"));
					}
					rs.close();
				}

				if (num.equals("3")) {
					ResultSet rs = stmt.executeQuery(
							"select title, concat(format(price, 0), '원') price from book where price >= 20000");
					System.out.printf("%20s%25s\n", "제목", "가격");
					System.out.println("--------------------------------------------------------------");
					while (rs.next()) {
						System.out.printf("%25s%20s\n", rs.getString("title"), rs.getString("price"));
					}
					rs.close();
				}

				if (num.equals("4")) {
					ResultSet rs = stmt.executeQuery(
							"select title, concat(format(price, 0), '원') price from book where kind = 'b02'");
					System.out.printf("%20s%25s\n", "제목", "가격");
					System.out.println("--------------------------------------------------------------");
					while (rs.next()) {
						System.out.printf("%25s%20s\n", rs.getString("title"), rs.getString("price"));
					}
					rs.close();
				}

				if (num.equals("5")) {
					ResultSet rs = stmt.executeQuery(
							"select title, concat(format(price, 0), '원') price from book where kind in('b02', 'b05')");
					System.out.printf("%20s%25s\n", "제목", "가격");
					System.out.println("--------------------------------------------------------------");
					while (rs.next()) {
						System.out.printf("%25s%20s\n", rs.getString("title"), rs.getString("price"));
					}
					rs.close();
				}

				if (num.equals("6")) {
					ResultSet rs = stmt.executeQuery(
							"select title, concat(format(price, 0), '원') price from book where title like '%자바%'");
					System.out.printf("%20s%25s\n", "제목", "가격");
					System.out.println("--------------------------------------------------------------");
					while (rs.next()) {
						System.out.printf("%25s%20s\n", rs.getString("title"), rs.getString("price"));
					}
					rs.close();
				}

				if (num.equals("7")) {
					ResultSet rs = stmt.executeQuery(
							"select kind, concat(format(avg(price),0), '원') price from book group by kind");
					System.out.println("--------------------------분류별 도서 가격의 평균--------------------------");
					while (rs.next()) {
						if (rs.getString("kind").equals("b01")) {
							System.out.println("프로그래밍 언어 도서들의 가격 평균은 " + rs.getString("price") + " 입니다.");
						}
						if (rs.getString("kind").equals("b02")) {
							System.out.println("웹 프로그래링 도서들의 가격 평균은 " + rs.getString("price") + " 입니다.");
						}
						if (rs.getString("kind").equals("b03")) {
							System.out.println("빅데이터 도서들의 가격 평균은 " + rs.getString("price") + " 입니다.");
						}
						if (rs.getString("kind").equals("b04")) {
							System.out.println("데이터베이스 도서들의 가격 평균은 " + rs.getString("price") + " 입니다.");
						}
						if (rs.getString("kind").equals("b05")) {
							System.out.println("인프라 도서들의 가격 평균은 " + rs.getString("price") + " 입니다.");
						}
					}
					rs.close();
				}

				System.out.println();

				if (!num.equals("1") && !num.equals("2") && !num.equals("3") && !num.equals("4") && !num.equals("5")
						&& !num.equals("6") && !num.equals("7")) {
					System.out.println("잘못입력하셨습니다. 다시 번호를 선택해주세요!\n\n");
					continue;
				}

				System.out.print("계속 조회하겠습니까?(y/n)");
				String aws = scan.nextLine();
				System.out.println();
				if (aws.equalsIgnoreCase("y")) {
					System.out.println("-------------------------재조회합니다-------------------------");
					continue;
				} else {
					System.out.println("종료합니다.");
				}

				break;
			}
		} catch (SQLException se) {
			System.out.println(se.getMessage());
		}
	}

}
