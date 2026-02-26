package com.wanted.a_controlflow.chap01;

import java.util.Scanner;

public class Application01 {

    // main() : 프로그램의 시작을 알리는 시발점
    public static void main(String[] args) {

        /*if문
        * if문은 조건식의 결과에 따라 프로그램의 실행 흐름을 분기시키는 제어문이다
        * 조건식이 true일 경우 코드 블록이 실행되며, false일 경우 코드 블럭을 무시한다
        * 형식 : if(조건식) {실행코드} [else{대체코드}]
        * 조건식은 boolean 타입으로 평가되며, 단일조건 혹은 복합조건(논리 연산자 활용)을 포함할 수 있다 */

        int score = 75;

        //만약 점수가 90점 이상이면 A등급
        // 90미만 80이상이면 B등급
        // 80미만 70이상이면 C등급
        // 그보다 낮으면 D등급


        if(score >=90){
            System.out.println("A등급");
        }else if(score>=80){
            System.out.println("B등급");
        }else if(score>=70){
            System.out.println("C등급");
        }else{
            System.out.println("D등급");
        }

        System.out.println("프로그램 종료");


        // scanner 사용
        Scanner sc = new Scanner(System.in);
        int yourscore = sc.nextInt();

        if(yourscore >=90){
            System.out.println("A등급");
        }else if(yourscore>=80){
            System.out.println("B등급");
        }else if(yourscore>=70){
            System.out.println("C등급");
        }else{
            System.out.println("D등급");
        }

        System.out.println("출력 끝");

    }
}
