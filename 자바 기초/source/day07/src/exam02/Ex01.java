package exam02;

public class Ex01 {
    public static void main(String[] args) {
        String str1 = "ABC";
        String str2 = "ABC";
        // 문자열 상수, "ABC"를 사용하는 모든 참조 변수에는 같은 주소를 공유
        System.out.printf("str1 == str2:%s, str1.equals(str2):%s%n", str1 == str2, str1.equals(str2));

        System.out.printf("str1의 주소:%d%n", System.identityHashCode((str1)));
        System.out.printf("str2의 주소:%d%n", System.identityHashCode((str2)));
    }
}
