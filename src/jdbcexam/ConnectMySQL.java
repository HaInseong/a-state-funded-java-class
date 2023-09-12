package jdbcexam;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectMySQL {
	public static void main(String[] args) {
//		try {
//			Class.forName("com.mysql.cj.jdbc.Driver"); 요즘 시대에는 필요 없음. DriverManager.getConnection() 씀
//		} catch (ClassNotFoundException cnfe) {
//			System.out.println("해당 클래스를 찾을 수 없습니다." + cnfe.getMessage());
//			return;
//		} 
		String url = "jdbc:mysql://localhost:3306/edudb?characterEncoding=UTF-8&serverTimezone=UTC"; //jdbc url이라 함.
		String user = "jdbctest";
		String passwd = "jdbctest";
		try (Connection conn = DriverManager.getConnection(url, user, passwd);){ //DriverManager.getConnection메서드는 db에 접속하는 api이고 빌드패스에 등록된 정보로 알아서 찾음
			System.out.println(conn.getClass().getName());
			DatabaseMetaData md = conn.getMetaData();
			System.out.println("DBMS 서버 명 : "+md.getDatabaseProductName());
			System.out.println("DBMS 서버 버전 : "+md.getDatabaseProductVersion());
			System.out.println("사용자명 : "+md.getUserName()); 						
		} catch (SQLException se) {
			System.out.println(se.getMessage());
		}
	}
}
