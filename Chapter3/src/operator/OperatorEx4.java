package operator;

public class OperatorEx4 {

    public static void main(String[] args) {

        // evaluation이 되지 않는 현상 test

        int num1 = 10;
        int i = 2;

        // sort circuit evaluation - 앞에만 봐도 평가가 되는 것
        // 단락 회로 평
        boolean value = ((num1 = num1 + 10) >  10) && ( (i = i + 2) < 10);
        System.out.println(num1);
        System.out.println(i);

        System.out.println(value);

        int num2 = 10;
        int num3 = 20;

        int max = (num2 > num3) ? num2 : num3;

        System.out.println(max);
    }
}
