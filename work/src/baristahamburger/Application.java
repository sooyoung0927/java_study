package baristahamburger;

import barista.Barista;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {

        Kiosk kiosk = new Kiosk();
        Server server = new Server();

        // 사용자의 입력 받기
        Scanner sc = new Scanner(System.in);

        while(true){
            System.out.println("============선택하세요 명령을 내려라===========");
            System.out.println("1. 주문하기");
            System.out.println("2. 주문취소");
            System.out.print("~메뉴를 선택해주세요~ ");

            int no = sc.nextInt();

            switch (no) {
                case 1:
                    kiosk.startUp();
                    break;
                case 2:
                    System.out.println("프로그램을 종료합니다. ");
                    break;
                default:
                    System.out.println("1번 아니면 2번 중에서 선택해주세요");
            }

            if (no == 2) {
                //while반복문 탈출
                break;
            }

            if (server.again==0){
                break;
            }
        }
    }
}
