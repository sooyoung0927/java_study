package com.wanted.oop.e_overloading;

public class OverloadingTest {

    /*comment
    *  메서드 오버로딩이란,
    *  같은 이름의 메서드이지만 서로 다르게 동작하는 것*/

    // 오버로딩을 이용한 메서드 작성 테스트를 위한 기준 메서드
    public void test(){

    }

    // 메서드의 시그니처가 동일하면 에러를 발생시킨다
    // public void test(){}

    // 접근제한자 변경해도 에러 발생
    // private void test(){}

    // 반환타입 변경해도 에러 발생
    // public int test(){
    //  return 0;
    // }

    // 매개변수 유무에 따라 오버로딩 성립 확인
    public void test(int num){}

    // 매개변수 명은 메서드 시그니처에 영향을 주지 않는다
    // public void test(int num2){}

    // 매개변수의 개수는 메서드 시그니처에 영향을 미친다
    public void test(int num,String str){}

    // 매개변수의 순서에 따른 오버로딩 성립 확인
    public void test(String str, int num){}


}
