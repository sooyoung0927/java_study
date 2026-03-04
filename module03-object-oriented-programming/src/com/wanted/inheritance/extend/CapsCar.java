package com.wanted.inheritance.extend;

public class CapsCar extends Car{

    public CapsCar(){
        System.out.println("CapsCar 기본 생성자 호출됨");
    }

    @Override
    public void run() {
        System.out.println("경찰차는 삐용삐용 달립니다");
    }

    @Override
    public void soundHorn() {
        System.out.println("빵빵");
    }
}
