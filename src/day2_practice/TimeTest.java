package day2_practice;

public class TimeTest {
    public static void main(String[] args) {
        int time = 32150; // 초 단위로 시간을 저장
        
        //1시간 == 3600초
        int hours = time / 3600;
        int minutes = (time % 3600) / 60; 
        int seconds = time % 60; 
        
        // 결과 출력
        System.out.println(hours + "시간 " + minutes + "분 " + seconds + "초");
    }
}

