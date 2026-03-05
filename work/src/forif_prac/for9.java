package forif_prac;

import java.util.Scanner;

public class for9 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.print("숫자 : ");
        int num = sc.nextInt();

        for(int i=num;num<=9;num++){
            for(int j=1; j<=9;j++){
                System.out.println(num+"*"+j+"="+(num*j));
            }
            System.out.println("한 번 끝");
        }

    }
}
