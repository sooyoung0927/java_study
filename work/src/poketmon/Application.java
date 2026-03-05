package com.wanted.work;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Trainer trainer = new Trainer();
        /*1.게임 시작
         * 2. 포켓몬 고르기
         * 3. 특수 공격 하기
         * */
// 사용자의 입력 받기
        Scanner sc = new Scanner(System.in);

        while(true){
            System.out.println("=======선택======");
            System.out.println("1. 포켓몬 선택");
            System.out.println("2. 포켓몬 교체");
            System.out.println("9. 프로그램 종료");
            System.out.print("~선택~ ");

            int no = sc.nextInt();

            switch (no) {
                case 1:
                    trainer.selectPoketmon();
                    break;
                case 2:
                    trainer.changePoketmon();
                    break;
                case 9:
                    System.out.println("프로그램을 종료합니다. ");
                    break;
                default:
                    System.out.println("1,2,9번만 골라주세요");
            }

            if (no == 9) {
                //while반복문 탈출
                break;
            }
        }
    }
}