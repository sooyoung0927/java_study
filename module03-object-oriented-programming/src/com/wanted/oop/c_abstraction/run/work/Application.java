package com.wanted.oop.c_abstraction.run.work;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {


        Barista barista = new Barista();

        // 사용자의 입력 받기
        Scanner sc = new Scanner(System.in);

        while(true){
            System.out.println("============바리스타에게 명령을 내려라===========");
            System.out.println("1. 머신 켜기");
            System.out.println("2. 커피 주문하기");
            System.out.println("3. 세척하기");
            System.out.println("4. 재료 채워주기");
            System.out.println("9. 프로그램 종료");
            System.out.print("~메뉴를 선택해주세요~ ");

            int no = sc.nextInt();

            switch (no) {
                case 1:
                    barista.startUp();
                    break;
                case 2:
                    barista.order();
                    break;
                case 3:
                    barista.washMachine();
                    break;
                case 4:
                    barista.fullIngredient();
                    break;
                case 9:
                    System.out.println("프로그램을 종료합니다. ");
                    break;
                default:
            }

            if (no == 9) {
                //while반복문 탈출
                break;
            }
        }
    }

}


