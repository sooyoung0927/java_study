package com.wanted.polymorphism.b_interface;

public class Application {
    public static void main(String[] args) {

        // 생성자 쓸 수 없어서 오류남
        //InterfaceProduct ip = new InterfaceProduct() {}

        // 다형성을 적용해서 실제 구현하고 있는 Product로 객체 생성
        InterfaceProduct ip = new Product(); // 동적 바인딩
        ip.methodA();
    }
}
