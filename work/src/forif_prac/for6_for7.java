package forif_prac;

import java.util.Scanner;

public class for6_for7 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.print("첫 번째 숫자 : ");
        int first = sc.nextInt();
        System.out.print("두 번째 숫자 : ");
        int second = sc.nextInt();

        int min = Math.min(first, second);
        int max = Math.max(first,second);

        if(first>=1 && second>=1){
            for(int i=min; i<max+1; i++){
                System.out.print(i+" ");
            }
        }else {
            System.out.println("1이상의 숫자만 입력해주세요 ");

            System.out.print("첫 번째 숫자 : ");
            int firstagain = sc.nextInt();
            System.out.print("두 번째 숫자 : ");
            int secondagain = sc.nextInt();

            int minagain = Math.min(firstagain, secondagain);
            int maxagain = Math.max(firstagain, secondagain);

            if (firstagain >= 1 && secondagain >= 1) {
                for (int i = minagain; i < maxagain + 1; i++) {
                    System.out.print(i + " ");
                }
            } else {
                System.out.println("1이상의 숫자만 입력해주세요 ");

            }
        }
    }
}
