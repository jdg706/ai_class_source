package exam01;

public class ex01 {
    public static void main(String[] args) {
        Student s1 = new Student(); // 생성자 함수
        s1.id = 12124;
        s1.name = "김이름";
        s1.major = "컴퓨터 공학";

        s1.study();
        System.out.printf("s1 주소 : %d%n",System.identityHashCode(s1));

        System.out.println();

        Student s2 = new Student();
        s2.id = 121215;
        s2.name = "이이름";
        s2.major = "컴퓨터 공학";

        s2.study();
        System.out.printf("s2 주소 : %d%n",System.identityHashCode(s2));

        System.out.println();
        System.out.printf("s1 == s2 : %s%n", s1 == s2);

        System.out.println();

        Student s3 = s2; // s2 가 가지고 있는 주소값을 s3에 대입
        s3.id = 121216;
        s3.name = "박이름";
        s3.major = "컴퓨터 공학";

        s3.study();

        System.out.println();

        s2.study();

        System.out.println();

        System.out.printf("s2 == s3 : %s%n", s2 == s3);

        s1 = null; // null은 값이 없는 상태

    }
}
