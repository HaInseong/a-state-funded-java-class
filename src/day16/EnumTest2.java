package day16;
enum Season2{
     봄, 여름, 가을 ,겨울 //자바는 유니코드를 지원하기 때문에 상수를 한글로 지정해도 된다.
}
public class EnumTest2 {
   public static void main(String args[]) {
      System.out.println(Season2.봄);
      System.out.println(Season2.여름);
      System.out.println(Season2.가을);
      System.out.println(Season2.겨울);     
   }
}
