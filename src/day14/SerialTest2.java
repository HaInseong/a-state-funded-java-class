package day14;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.Date;
public class SerialTest2 {
   public static void main(String[] args) throws Exception{ 
      FileInputStream fis = new FileInputStream("c:/iotest/test1.ser"); 
      ObjectInputStream ois = new ObjectInputStream(fis); 
      Date value1 = (Date)ois.readObject(); //SerialTest1에서 바이트 단위로 변환되어 저장된 값을 저장한 타입으로 그대로 읽겠다면 형변환 필수
      Date value2 = (Date)ois.readObject();
      System.out.println("Date객체 데이터 : " + value1); 
      System.out.println("Date객체 데이터 : " + value2); 
      ois.close();
      fis.close();
   }
}



