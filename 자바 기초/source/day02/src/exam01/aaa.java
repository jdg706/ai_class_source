package exam01;

public class aaa {
    public static void main(String[] args) {
        int num1 = 20;
        double num2 = 3.6;
        int result = (int) (num1 + num2);
        System.out.println(result);

        for (int i = 1; i < 41; i++) {
            int roomNo = i % 10;
            System.out.printf("학생 %d, 방번호%d%n", i, roomNo);
        }



        switch (5) {
            case 1:
                System.out.println("1층 약국");
                break;
            case 2:
                System.out.println("2층 정형외과");
                break;
            case 3:
                System.out.println("3층 피부과");
                break;
            case 4:
                System.out.println("4층 치과");
                break;
            case 5:
                System.out.println("5층 헬스클럽");
                break;
        }


        for (int i = 2; i < 10; i++) {
            if (i % 2 == 0) {
                continue;
            }
            System.out.printf("------- %d  단-------%n", i);
            for (int j = 1; j < 10; j++) {
                System.out.printf("%d X %d = %d%n", i, j, i * j);
            }
        }



        for (int i = 2; i < 10; i++) {
            System.out.printf("------- %d  단-------%n", i);
            for (int j = i; j < 10; j++) {
                System.out.printf("%d X %d = %d%n", i, j, i * j);
            }
        }
    }
}


