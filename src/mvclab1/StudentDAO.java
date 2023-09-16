package mvclab1;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import jdbcexam.mvc.MySQLConnUtil;

public class StudentDAO {
	public List<StudentDTO> vlist;
	public boolean insertStudent(StudentDTO dto) {
		boolean result = false;
		Connection conn = MySQLConnUtil.connect();
		try(PreparedStatement pstmt = conn.
				prepareStatement("insert into student (name,score) values (?,?)")){			
				pstmt.setString(1, dto.getName());
				pstmt.setInt(2, Integer.valueOf(dto.getScore()));
				pstmt.executeUpdate();			
				result = true;
		}catch (SQLException e) {
			System.out.println(e.getMessage());
			//result = false;
		}
		MySQLConnUtil.close(conn);
		return result;
	}
	
	public List<StudentDTO> getAllStudent() {
		Connection conn = MySQLConnUtil.connect();
		vlist = null;
		try (Statement stmt = conn.createStatement()) {
			ResultSet rs = stmt.executeQuery(
					"select name, score from student");
			vlist = new ArrayList<StudentDTO>();
			StudentDTO vo;
			while (rs.next()) {
				vo = new StudentDTO();				
				vo.setName(rs.getString("name"));
				vo.setScore(rs.getInt("score"));
				vlist.add(vo);
			}
		} catch (SQLException se) {
			System.out.println(se.getMessage());
		}
		MySQLConnUtil.close(conn);
		return vlist;
	}
	public int getScore(StudentDTO dto) {
		Connection conn = MySQLConnUtil.connect();
		int result = -1;
		try (Statement stmt = conn.createStatement()) {			
			ResultSet rs = stmt.executeQuery(
					"select score from student where name = '"+dto.getName()+"'");
			if(rs.next()) 			
				result = rs.getInt("score");					
		} catch (SQLException se) {
			System.out.println(se.getMessage());
		}
		MySQLConnUtil.close(conn);
		return result;
	}

	public boolean updateStudent(StudentDTO dto) {
		boolean result = false;
		Connection conn = MySQLConnUtil.connect();
		try (PreparedStatement pstmt = conn.prepareStatement("update student set score = ? where name = ?")) {		
			pstmt.setInt(1, dto.getScore());
			pstmt.setString(2, dto.getName());
			pstmt.executeUpdate();		
			result = true;
		} catch (SQLException se) {
			System.out.println(se.getMessage());
		}
		MySQLConnUtil.close(conn);
		return result;
	}

	public boolean deleteStudent(StudentDTO dto) {
		boolean result = false;
		Connection conn = MySQLConnUtil.connect();
		try (PreparedStatement pstmt = conn.prepareStatement("delete from student where name = ?")) {
			pstmt.setString(1, dto.getName());
			pstmt.executeUpdate();
			result = true;
		} catch (SQLException se) {
			System.out.println(se.getMessage());
		}
		MySQLConnUtil.close(conn);
		return result;
	}

}
