package day14;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
public class ImageIOLab {

    public static void main(String[] args) {
        String path = "C:/iotest/myimage";
        File isDir = new File(path);
        if (!isDir.exists()) {
            isDir.mkdirs(); //파일클래스의 메서드로 파일 생성
        }

        try {
            BufferedReader br = new BufferedReader(new FileReader("list.txt"));
            String line;

            while ((line = br.readLine()) != null) {
                String[] parts = line.split(",");
                if (parts.length == 2) {
                    String imageName = parts[0].trim();
                    String imageUrl = parts[1].trim();

                    URL req = new URL(imageUrl);
                    InputStream is = req.openStream(); //url로 지정한 객체 읽어와서 저장
                    
                    String fileName = "c:/iotest/myimage/" + imageName + ".jpg"; // 생성되는 이미지 파일명
                    
                    FileOutputStream fos = new FileOutputStream(fileName);
                    int input;
                    while ((input = is.read()) != -1) {
                        fos.write(input);
                    }
                    fos.close();
                    System.out.println(imageName + ".jpg가 성공적으로 저장되었습니다.");
                }
            }
            br.close();

        } catch (MalformedURLException e) {
            System.out.println("URL 문자열 오류: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("IO 오류: " + e.getMessage());
        }
    }
}





