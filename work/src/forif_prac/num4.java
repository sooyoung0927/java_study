package forif_prac;

import java.util.Scanner;

public class num4 {
    public static void main(String[] args) {

        System.out.print("1~12사이의 정수 입력 : ");
        Scanner sc = new Scanner(System.in);
        int month = sc.nextInt();

        switch(month) {
            case 1:
                System.out.println(month+"는 겨울입니다");
                break;
            case 2:
                System.out.println(month+"는 겨울입니다");
                break;
            case 3:
                System.out.println(month+"는 봄입니다");
                break;
            case 4:
                System.out.println(month+"는 봄입니다");
                break;
            case 5:
                System.out.println(month+"는 봄입니다");
                break;
            case 6:
                System.out.println(month+"는 여름입니다");
                break;
            case 7:
                System.out.println(month+"는 여름입니다");
                break;
            case 8:
                System.out.println(month+"는 여름입니다");
                break;
            case 9:
                System.out.println(month+"는 가을입니다");
                break;
            case 10:
                System.out.println(month+"는 가을입니다");
                break;
            case 11:
                System.out.println(month+"는 가을입니다");
                break;
            case 12:
                System.out.println(month+"는 겨울입니다");
                break;
            default:
                System.out.println("1~12의 값으로 다시 입력하십시오.");
        }

    }
}
