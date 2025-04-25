package exam05;

public class Ex05 {
    public static void main(String[] args) {
        String s1 = new String("ABC");
        String s2 = new String("ABC");

        // equals  동등성 비교를 위한 재정의 목정으로 정의되어 있음
        System.out.printf("s1 == s2 : %s, s1.equals(s2) : %s%n", s1 == s2, s1.equals(s2));
    }
}
