package baristahamburger;

import java.util.Scanner;

public class Kiosk {
    public void startUp() {
        System.out.println("메뉴를 선택하십시오");

        Server server = new Server();

        Scanner sc = new Scanner(System.in);

        while(true){
            System.out.println("============메뉴를 선택하세요ㅗ===========");
            System.out.println("1. 그냥 버거");
            System.out.println("2. 치즈 버거");
            System.out.println("3. 떨군 버거");
            System.out.println("4. 주문 취소");
            System.out.print("~메뉴를 선택해주세요~ ");

            int no = sc.nextInt();

            switch (no) {
                case 1:
                    server.orderburger();
                    break;
                case 2:
                    server.ordercheeseburger();
                    break;
                case 3:
                    server.orderdroppedburger();
                    break;
                case 4:
                    System.out.println("주문하기를 취소합니다");
                    break;
                default:
                    System.out.println("1,2,3번 중에서 선택해주세요");
            }

            if (no == 4) {
                //while반복문 탈출
                break;
            }

            if (server.again==0){
                break;
            }
        }
    }
}
