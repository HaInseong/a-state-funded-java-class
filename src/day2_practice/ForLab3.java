package day2_practice;

public class ForLab3 {
    public static void main(String[] args) {
        int min = 1; 
        int max = 10; 
        int firstRandom = (int) (Math.random() * (max - min + 1)) + min;

        min = 30; 
        max = 40; 
        int secondRandom = (int) (Math.random() * (max - min + 1)) + min;

        int sumOfEvens = 0; 

        for (int i = firstRandom; i <= secondRandom; i++) {
            if (i % 2 == 0) { 
                sumOfEvens += i;
            }
        }

        System.out.println(firstRandom + " 부터 " + secondRandom + " 까지의 짝수의 합 : " + sumOfEvens);
    }
}
