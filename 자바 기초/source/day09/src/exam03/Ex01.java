package exam03;

public class Ex01 {
    public static void main(String[] args) {
//        Calculater cal = new Calculater() {
//            @Override
//            public int add(int num1, int num2) {
//                return num1 + num2;
//            }
//        };

        Calculater cal = (num1, num2) -> 1 + 2;


        int result = cal.add (10, 20);
        System.out.println(result);
    }
}
