package day14;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

//equals 메소드 자체가 자동으로 대소문자 구분해서 처리한다.

public class CountLab {

    public static void main(String[] args) {
        String filePath = "c:/kosastudy/eclipse-workspace/javaedu/javaedu/yesterday.txt"; // 파일 경로
//        String filePath = "yesterday.txt"; 이클립스 상대경로로 처리
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            int count = 0;
            String line;

            while ((line = br.readLine()) != null) {
                // "yesterday" 단어를 소문자로 변환하여 찾아 개수 카운팅
                String lowerLine = line.toLowerCase();
                int index = lowerLine.indexOf("yesterday");
                while (index != -1) {
                    count++;
                    index = lowerLine.indexOf("yesterday", index + 1);
                }
            }

            System.out.println("소문자 yesterday 라는 단어는 " + count + "개 있습니다.");
        } catch (IOException e) {
            System.out.println("파일을 읽는 동안 오류가 발생했습니다.");
        }
    }
}
