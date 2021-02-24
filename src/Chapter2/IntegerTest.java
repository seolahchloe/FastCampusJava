package Chapter2;

public class IntegerTest {

    public static void main(String[] args) {

        byte bs = 127; // byte 범위

        System.out.println(bs);

//        int iVal = 12345678900; // int의 out of range
//        long lVal = 12345678900; // long의 out of range
        long lVal = 12345678900L; // 8byte로 처리를 위해 L 삽입
    }


}
