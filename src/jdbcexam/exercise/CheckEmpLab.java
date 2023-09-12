package jdbcexam.exercise;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class CheckEmpLab {

	public static void main(String[] args) throws Exception {
		String url = "jdbc:mysql://localhost:3306/edudb?characterEncoding=UTF-8&serverTimezone=UTC";
		String user = "jdbctest";
		String passwd = "jdbctest";
		Connection conn = DriverManager.getConnection(url, user, passwd);
		Statement stmt = conn.createStatement();

		Scanner scanner = new Scanner(System.in);
		System.out.print("직원 이름 입력하세용: ");
		String inputName = scanner.nextLine().toUpperCase();

		ResultSet rs = stmt.executeQuery(
				"select ename, year(hiredate), month(hiredate), deptno from emp where ename like '" + inputName + "'");
		boolean result = false;

		while (rs.next()) {
			System.out.println(rs.getString("ename") + " 직원은 근무중입니다. " + rs.getString("year(hiredate)") + "년 "
					+ rs.getString("month(hiredate)") + "월에 입사했고 현재 " + rs.getString("deptno") + "번 부서에서 근무하고 있습니다.");
			result = true;
		}

		if (!result) {
			System.out.println(inputName + " 직원은 근무하지 않습니다");
		}
		rs.close();
		scanner.close();
		stmt.close();
		conn.close();
	}

}
