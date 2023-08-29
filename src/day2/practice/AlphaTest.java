package day2.practice;

public class AlphaTest {
    public static void main(String[] args) {
        int num = (int) (Math.random() * 26) + 1; 
        
        System.out.println("추출된 숫자 : " + num);
        
        char alphabet = (char) ('A' + num - 1);
        
        System.out.println(alphabet);
    }
}
