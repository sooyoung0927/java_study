package forif_prac;

import java.util.Scanner;

public class num2 {
    public static void main(String[] args) {

    System.out.print("값을 입력하세요 : ");
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();

        if(age>0){
            if(age%2==0){
                System.out.println("짝수다");
            }else{
                System.out.println(("홀수다"));
            }
        }else{
            System.out.println("양수만 입력하세요");
        }
    }
}
