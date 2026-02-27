package com.wanted.work;

import java.util.Scanner;

public class num8 {
    public static void main(String[] args) {
    }
    public void pracice8(){
        char[] sign = {'+','-','*','/','%'};

        Scanner sc = new Scanner(System.in);

        System.out.print("피연산자1 : ");
        int num1 = sc.nextInt();

        System.out.print("피연산자2 : ");
        int num2 = sc.nextInt();
        sc.nextLine();
        System.out.print("연산자 : ");
        char choose = sc.nextLine().charAt(0);

        int i=0;

        for(int j=0;j<5;j++){
            if(choose==sign[j]){
                i=j;
            }
        }

        switch(i){
            case 0:
                System.out.println((num1+num2));
                break;
            case 1:
                System.out.println((num1-num2));
                break;
            case 2:
                System.out.println((num1*num2));
                break;
            case 3:
                System.out.println((num1/num2));
                break;
            case 4:
                System.out.println((num1%num2));
                break;
        }
    }
}
