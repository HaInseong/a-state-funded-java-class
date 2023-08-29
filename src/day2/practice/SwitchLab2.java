package day2.practice;

public class SwitchLab2 {

    public static void main(String[] args) {
        int rand;

        do {
            rand = (int) (Math.random() * 5) + 1; // 1부터 5 사이의 랜덤한 값 추출
        } while (rand < 1 || rand > 5); // 범위를 벗어나면 다시 추출

        int result = 0;

        switch (rand) {
            case 1:
                result = 300 + 50;
                break;
            case 2:
                result = 300 - 50;
                break;
            case 3:
                result = 300 * 50;
                break;
            case 4:
                result = 300 / 50;
                break;
            case 5:
                result = 300 % 50;
                break;
            default:
                System.out.println("유효하지 않은 값입니다.");
                return; // 프로그램 종료
        }

        System.out.println("결과값 : " + result);
    }
}
