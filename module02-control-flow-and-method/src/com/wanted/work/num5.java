package com.wanted.work;

import java.util.Scanner;

public class num5 {
    public static void main(String[] args) {

        String ID = "sooy";
        String PW = "Asd";

        Scanner sc = new Scanner(System.in);

        System.out.print("아이디 : ");
        String id = sc.next();
        System.out.println("id = " + id);

        System.out.print("비밀번호 : ");
        String pw = sc.next();
        System.out.println("pw = " + pw);

        if(id.equals(ID) && pw.equals(PW)){
            System.out.println("로그인 성공");
        }else if(id.equals(ID) && !(pw.equals(PW))) {
            System.out.println("비밀번호가 틀렸습니다");
        }else if(!(id.equals(ID)) && !(pw.equals(PW))){
            System.out.println("아이디가 틀렸습니다");
        } else {
            System.out.println("====");
        }


    }
}
