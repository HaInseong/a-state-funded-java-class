package day16;
enum SeasonInit{
   SPRING("봄"), SUMMER("여름"), FALL("가을"), WINTER("겨울"); //상수 이름만 나열한게 아니라 괄호 안에 값들을 주었다. 상수 이름과 상수의 값을 다르게 설정하고 싶은 경우
	//원래 이넘은 상수 이름이면서 동시에 값이 된다
	//이넘에 나열된 것들은 값은 중요치 않고 상수 자체를 쓰는게 중점이다.
   private final String name; //값을 받아 저장할 멤버변수와 생성잘르 준비해줘야한다.
   SeasonInit(String name){
      this.name = name;
   }
   String returnName(){
      return name;
   }
}
public class EnumTest4 {
   public static void main(String args[]) {
      SeasonInit day[] = SeasonInit.values();
      for(SeasonInit value  : day)
         System.out.println(value);
      for(SeasonInit value  : day)
    	 System.out.println(value.returnName()); 
      SeasonInit season = SeasonInit.valueOf("SUMMER");
      System.out.println("SeasonInit.valueOf(\"SUMMER\") : " + season); // SUMMER 출력
      System.out.println(	"SeasonInit.valueOf(\"SUMMER\").returnName() : " + season.returnName());  // 여름 출력 
   }
}
