package com.wanted.object.a_string;

public class Application01 {
    public static void main(String[] args) {
        /*comment
        *  자료형은 크게 2가지 종류가 있다
        *  1. 기본 자료형 (int, double, boolean)
        *  2. 참조 자료형
        *  3. 사용자 정의의 자료형 */

        /* comment
        *   String에서 사용되는 다양한 메소드 */

        // length() : 길이
        // charAt(index) : 문자열을 문자로 변환

        String str1 = "apple";

        System.out.println("str1.length = " + str1.length());

        //문자열 apple을 각각 a p p l e 로 출력하기
        for(int i=0; i<str1.length(); i++){
            System.out.println("charAt(" + i+ ") : "+ str1.charAt(i));
        }

        String trimStr = "  java  ";
        System.out.println("공백 자르기 전 = #" + trimStr+"#");
        System.out.println("공백 자른 후 = #" + trimStr.trim()+"#");
    }
}
