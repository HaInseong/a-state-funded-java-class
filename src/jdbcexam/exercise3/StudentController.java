package jdbcexam.exercise3;

import java.util.ArrayList;
import java.util.List;

public class StudentController {
	StudentDAO crud = new StudentDAO();
	List<StudentDTO> slist = new ArrayList<>();
	
	
	
	public void printAll() {
		slist = crud.getAllStudent();
		System.out.println(slist);
	}
	
	public void printScore(String name) {
		StudentDTO dto = new StudentDTO();
		dto.setName(name);
		int score = crud.getScore(dto);
		dto.setScore(score);
		if(score < 0) {
			System.out.println(name + " 학생은 존재하지 않습니다.");
		} else {
			System.out.println(name + "학생의 점수는 " + score + "입니다.");
		}
	}
	
	public void insert(String name, int socre) {
	}
	
	public void update(String name, int score) {
	}
	
	public void delete(String name) {
	}

}
