package com.wanted.a_generic.a_basic;

public class Application {
    public static void main(String[] args) {
        /*comment
        *  Generic이란
        *  제네릭은 데이터의 타입을 일반화한다는 의미이다
        *  클래스나 메서드에서 사용할 내부 데이터 타입을 컴파일 시에 지정하는 방법을 의미한다
        *  컴파일 시점에 미리 타입에 대한 검사를 진행하여 클래스나 메서드 내부에서 사용되는 객체의 타입 안정성을 높일 수 있다 */

        GenericTest gt = new GenericTest();
        gt.setValue(1);
        System.out.println("gt = " + gt);

        gt.setValue("문자열");
        System.out.println("gt = " + gt);

        System.out.println("======================");

        
        /*comment
        *  <>다이아몬드 연산자 내부에 자료형은 기본자료형이 들어갈 수 없다 
        *  그러면 도대체 int나 char 나 boolean의 값들을 저장하고 싶다면 어떻게 해야하나
        *  - Wrapper 클래스가 들장 !!
        *  int -> Integer
        *  String -> String
        *  byte -> Byte
        *  short -> Short
        *  boolean -> Boolean
        *  char -> Character */
        
        // 이런 레퍼클래스는 스택영역이 아닌 힙 메모리 영역에 변수를 저장하고 싶을 때 사용
        
        GenericTest<Integer> gt1 = new GenericTest<Integer>();
        gt1.setValue(1);
        // gt1.setValue("문자열");
        // 이걸 데이터 타입을 막아둔 상황
        // 타입은 인테저로 고정하겠다 라고 선언해둔 거에 스트링을 넣으니 오류 발생
        System.out.println("gt1 = " + gt1);

        GenericTest<String> gt2 = new GenericTest<String>();
        gt2.setValue("문자열");
        System.out.println("gt2 = " + gt);

    }
}

/*우리가 제네릭을 쓰는 이유
* 하나의 타입으로 고정시켜서 선언하면 바뀔 때마다 새롭게 선언을 해줘야한다
* 그래서 <T>로 선언해두고 내가 정하고 싶은 데이터 타입으로 그때 그때 선언하며 사용한다
* -> 코드 확장성, 재사용성 증가*/