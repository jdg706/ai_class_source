package exam04;

public class Ex01 {
    public static void main(String[] args) {
        Calculator cal = new SimpleCalculator(); // 다형성
        int result = cal.add(10, 20);
        System.out.println(result);
        System.out.println(cal.num);
        System.out.println(Calculator.num); // 정적 상수
    }
}
