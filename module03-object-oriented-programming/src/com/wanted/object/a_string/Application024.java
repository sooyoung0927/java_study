package com.wanted.object.a_string;

public class Application024 {
    public static void main(String[] args) {
        /*comment
        *  문자열 객체 만드는 방법 
        *  1. "" 리터럴 형태
        *  2. new String("문자열") */
        
        String str1 = new String("java");
        String str2 = "java";

        System.out.println("str1 = " + str1);
        System.out.println("str2 = " + str2);


        /*comment
        *  문자열의 동등비교
        *  String 의 값 비교를 할 때는 equals() 메서드를 사용한다 */

        System.out.println("str1==str2 : " + str1==str2); //false -> 주소값의 비교
        System.out.println("str1.equals(str2) : " + str1.equals(str2)); // true -> 값의 비교
    }
}
