package jdbcexam.exercise;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Random;

public class SelectEmpLab {

	public static void main(String[] args) throws Exception {
		String url = "jdbc:mysql://localhost:3306/edudb?characterEncoding=UTF-8&serverTimezone=UTC";
		String user = "jdbctest";
		String passwd = "jdbctest";
		Connection conn = DriverManager.getConnection(url, user, passwd);
		Statement stmt = conn.createStatement();

		Random random = new Random();
		ResultSet rs = stmt.executeQuery(
				"select ename, concat(format(sal, 0),'달러') sal, year(hiredate), month(hiredate), day(hiredate) FROM emp");
		if (random.nextBoolean()) {
			while (rs.next()) {
				System.out.println(rs.getString("ename") + " 직원의 월급은 " + rs.getString("sal") + "입니당.");
			}
		} else {
			while (rs.next()) {
				System.out.println(rs.getString("ename") + " 직원은 " + rs.getString("year(hiredate)") + "년 "
						+ rs.getString("month(hiredate)") + "월 " + rs.getString("day(hiredate)") + "일에 입사하였습니당.");
			}
		}
		rs.close();
		stmt.close();
		conn.close();
	}

}
