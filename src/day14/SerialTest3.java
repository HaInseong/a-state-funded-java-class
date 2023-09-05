package day14;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import day7.Student2;
import java.util.Date;

//예외가 발생하는 이유: Student2는 implements Serializable 하지 않았다.
public class SerialTest3 {
   public static void main(String[] args) throws Exception{ 
      FileOutputStream fos = new FileOutputStream("c:/iotest/test2.ser"); 
      ObjectOutputStream oos = new ObjectOutputStream(fos);
      oos.writeObject(new Date());
      Thread.sleep(3000);
      oos.writeObject(new Date()); 
      Student2 st = new Student2("duke", 27, "Java프로그래밍"); //우리가 직접 만든 클래스를 write
      oos.writeObject(st);
      oos.close();
      fos.close();
      System.out.println("직렬화 출력 완료");      
   }
}



