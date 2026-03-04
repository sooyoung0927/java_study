package com.wanted.object.work;

import java.util.Scanner;

public class num5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("문자열 : ");
        String word = sc.next();

        System.out.print("문자 : ");
        String select = sc.next();

        String[] countstr = new String[word.length()];
        int count=0;

        for(int i=0; i<word.length(); i++){
           countstr[i]= String.valueOf(word.charAt(i));
            if(countstr[i].equals(select)){
                count++;
            }
        }

        System.out.println("count = " + count);
    }
}
