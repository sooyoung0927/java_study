package forif_prac;

import java.util.Scanner;

public class for3_for4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("1이상의 수를 입력하세요 : ");
        int get=sc.nextInt();

        if(get>=1){
            for(int i=1; i<(get+1);i++){
                System.out.print((get+1)-i);
            }
        }else {
            System.out.println("1이상의 값을 입력하세요");
            System.out.print("1이상의 수를 입력하세요 : ");

            int again=sc.nextInt();
            if(again>=1){
                for(int i=1; i<(again+1);i++){
                    System.out.print((again+1)-i);
                }
            }else {
                System.out.println("1이상의 값을 입력하세요");
            }
        }
    }
}
