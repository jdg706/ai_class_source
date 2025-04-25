package exam02;

public class Ex01 {
    public static void main(String[] args) {
        try {
            LogimService2 service = new LogimService2();
            service.process("user01", "123454");
        } finally {
            System.out.println("실행 코드..");
        } // 무조건 항상 실행할 코드에 사용 try - finally
    }
}
