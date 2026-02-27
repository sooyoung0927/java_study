package com.wanted.work;

import java.util.Scanner;

public class num1 {
    public static void main(String[] args) {

    }
    public void practice1(){

        String[] menu={"입력","수정","조회","삭제","종료"};

        for(int i=0; i<5;i++){
            System.out.println((i+1)+". "+menu[i]);
        }

        System.out.print("메뉴 번호를 입력하세요 : ");

        Scanner sc =new Scanner(System.in);
        int menunum = sc.nextInt();

        System.out.println(menu[menunum-1]+"메뉴입니다.");

    }
}

