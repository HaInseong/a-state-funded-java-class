package jdbcexam;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class SearchEmp2 {
	public static void main(String[] args) throws Exception {
		String url = "jdbc:mysql://localhost:3306/edudb?characterEncoding=UTF-8&serverTimezone=UTC";
		String user = "jdbctest";
		String passwd = "jdbctest";
		Connection conn = DriverManager.getConnection(url, user, passwd);
		Statement stmt = conn.createStatement();

		ResultSet rs = stmt.executeQuery("select ename, job, sal, deptno  from emp where ename like '%T%'");
		if(rs.next()) {
			System.out.printf("%8s%8s%8s%4s\n", "성명", "직무", "급여", "부서");
			System.out.println("  -----------------------------------");
			do {
				System.out.printf("%10s%12s%8d%4d\n", rs.getString("ename"), rs.getString("job"), rs.getInt("sal"),
						rs.getInt("deptno"));
			}
			while (rs.next());
		} else {
			System.out.println("이름에 T가 들어간 직원은 없습니다.");
		}
		rs.close();
		stmt.close();
		conn.close();
	}
}
