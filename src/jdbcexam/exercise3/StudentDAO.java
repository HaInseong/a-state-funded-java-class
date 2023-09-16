package jdbcexam.exercise3;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import jdbcexam.mvc.MySQLConnUtil;

public class StudentDAO {

	public boolean insertStudent(StudentDTO dto) {
		boolean result = false;
		Scanner scan = new Scanner(System.in);
		Connection conn = MySQLConnUtil.connect();
		try (PreparedStatement pstmt = conn.prepareStatement("insert into student (name, score) values (?, ?)")) {
			while (true) {
				System.out.print("학생 이름을 입력하세요 : ");
				String name = scan.nextLine();
				System.out.print("점수를 입력하세요 : ");
				int score = Integer.parseInt(scan.nextLine());
				pstmt.setString(1, name); //dto.getName()
				pstmt.setInt(2, score); //dto.getScore()
				pstmt.executeUpdate();
				System.out.println("student 테이블에 데이터 삽입 완료");
				System.out.print("계속 입력하겠습니까?(y/n) ");
				String aws = scan.nextLine();
				if (aws.equalsIgnoreCase("y")) {
					continue;
				}
				break;
			}
			result = true; // 잘 처리 됐다면 true 리턴

		} catch (SQLException se) {
			System.out.println(se.getMessage());
		}
		scan.close();
		MySQLConnUtil.close(conn);
		return result;

	}

	public List<StudentDTO> getAllStudent() {
		Connection conn = MySQLConnUtil.connect();
		List<StudentDTO> slist = null;
		try (Statement stmt = conn.createStatement()) {
			ResultSet rs = stmt.executeQuery("select name from student");
			slist = new ArrayList<StudentDTO>();
			StudentDTO vo;
			while (rs.next()) {
				vo = new StudentDTO();
				vo.setName(rs.getString("name"));
				slist.add(vo);
			}
		} catch (SQLException se) {
			System.out.println(se.getMessage());
		}
		MySQLConnUtil.close(conn);
		return slist;
	}

	public int getScore(StudentDTO dto) {
		Connection conn = MySQLConnUtil.connect();
		int result = -1;
		try (Statement stmt = conn.createStatement()) {
			ResultSet rs = stmt.executeQuery("select score from student where name = '" + dto.getName() + "'");
			if(rs.next()) {
				result = rs.getInt("score");
				System.out.println(result);
			}
		} catch (SQLException se) {
			System.out.println(se.getMessage());
		}
		MySQLConnUtil.close(conn);
		return result;

	}

	public boolean updateStudent(StudentDTO dto) {
		boolean result = false;
		Scanner scan = new Scanner(System.in);
		Connection conn = MySQLConnUtil.connect();
		try (PreparedStatement pstmt = conn.prepareStatement("update student set name = ?,  score = ?")) {
			while (true) {
				// 존재하지 않는 학생명으로 호출한 경우 -1리턴
				System.out.print("수정할 작성자 이름을 입력하세요 : ");
				String name = scan.nextLine();
				System.out.print("수정할 점수를 입력하세요 : ");
				int score = Integer.parseInt(scan.nextLine());
				pstmt.setString(1, name);
				pstmt.setInt(2, score);
				pstmt.executeUpdate();
				System.out.println("student 테이블에 데이터 수정 완료");
				System.out.print("계속 입력하겠습니까?(y/n) ");
				String aws = scan.nextLine();
				if (aws.equalsIgnoreCase("y")) {
					continue;
				}
				break;
			}
			result = true;

		} catch (SQLException se) {
			System.out.println(se.getMessage());
		}
		scan.close();
		MySQLConnUtil.close(conn);
		return result;
	}

	public boolean deleteStudent(StudentDTO dto) {
		boolean result = false;
		Connection conn = MySQLConnUtil.connect();
		try (PreparedStatement pstmt = conn.prepareStatement("delete from student where name = ?")) {
			pstmt.setString(1, "name");
			pstmt.executeUpdate();
			result = true;
		} catch (SQLException se) {
			System.out.println(se.getMessage());
		}
		MySQLConnUtil.close(conn);
		return result;
	}

}
