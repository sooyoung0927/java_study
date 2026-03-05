package com.wanted.oop.f_keyword.b_singleton;

public class EagerSingleton {

    private static EagerSingleton eager = new EagerSingleton();

    // 기본 생성자
    // 단, 싱글톤은 하나의 인스턴스만 만드는 것이 목표이기 때문에
    // 욉부에서 인스턴스 생성을 막기 위해 접근 제한자를 private로 사용한다
    private EagerSingleton() {}

    // public 메서드를 통해서 인스턴스가 필요할 때 반환해주는 메서드
    public static EagerSingleton getInstance(){
        return eager;
    }
}
