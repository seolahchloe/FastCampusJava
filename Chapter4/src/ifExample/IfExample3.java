package ifExample;

import java.util.Scanner;

public class IfExample3 {
    public static void main(String[] args) {

        // 성적에 따라 학점 부여하기
        Scanner sc = new Scanner(System.in);

        int score = sc.nextInt();

        String grade = "";

        if (score <= 59) {
            grade = "F";
        } else if (score <= 69) {
            grade = "D";
        } else if (score <= 79) {
            grade = "C";
        } else if (score <= 89) {
            grade = "B";
        } else {
            grade = "A";
        }

        System.out.println("점수: " + score);
        System.out.println("성적: " + grade);
        }
    }
