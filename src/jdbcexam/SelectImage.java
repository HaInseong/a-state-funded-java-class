package jdbcexam;

import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.sql.Connection;
import java.util.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class SelectImage {
	public static void main(String[] args) {
		String url = "jdbc:mysql://localhost:3306/edudb?characterEncoding=UTF-8&serverTimezone=UTC";
		String user = "jdbctest";
		String passwd = "jdbctest";
		try (Connection conn = DriverManager.getConnection(url, user, passwd);
				Scanner scan = new Scanner(System.in);
				PreparedStatement pstmt = conn.prepareStatement("SELECT filename, imgcontent FROM imgtest WHERE filename = ?");) {
			System.out.print("읽으려는 이미지의 파일명을 입력하세요 : ");
			String name = scan.nextLine();
			pstmt.setString(1, name);
			ResultSet rs = pstmt.executeQuery();
			if (rs.next()) {
				String imgName[] = rs.getString("filename").split("\\."); //.(점)을 기준으로 분리하겠다는 의미 = 확장자하고 파일명을 분리시키기 위해서, 정규표현식 점인지 일반문자 점인지를 구분하기 위해서 \\를 줘야한다.
				File imgFile = new File("c:/Temp/"+imgName[0]+new Date().getTime()+"."+imgName[1]); //getTime은 유닉스 시간을 추출함. = 유닉스 시간을 기준으로 이미지를 읽어온 시간을 알 수 있음.
// --- study start
				InputStream is = rs.getBinaryStream("imgcontent"); //InputStream은 데이터를 byte 단위로 읽어들이는 통로이며 (읽어들인 데이터를 byte로 돌려줌)
				FileOutputStream fos = new FileOutputStream(imgFile); //파일을 오픈하여 내용을 작성하는 기능을 가진 스트림, imgFile에 내용을 작성할 수 있도록 준비해줌.
				byte[] b = new byte[2048];
				int n;
				while ((n = is.read(b)) > 0) { //read 메서드는 더이상 읽을게 없으면 -1을 리턴함. imgcontent바이너리파일을 2048씩 읽어온다.
					fos.write(b, 0, n);
				}
				fos.close();
			} else {
				System.out.print(name + "이라는 파일명으로 저장된 이미지가 존재하지 않습니다. ");
			}
			System.out.println("이미지 읽기 성공");
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
