package baristahamburger;

import hamburger.*;
import hamburger.Application;
import hamburger.Burger;
import hamburger.Cheeseburger;
import hamburger.Kitchen;

import java.util.Scanner;

public class Server {

    public int select;

    public void orderburger() {
        selectOption();
        ordermore();
    }

    public void ordercheeseburger() {
        selectOption();
        ordermore();
    }

    public void orderdroppedburger() {
        selectOption();
        ordermore();
    }



    public void selectOption(){
        Scanner sc = new Scanner(System.in);

        while(true){
            System.out.println("============옵션를 선택하세요===========");
            System.out.println("1. 토마토 추가");
            System.out.println("2. 패티 추가");
            System.out.println("3. 소스 추가");
            System.out.println("4. 추가 안 함");
            System.out.print("~메뉴를 선택해주세요~ ");

            int no = sc.nextInt();

            switch (no) {
                case 1:
                    System.out.println("토마토 추가를 선택하셨습니다");
                    this.select=no;
                    endorder();
                    break;
                case 2:
                    System.out.println("패티 추가를 선택하셨습니다");
                    this.select=no;
                    endorder();
                    break;
                case 3:
                    System.out.println("소스 추가를 선택하셨습니다");
                    this.select=no;
                    endorder();
                    break;
                case 4:
                    System.out.println("재료를 추가하지 않습니다");
                    this.select=no;
                    endorder();
                    break;
                default:
                    System.out.println("1,2,3,4번 중에서 선택해주세요");
            }
            break;
        }
    }


    public void endorder(){
        WildcardFarm wfarm = new WildcardFarm();

        switch (this.select){
            case 1:
                wfarm.anyType(new Kitchen<Burger>(new Burger()));
                System.out.println("선택하신 토마토 추가 옵션이 적용되었습니다.");
                break;
            case 2:
                wfarm.anyType(new Kitchen<hamburger.Cheeseburger>(new Cheeseburger()));
                System.out.println("선택하신 패티 추가 옵션이 적용되었습니다.");
                break;
            case 3:
                wfarm.anyType(new Kitchen<DroppedCheeseburger>(new DroppedCheeseburger()));
                System.out.println("선택하신 소스 추가 옵션이 적용되었습니다.");
                break;
            case 4:
                System.out.println("옵션 추가 없이 주문하신 버거가 나왔습니다.");
                break;
        }
    }


    public int again;
    public void ordermore(){
        Scanner sc = new Scanner(System.in);

        while(true){
            System.out.println("============더 주문하시겠습니까===========");
            System.out.println("1. 예");
            System.out.println("2. 아니요");
            System.out.print("~메뉴를 선택해주세요~ ");

            int no = sc.nextInt();

            switch (no) {
                case 1:
                    System.out.println("추가주문을 진행합니다");
                    again=1;
                    break;
                case 2:
                    System.out.println("주문을 종료합니다");
                    again=0;
                    break;
                default:
                    System.out.println("1,2번 중에서 선택해주세요");
            }
            break;
        }
    }
}
