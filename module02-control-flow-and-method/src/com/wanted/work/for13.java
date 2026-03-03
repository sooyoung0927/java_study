package com.wanted.work;

import java.util.Scanner;

public class for13 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.print("문자열 : ");
        String str = sc.next();

        System.out.print("찾고자하는 문자 : ");
        char find = sc.next().charAt(0);

        int count=0;

        for(int i=0; i<str.length();i++){
            if(str.charAt(i)==find){
                count++;
            }
        }
        System.out.println("포함된 갯수 : "+count);

    }
}
