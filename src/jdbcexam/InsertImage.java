package jdbcexam;
import java.io.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class InsertImage {
	public static void main(String[] args) {
		String url = "jdbc:mysql://localhost:3306/edudb?characterEncoding=UTF-8&serverTimezone=UTC";
		String user = "jdbctest";
		String passwd = "jdbctest";
		try (Connection conn = DriverManager.getConnection(url, user, passwd);
				Scanner scan = new Scanner(System.in);
				PreparedStatement pstmt = conn.prepareStatement("INSERT INTO imgtest (filename, imgcontent) VALUES (?, ?)")){
			System.out.print("저장할 이미지 파일명을 절대 패스로 입력하세요 : ");
			String name = scan.nextLine();
			File imgFile = new File(name); //입력된 절대패스 값으로 새로운 imgFile생성
			if (imgFile.exists()) {
				FileInputStream fin = new FileInputStream(imgFile); //파일을 오픈하여 내용을 읽는 기능을 가진 스트림, 바이너리 파일이므로 바이트 스트림을 사용함.
				pstmt.setString(1, imgFile.getName()); 
				pstmt.setBinaryStream(2, fin, (int)imgFile.length()); 
				//바이트 스트림 객체를 setBinaryStream로 설정함. 세번째 인자는 얼만큼 읽을건지를 지정해준다. 다만 length()의 리턴형이 long형인데 세번째 아규먼트는 리턴값을 int형만 받으므로 int형으로 형변환해줘야한다.
				pstmt.executeUpdate(); 
				System.out.println("이미지 삽입 성공");
			} else {
				System.out.println("[오류] 이미지가 존재하지 않음");
			}
		} catch(Exception e) {
			System.out.println(e);
		}
	}
}
