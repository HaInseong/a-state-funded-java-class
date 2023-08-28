package exercise;



public class StudentTest {
	public static void main(String[] args) {
		
		Student[] studentArr = new Student[3];
		
		studentArr[0] = new Student("홍길동", 20, 171, 81, "201101", "영문");
		studentArr[1] = new Student("고길동", 21, 183, 72, "201102", "건축");
		studentArr[2] = new Student("박길동", 22, 175, 65, "201103", "컴공");
		
		//향상된 for문 처리가 더 깔끔하다.
		//첫번째 요소부터 끝까지 꺼내서 처리할 때는 enhancement for가 보기에 더 깔끔하고 속도도 빠르다.
		for(int i=0; i<studentArr.length; i++) {
			System.out.println(studentArr[i].printInformation());
		}
		
	}

}
