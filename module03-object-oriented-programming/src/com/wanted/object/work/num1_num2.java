package com.wanted.object.work;

public class num1_num2 {
    public static void main(String[] args) {
        int[] num = new int[10];
        int[] num1 = new int[10];

        for (int i=0;i<10;i++){
            num[i]=i+1;
            System.out.println(num[i]);
        }

        System.out.println("====");

        for (int i=0;i<10;i++){
            num1[i]=10-i;
            System.out.println(num1[i]);
        }

    }
}
