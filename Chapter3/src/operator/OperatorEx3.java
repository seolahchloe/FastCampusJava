package operator;

public class OperatorEx3 {

    public static void main(String[] args) {

        int score = 100;

        System.out.println(++score); // (1) 먼저 증가하고 출
//        score = score + 1;
//        score += 1 // 셋 다 같은 의미
        System.out.println(score++); // (1) 이 statement가 끝난 다음에
        System.out.println(score); // (2) 증가한다

        System.out.println(--score); // (1) 먼저 감소하고 출력

        System.out.println(score--); // (1) 먼저 statement 끝난 다음에
        System.out.println(score);  // (2) 감소한다.
    }
}
