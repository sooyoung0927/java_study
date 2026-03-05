package forif_prac;

import java.util.Scanner;

public class num3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("국어 점수 : ");
        int korean = sc.nextInt();

        System.out.print("수학 점수 : ");
        int math = sc.nextInt();

        System.out.print("영어 점수 : ");
        int english = sc.nextInt();

        int sum;
        sum = korean + math + english;

        double avg = 0;
        avg = (sum/3.0);

        if((korean>=40) && (math>=40) && (english>=40) && (avg>=60)){
            System.out.println("합격입니다");
        }else{
            System.out.println("불합격입니다");
        }
    }
}
