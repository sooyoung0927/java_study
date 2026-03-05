package com.wanted.polymorphism.b_interface;

public class Application {
    public static void main(String[] args) {

        // 생성자 쓸 수 없어서 오류남
        //InterfaceProduct ip = new InterfaceProduct() {}

        // 다형성을 적용해서 실제 구현하고 있는 Product로 객체 생성
        InterfaceProduct ip = new Product(); // 동적 바인딩
        ip.methodA();



        /*우리는 인터페이스에 있는 메서드를 사용하고 싶은데
        * 인터페이스는 객체를 생성할 수 없음 = 생성자를 만들 수 없음
        * --> 그래서 인터페이스를 상속받은 클래스를 활용해서
        * 형변환을 통해 접근함*/

    }
}
