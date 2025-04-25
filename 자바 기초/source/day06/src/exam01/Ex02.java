package exam01;

public class Ex02 {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 0;

        try {
            int result = num1 / num2; // ArithmeticException  // throw new ArithmeticException(...)
            System.out.println(result);

            // 문제 해결에 있어서 문제 원인을 알아야 해결할 수 있음
        } catch ( ArithmeticException e) {
            //System.out.println("예외 처리");
            String message = e.getMessage();
            System.out.printf("message : %s%n", message);
            e.printStackTrace();
        }
        System.out.println("매우 중요한 코드 실행...");
    }
}
