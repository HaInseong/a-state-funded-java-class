package day14;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.Date;
public class SerialTest1 {
   public static void main(String[] args) throws Exception{ 
      FileOutputStream fos = new FileOutputStream("c:/iotest/test1.ser"); //파일 존재하지 않을 경우 파일 생성함, 폴더까지 생성하진 않음.
      ObjectOutputStream oos = new ObjectOutputStream(fos); //fos를 매개변수로 받아서 또 다른 Stream 객체를 만들어서 연결시킴.
      oos.writeObject(new Date()); //바이트단위로 변환해서 보관
      Thread.sleep(3000);
      oos.writeObject(new Date());      
      oos.close();
      fos.close();
      System.out.println("직렬화 출력 완료");      
   }
}



