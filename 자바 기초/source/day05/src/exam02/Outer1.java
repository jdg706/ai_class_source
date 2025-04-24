package exam02;

public class Outer1 {

    private int num1 = 150;
    private int num2 = 200;
    // 인스턴스 내부 클래스
    class Inner {
        // private  static int num1 = 100;
        private int num1 = 100;

        public void method() {
            System.out.println("인스턴스 내부 클래스!");
            System.out.printf("Inner.num1 : %d%n", num1);
            System.out.printf("Outer1.mun2 : %d%n", num2);
            System.out.printf("Outrf1.num1 : %d%n", Outer1.this.num1);
        }
    }
}
