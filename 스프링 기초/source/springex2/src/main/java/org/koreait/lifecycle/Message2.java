package org.koreait.lifecycle;

public class Message2 {

    // 초기화 단계에서 실행
    public void init() {
        System.out.println("init()");
    }

    public void close() {
        System.out.println("close()");
    }
}
