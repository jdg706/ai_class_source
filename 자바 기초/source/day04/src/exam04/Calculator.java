package exam04;

public interface Calculator {
    int num = 10; // public static final - 정적 상수
    // public abstract   int add(int num1, int num2);
    // public abstract - 컴파일러가 자동 추가
    // 목적이 명확하게 정해져 있음
    // 다른 접근자는 사용 불가
    int add (int num1, int num2);
}
