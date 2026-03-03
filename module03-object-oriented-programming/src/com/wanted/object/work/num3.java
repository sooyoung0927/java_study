package com.wanted.object.work;

import java.util.Scanner;

public class num3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("양의 정수 : ");
        int length = sc.nextInt();

        int[] num = new int[length];

        for(int i=1; i<=length; i++){
            System.out.print(i);
        }
    }
}
