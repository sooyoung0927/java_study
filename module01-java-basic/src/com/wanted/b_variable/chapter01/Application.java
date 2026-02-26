package com.wanted.b_variable.chapter01;

public class Application {

    public static void main(String[] args) {

        /* 리터럴이란
        * - 리터럴은 소스 코드에 직접 작성 된 값 그 자체를 의미
        * - 리터럴은 변수에 저장되기 전 수수한 값을 의미한다 */

        // 정수형
        byte b = 10;
        short s = 10;
        int ex= 10;
        long l= 20;
        // int -> 자료형 / ex -> 변수 / 10 -> 리터럴
        // int는 4바이트

        // 문자형
        String str="hello world";
        char c = 'k';
        // 문자열을 "" 문자는 ''
        // 문자열은 빈 문자열로 둬도 되지만 문자는 무조건 있어야함

        // 논리형
        boolean bl1= true;
        boolean bl2= false;

        // 실수형
        float f1 = 3.14f;
        double f2 = 3.141592;


        // 변수의 선언과 초기화
        int num1 = 10;
        int num2 = 20;

        System.out.println(num1);
        System.out.println("첫번째 숫자는 : "+num1+"입니다");

    }
}

