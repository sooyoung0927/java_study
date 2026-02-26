package com.wanted.b_variable.chapter01;

import java.util.Scanner;

public class Application2 {
    public static void main(String[] args) {

        //Scanner 클래스가 사용자의 입력 저장
        System.out.println("이름을 입력하세요 : ");
        Scanner sc= new Scanner(System.in);

        String name = sc.nextLine();
        System.out.println("입력된 이름은 : "+name);

    }
}
