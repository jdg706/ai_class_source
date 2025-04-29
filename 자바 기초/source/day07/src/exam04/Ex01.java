package exam04;

public class Ex01 {
    public static void main(String[] args) {
        Transportation bus = Transportation.BUS;
        System.out.println(bus instanceof Transportation);

        /**
         * 추상클래스
         * abstract class Transportation extent java.lang.Enum{
         *  public static final Transportation BUS = new Transportation(){};
         *  public static final Transportation SUBWAY = new Transportation(){};
         *  public static final Transportation TAXI = new Transportation(){};
         *  public static final Transportation AIRPLANE = new Transportation(){};
         * }
         */
    }
}
