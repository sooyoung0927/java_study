package com.wanted.a_controlflow.chap01;

public class Application02 {
    public static void main(String[] args) {

        int age = 67;

        //할인률은 나이에 따라 달라지니까 값 초기화 안 시키고 선언만 해둠
        double discountRate;

        if(age<13){
            discountRate = 0.5; // 청소년 50% 할일
        }else if(age>65){
            discountRate = 0.3; // 노약자 30% 할인
        }else{
            discountRate = 0; // 그 외에는 할인 없음
        }

        System.out.println("나이는 "+age+"살이고 할인률은 "+ (discountRate*100)+"% 입니다");
    }
}
