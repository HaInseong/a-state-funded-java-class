package day16;
class Tour  { //이넘은 이너 클래스로 많이 만든다.
   enum Season{
      SPRING, SUMMER, FALL, WINTER;
      
      String getMyName() {
    	  return "enum 입니당";
      }
   }
}
public class EnumTest3 {
   public static void main(String args[]) {
      Tour.Season day[] = Tour.Season.values(); 
      for(Tour.Season value  : day)
         System.out.println(value); 
      Tour.Season season = Tour.Season.valueOf("SUMMER");
      System.out.println("Tour.Season.valueOf(\"SUMMER\") : " + season); 
      System.out.println(season.getMyName());      
   }
}





