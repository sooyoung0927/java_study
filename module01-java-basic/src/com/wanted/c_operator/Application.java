package com.wanted.c_operator;

public class Application {
    public static void main(String[] args) {

        //연산자 테스트 데이터
        int a = 10;
        int b = 3;

        // + - * / % 산술연산
        System.out.println("덧셈 : "+(a+b)); //그냥 a+b로 하면 정수형이 문자형으로 바뀜 103이 나옴
        System.out.println("나눗셈 : "+(a/b));
        System.out.println("나머지 : "+(a%b));

        // == != < > <= >= 비교연산
        // 두 값을 비교하여 참 혹은 거짓을 반환
        boolean isGreater = a > b;
        System.out.println("isGreater = " + isGreater);

        // && || ! 논리연산
        // 하나 이상의 조건을 결합하여 최종적인 참 또는 거짓을 평가한다
        boolean isTrue = true;
        boolean isFalse = false;
        System.out.println("둘 다 참인가? : "+(isTrue && isFalse));
        System.out.println("둘 중 하나가 거짓인가? : "+ (isTrue || isFalse));
        System.out.println("NOT은 부정 : "+ !isFalse);
        /*and나 or 에서
        * and는 둘 중 하나라도 거짓이면 거짓
        * or는 둘 중 하나라도 참이면 참이니까
        * and에서는 거짓일 확률이 높은 걸 앞에 / or에서는 참일 확률이 높은 걸 앞에 두면
        * 성능이나 최적화에 더욱 도움이 된다 */

        // ++ -- 증감연산자
        // 변수의 값을 1씩 증가시키거나 감소시키는 연산자
        int age =20;
        System.out.println("age = " + (++age));
        System.out.println("age = " + (age++));
        System.out.println("age = " + (age));

    }
}
