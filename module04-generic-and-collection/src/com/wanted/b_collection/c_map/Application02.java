package com.wanted.b_collection.c_map;

import java.util.Properties;

public class Application02 {
    public static void main(String[] args) {
        /*comment
        *  Properties 라는 것에 대해 알 수 있다
        *  Properties는 지금 당장 사용하지 않지만 향후 Spring 모듈에서 계속 등장한다
        *  이는 설정 파일의 값을 읽어서 어플리케이션에 적용할 때 사용된다
        *  예) .env .properties .yaml  */

        // 얘도 키-값 구조인데 둘 다 문자열로 들어감

        Properties prop = new Properties();
        prop.setProperty("driver","cj.jdbc.driver.mysql");
        prop.setProperty("url","jdbc:mysql:thin:@123.0.0.1:3306:ex");
        prop.setProperty("user","wanted");
        prop.setProperty("password","wanted");
        //prop.setProperty(1,"hi"); 둘 다 문자열이여야 함

        System.out.println("prop = " + prop);

    }
}
