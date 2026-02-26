package com.wanted.b_loop.chap01;

public class Application02 {
    public static void main(String[] args) {

        /*for문 응용
        * for문을 활용해서 배열 처리, 합계 계산과 같은 작업을 수행할 수 있다
        * */

        int goal = 100;
        int sum = 0;
        System.out.println("칼로리 목표 "+goal+"입니다");

        //조건 : sum값은 100을 넘어선 안 되고 1회를 반복할 때마다 10씩 증가하게 하고 초기값은 10
        for(int i=10; sum<=goal;){
            System.out.println("sum = " + sum);
            sum=sum+i;

            if(sum==50){
                System.out.println("절반!!");
            }else if(sum==80){
                System.out.println("거의 다 옴!!");
            }
        }
    }
}
