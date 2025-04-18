package exam03;

public class ex09 {
    public static void main(String[] args) {
        byte num1 = 100;
        int num2 = num1; // 작은 자료형에서 큰 자료형으로 자동 변환(묵시적 형변환)

        float num3 = num2;
        long num4 = 10000000000L;
        float num5 = num4;
        double num6 = num4;

        char ch = 'A';
        int num7 = ch;

        System.out.println(num7);
    }
}
