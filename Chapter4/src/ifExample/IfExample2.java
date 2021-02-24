package ifExample;

import java.util.Scanner;

public class IfExample2 {
    public static void main(String[] args) {

        // 입장료 계산하기
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();

        int charge = 0;

        if (age < 8) {
            charge = 1000;
        } else if (age < 14) {
            charge = 1500;
            System.out.println("초등학생");
        } else if (age < 20) {
            charge = 2000;
            System.out.println("중고등학");
        } else {
            charge = 3000;
        }
        System.out.println("나이: " + age);
        System.out.println("요금: " + charge);
        }

    }
