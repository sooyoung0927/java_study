package com.wanted.c_method;

public class Applicaiton01 {
    public static void main(String[] args) {

        //메서드가 없을 때 발생하는 경우

        //10개의 수를 더하고 결과를 반환
        int num1 = 1;
        int num2 = 2;
        System.out.println("첫 번째 연산 : "+ num1 + num2);

        int num3 = 5;
        int num4 = 6;
        System.out.println("두 번째 연산 : "+ num3 + num4);

        // 2개의 수를 더하고 싶으면 위의 3줄을 계속 반복해야할 것임

        // 다음 구문은 다른 모듈에서 배울 것이다
        // 클래스명 변수명 = new 클래스명();
        Applicaiton01 app = new Applicaiton01();
        System.out.println("첫 번째 연산 : "+ app.sumTwoNumber(3,4));
    }
    //여기는 메인 메소드 바깥 영역

    /* 메서드
    * 메서드는 특정 작업을 수행하는 코드 블럭이다
    * 코드의 재사용성, 가독성을 향상시키기 위해 사용한다
    * 메서드는 프로그램의 구조를 체계적으로 만들고 유지보수를 용이하게 만든다
    *
    * 형식 :
    * [접근제어자] [반환타입] 메소드명([매개변수 타입 매개변수 명]) {
    *     실행할 코드
    *     return 반환값;
    * }
    * - 반환타입에서 void 를 쓰면 리턴 없어도 됨
    *
    * 접근제어자 : 외부에서 해당 메서드에 접근할 수 있는 범위를 지정한다
    * - public : 모든 클래스에서 접근 가능
    * - private : 같은 클래스 내부에서만 접근 가능
    * - protected : 같은 패키지이거나 자식 클래스에서 접근 가능
    * */

    // 두 개의 숫자를 전달받아 더하기 기능을 수행하는 메서드
    public int sumTwoNumber(int a, int b) {
        return a+b;
    }
}
