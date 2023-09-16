package mvclab1;

import java.util.ArrayList;
import java.util.List;

public class StudentController {
	StudentDAO sdao = new StudentDAO();
	StudentDTO sdto = new StudentDTO();
	List<StudentDTO> rdto = new ArrayList<StudentDTO>();
	void printAll() {
		System.out.println("print 시작~");		
		rdto = sdao.getAllStudent();
		for(StudentDTO s : rdto) {
			System.out.println("학생이름: " + s.getName());
            System.out.println("점수: " + s.getScore());
		}
	}
	
	void printScore(String name) {
		sdto.setName(name);		
		int result = sdao.getScore(sdto);	
		if(result > 0) {
			System.out.println(name+"학생의 점수는 "+result+"입니다");
		}else {
			System.out.println(name+"학생은 존재하지 않습니다.");
		}		
	}
	void insert(String name, int score) {
		sdto.setName(name);	
		sdto.setScore(score);
		
		if(sdao.insertStudent(sdto)) {
			System.out.println("입력성공");
		}else {
			System.out.println("입력실패");
		}
	}
	void update(String name, int score) {
		sdto.setName(name);
		sdto.setScore(score);
		if(sdao.updateStudent(sdto)) {
			System.out.println(name+"학생의 점수를 변경했습니다");
		}else {
			System.out.println(name+"학생은 존재하지 않습니다.");
		}
	}
	void delete(String name) {
		sdto.setName(name);
		if(sdao.deleteStudent(sdto)) {
			System.out.println(name+"학생의 데이터를 삭제했습니다.");
		}else {
			System.out.println(name+"학생은 존재하지 않습니다");
		}
	}
	
}
