package exam03;

public class Ex03 {
    public static void main(String[] args) {
        Integer num1 = Integer.valueOf(100);
        Integer num2 = Integer.valueOf(200);


        int result = num1 + num2;
                    // num1.intValue() + num2.intValue(); (언박싱)
        System.out.println(result);

        /**
         * 같은 자요형만 변수의 값으로 할당 가능
         * 선언은 참조 자료형은 Integer 클래스
         * 값은 기본 자료형인 int
         */
        Integer num3 = 100;
                    // Integer.valueOf(100);
                    // 기본 자료형 -> 객체 (오토박싱)

        Integer num4 = 200;
                    // Integer.valueOf(200);
                    // 기본 자료형 -> 객체 (오토박싱)

        Integer result1 = num3 + num4;
                        // num3.intValue() + num4.intValue(); (언박싱)
        System.out.println(result1);
    }
}
