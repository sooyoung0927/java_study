package com.wanted.inheritance.extend;

public class FireCar extends Car {

    public FireCar(){
        System.out.println("FireCar 기본 생성자 호출");
    }

    @Override
    public void soundHorn() {
        if(isRunning()){
            System.out.println("삐용삐용 빵빵 비키세요");
        }else{
            System.out.println("소방차가 지나갈 수 없습니다 비키세요!!");
        }
    }

    /*부모의 것을 가져다 쓸 수도 있고 본인만의 고유한 필드, 메서드도 작성 가능하다 */
    public void sprayWater(){
        System.out.println("화재가 발생한 곳에 물을 뿌립니다");
    }
}
