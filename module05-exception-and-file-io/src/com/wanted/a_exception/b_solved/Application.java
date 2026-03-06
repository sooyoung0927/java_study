package com.wanted.a_exception.b_solved;

public class Application {
    public static void main(String[] args) {

        /*comment
        *  예외처리를 진행
        *  1. try-catch-finally
        *  - try : 예외가 발생할 가능성이 있는 코드 블럭
        *  - catch : 예외를 처리하는 코드 블럭
        *  - finally : 예외 발생 여부와 관계없이 항상 실행되는 코드 블럭
        *  ========
        *  2. throws 를 이용한 예외 전파
        *  */

        System.out.println("프로그램 시작됨");

        try{
            // 예외 발생 가능성이 있는 코드
            int result = 10/0;
            System.out.println("result = " + result);
        }catch (ArithmeticException e){ // e는 매개변수 , A~~는 자료형
            System.out.println("e.getMessage() = " + e.getMessage());
            System.out.println("0으로 값을 나눌 수 없습니다 ");
        }finally{
            System.out.println("예외 발생 여부와 관계없이 실행됨");
        }

        System.out.println("====================");

        try{
        checkage(-10);
        }catch (IllegalArgumentException e){
            // 실제 예외는 checkAge 메서드에서 발생하지만
            // 예외를 throws로 던졌기 때문에 호출하는 main 쪽에서 처리해야한다
            System.out.println("뭐가 에러인지 출력 = " + e.getMessage());
            System.out.println("예외 발생 !");
        } //catch (Exception e){
          // 예외 오류의 종류가 여럿이면 여러 개 두고 catch문을 여러 개 써서 예외의 종류에 맞게 함
          // 근데 Exception 은 엄청 상당? 위에 있는 거라서
          // 저걸 catch문에서 젤 위에 쓰면 어떤 종류의 오류든 Exception이 빨아들여버림
          // 그래서 예외 종류 여러 개 여도 Exception 하나 써두면 싹 다 잡아먹어버림
        //}
        System.out.println("프로그램 종료됨");
    }


    /* 예외 전파 throws
    *  - throws는 에서드 선언부에 작성한다
    *  - 예외에 대한 처리를 호출자(caller)에게 위임하는(떠넘기는) 키워드이다
    *  - 이를 통해서 해당 메서드는 예외 처리 코드로 복잡해지지 않고
    *  - 자신의 핵심 로직에 집중할 수 있게 된다 */
    public static void checkage(int age) throws IllegalArgumentException{
        if(age<0){
            // 잘못된 전달인자가 왔을 때 발생시키는 예외 클래스
            throw new IllegalArgumentException("나이는 음수일 수 없습니다"); //위에 있는 e.getMessage에서 출력됨
        }
        System.out.println("전달 받은 "+age+" 는 유효한 숫자입니다 ");
    }
}
