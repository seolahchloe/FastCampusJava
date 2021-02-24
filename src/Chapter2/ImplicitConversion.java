package Chapter2;

public class ImplicitConversion {
    public static void main(String[] args) {

        byte bNUm = 10;
        int iNum = bNUm; // 묵시적 형 변환 - 문제 없음


        System.out.println(bNUm);
        System.out.println(iNum);

        int iNum2 = 20;
        float fNum = iNum2;

        System.out.println(fNum);

        double dNum;
        dNum = fNum + iNum;

        System.out.println(dNum);
    }
}
