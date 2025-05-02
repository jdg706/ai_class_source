package exam01;

import java.util.Arrays;

public class Ex11 {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 5, 7, 9, 11};
        boolean isOdd = Arrays.stream(nums).allMatch(i -> i % 2 == 1);
        System.out.println(isOdd);

        boolean isEvenIncluded = Arrays.stream(nums).anyMatch(i -> i % 2 == 0);
        System.out.println(isEvenIncluded);

        Arrays.stream(nums).peek(System.out::println) // 변환전 값 확인
                .map(i -> i * i)
                .forEach((System.out::println));
    }
}
