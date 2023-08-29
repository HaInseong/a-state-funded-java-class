package day9;

public class TimeTest { 
      public static void main(String[] args) { 
            Time t = new Time(12, 35, 30); 
            System.out.println(t); 
            t.hour = 30; //외부에서 직접 멤버 변수에 접근 가능하도록 설계하면 잘못된 값이 들어오더라도 체크할 수 있는 방법이 없다. = 접근제어자와 메서드로 해결해야한다. 
            System.out.println(t); 
            t.minute = -10;
            System.out.println(t); 
      } 
}

class Time { 
      int hour; 
      int minute; 
      int second; 

      Time(int hour, int minute, int second) { 
            this.hour = hour; 
            this.minute = minute; 
            this.second =second; 
      } 

      public String toString() { 
    	  return String.format("%d시 %d분 %d초", hour, minute, second); // System.out.printf() - 화면으로 출력
      } 
} 