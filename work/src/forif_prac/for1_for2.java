package forif_prac;

import java.util.Scanner;

public class for1_for2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("1이상의 수를 입력하세요 : ");
        int get=sc.nextInt();

        if(get>=1){
            for(int i=1; i<(get+1);i++){
                System.out.print(i);
            }
        }else{
            System.out.println("1이상의 값을 입력하세요");


            System.out.print("1이상의 수를 입력하세요 : ");

            int again=sc.nextInt();
            if(again>=1){
                for(int i=1; i<(again+1);i++){
                    System.out.print(i);
                }
            }else {
                System.out.println("1이상의 값을 입력하세요");
            }
        }
    }
}
//
//
//package com.wanted.work;
//
//import java.util.Scanner;
//
//public class ForExample {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int number;
//
//        while (true) {
//            System.out.print("1 이상의 수를 입력하세요 : ");
//            number = sc.nextInt();
//
//            if (number >= 1) {
//                break;
//            } else {
//                System.out.println("1 이상의 값을 입력하세요");
//            }
//        }
//
//        for (int i = 1; i <= number; i++) {
//            System.out.print(i);
//        }
//
//        sc.close();
//    }
//}
