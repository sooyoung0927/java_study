package com.wanted.polymorphism.b_interface;

public interface InterfaceProduct {

    /*comment
    *  인터페이스는 구현부가 있는 메서드를 작성할 수 없다
    *  또한 생성자 역시 가질 수 없다
    *   */

    /*comment
    *  인터페이스는 상속 받는 클래스가
    *  상속해주는 부모 클래스의 메서드를 모두 강제적으로 무조건 가져야한다는 것을 나타냄 */

    // 인터페이스는 생성자를 못 쓴다
    // public InterfaceProduct(){}

    // 인터페이스는 구현부가 있는 메서드를 못 쓴다
    // public void test(){}

    void methodA();
    static void staticMethod(){
     // static 메서드는 구현부 작성이 가능하다
    }
}
