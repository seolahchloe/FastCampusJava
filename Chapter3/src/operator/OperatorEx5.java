package operator;

public class OperatorEx5 {

    public static void main(String[] args) {

        int num1 = 0B0001010; // 10
        int num2 = 0B0000101; // 5

        System.out.println(num1 & num2); // 자리수가 1인 값이 없음
        System.out.println(num1 | num2);
        System.out.println(num1 ^ num2);

        System.out.println(num2 << 3);
        System.out.println(num2 >> 3);
    }
}
