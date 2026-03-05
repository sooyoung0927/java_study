package forif_prac;

import java.util.Scanner;

public class for5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("정수 하나를 입력하세요 : ");
        int get = sc.nextInt();

        int sum=0;

        for(int i=1;i<(get+1);i++){
            sum+=i;
        }

        for (int i=1; i<(get+1);i++){
            System.out.print(i+"+");
        }
        System.out.println("="+sum);
    }
}
