package com.wanted.c_method;

public class Application04 {
    public static void main(String[] args) {

        /*comment.
        *  다른 클래스에 존재하는 클래스 호출하기 */

        int first=100;
        int second = 50;

        Calculator c = new Calculator();
        int min = c.minNumberOf(first,second);

        /*comment
        *  static으로 선언한 메소드 호출할 땐
        *  클래스명을 반드시 기술해야한다
        *  - 사용방법 : 클래스명.메소드명(); */
        int max = Calculator.maxNumberOf(first,second);

        System.out.println("두 수 중 최솟값은 " + min +" 입니다.");
        System.out.println("두 수 중 최댓값은 " + max +" 입니다.");
    }
}
