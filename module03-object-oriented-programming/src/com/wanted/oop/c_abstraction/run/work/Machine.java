package com.wanted.oop.c_abstraction.run.work;

public class Machine {

    private boolean isOn=false; // 초기에는 전원이 꺼져있음
    private int water=500; // 물 500ml
    private int beans=100; // 원두 100
    private int ordertimes=0;

    public void start() {
        if(isOn){
            System.out.println("이미 전원이 켜져있습니다. ");
        }else{
            this.isOn = true;
            System.out.println("전원이 켜졌습니다");
        }
    }

//    public void makecoffee() {
//        if(isOn){
//            if(this.water <= 100 || this.beans <= 20){
//                System.out.println("재료가 부족하여 커피를 만들 수 없습니다 ");
//                return;
//            }
//                if(ordertimes >=3){
//                    System.out.println("커피를 3회 이상 만들면 세척을 1회 해야합니다");
//                }else{
//                    System.out.println("커피를 만듭니다");
//                    this.water -= 100;
//                    this.beans -= 20;
//                    ordertimes += 1;
//
//                    System.out.println("남은 물은 " + this.water + "ml, 원두는 " + this.beans + "g, 주문횟수는 " + this.ordertimes + "입니다");
//                }
//        }else{
//            System.out.println("전원이 꺼져있으니 다시 확인해주세요");
//        }
public void makecoffee() {
        if(isOn){
            if(this.water<100 ||this.beans<20){
                System.out.println("재료가 부족합니다.");
            }else{
                if(ordertimes>=3){
                    System.out.println("세척이 필요합니다");
                }else{
                    this.water-=100;
                    this.beans-=20;
                    ordertimes++;

                    System.out.println("남은 물은 " + this.water + "ml, 원두는 " + this.beans + "g, 주문횟수는 " + this.ordertimes + "입니다");
                }
            }

        }else{
            System.out.println("전원이 꺼져있으니 확인하세요.");
        }

    }

    public void full() {
        if(isOn){
            System.out.println("재료를 채웁니다");
            this.beans=100;
            this.water=500;
            System.out.println("재고를 채워 남은 물은 "+this.water+"ml, 원두는 "+this.beans+"g 입니다.");
        }else{
            System.out.println("전원이 꺼져있으니 다시 확인해주세요");
        }

    }

    public void wash() {

        if(isOn){
            System.out.println("세척을 진행합니다. ");
            this.ordertimes=0;
        }else{
            System.out.println("전원이 꺼져있으니 다시 확인해주세요");
        }

    }
}
