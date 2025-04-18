package exam03;

public class ex10 {
    public static void main(String[] args) {
        int num1 = 10;
        double num2 = 10.123;

        /*
        * 연산은 같은 자료형 끼리만 가능
        *  연산을 하기 위해서 다른 자료형을 변경해서 같은 자료형으로 맞춰준다 (자동으로)
        *  1) int -> double (O)
        *  2) double -> int (X)
        *  자료형을 결정하는 기준 (자동 형변환 기준)
        *  정수 -> 실수
        *  1으로 자동 선택
        *  int num1 -> double num1
        *  double result = num1 + num2
         */

        System.out.println(num1 + num2);
    }
}
