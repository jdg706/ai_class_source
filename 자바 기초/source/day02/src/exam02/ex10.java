package exam02;

public class ex10 {
    public static void main(String[] args) {
        /*
        int[][] nums = new int[][] {
                {10,20,30}, // 0행
                {40,50,60} // 1행
        };
        */
         int[][] nums= {
                 {10,20,30}, // 0행
                 {40,50,60} // 1행
         };

        System.out.println("nums.length:" + nums.length);  // 행의 갯수
        System.out.println("nums[0].lwngth:" + nums[0].length);  // 0행의 열의 갯수

        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[0].length; j++) {
                System.out.printf("nums[%d][%d]:%d%n",i ,j, nums[i][j]);
            }
        }
    }
}
