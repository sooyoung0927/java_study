package com.wanted.oop.c_abstraction.run;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        /*comment
         *  추상화
         *  공통된 부분을 추출하고 공통되지 않은 부분을 제거하는 의미
         *  객체를 설계하기 위해서는 복잡한 현실세계를 그대로 반영하기에는 너무 방대하고 복잡하다.
         *  따라서 현실세계를 프로그램의 목적에 맞게 단순화 하는 것을 추상화라고 한다  */

        /*comment
         *  프로그램 요규사항 작성
         *  주제 : 카레이서가 자동차를 운전하는 프로그램
         *  1. 자동차는 처음에 멈춘 상태로 대기한다
         *  2. 카레이서는 먼저 자동차에 시동을 건다. 이미 걸려있다면 다시 시동을 걸 수 없다
         *  3. 카레이서가 엑셀을 밟으면 시동이 걸려있다면 시속이 10km/h 증가하며 앞으로 나간다
         *  4. 자동차가 달리고 있는 중이면 브레이크를 밟으면 시속이 0으로 떨어지며 멈춘다
         *  5. 브레이크를 밟을 때 자동차가 달리는 중이 아니라면 이미 멈춰있는 상태라고 말한다
         *  6. 시동을 끄면 더이상 자동차는 움직이지 않는다
         *  7. 자동차가 달리는 중이라면 시동을 끌 수 없다 */

        /*comment
         *  은는이가의 주어 앞에 있는 게 클래스의 후보
         *  여기서 필요한 객체는 카레이서와 자동차 객체
         *  카레이서가 수신할 수 있는 메시지는 카레이서가 해야할 일과 동일하다
         *  1. 시동을 걸어라
         *  2. 엑셀 밟아라
         *  3. 브레이크 밟아라
         *  4. 시동 꺼라
         *  자동차가 수신할 수 있는 메시지는 자동차가 해야하는 일과 동일하다
         *  1. 시동을 걸어라
         *  2. 앞으로 가라
         *  3. 멈춰라
         *  4. 시동을 꺼라 */

        // Application에서는 카레이서한테 명령을 내린다
        CarRacer racer = new CarRacer();

        // 사용자의 입력 받기
        Scanner sc = new Scanner(System.in);

        while(true){
            System.out.println("============카레이싱 게임===========");
            System.out.println("1. 시동 걸기");
            System.out.println("2. 전진");
            System.out.println("3. 정지");
            System.out.println("4. 시동 끄기");
            System.out.println("9. 프로그램 종료");
            System.out.print("~메뉴를 선택해주세요~ ");

            int no=sc.nextInt();

            switch(no){
                case 1 :
                    racer.startUp();
                    break;
                case 2 :
                    racer.stepAccel();
                    break;
                case 3 :
                    racer.stepBreak();
                    break;
                case 4 :
                    racer.turnOff();
                    break;
                case 9 :
                    System.out.println("프로그램을 종료합니다. ");
                    break;
                default:
            }

            if(no==9){
                //while반복문 탈출
                break;
            }

    }
        }
    }

