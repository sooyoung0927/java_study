package forif_prac;

import java.util.Scanner;

public class for11 {
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);

        System.out.print("시작 숫자 : ");
        int num = sc.nextInt();

        System.out.print("공차 : ");
        int gap = sc.nextInt();

        for(int i=0;i<10;i++){
            System.out.print(num+(gap*i)+" ");
        }
    }
}
