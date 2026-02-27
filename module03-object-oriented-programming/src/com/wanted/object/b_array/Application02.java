package com.wanted.object.b_array;

import java.util.Scanner;

public class Application02 {
    public static void main(String[] args) {
        /*comment
        *  배열을 활용한 여러 명의 자바 시험 점수 계산기 */

        /*요구사항
        * 1. 5명의 자바 점수를 정수로 입력받는다
        * 2. 점수를 입력 받아서 합계와 평균을 실수로 구하는 프로그램 만들기 */


        // 5명의 점수를 받을 배열 생성
        int[] score = new int[5];

        Scanner sc = new Scanner(System.in);

        // 배열이 연속적인 공간이라는 특성을 활용하여 반복문 사용
        for (int i=0; i<score.length;i++){
            System.out.print((i+1)+"번째 학생의 점수를 입력해주세요 : ");
            score[i]=sc.nextInt();
        }

        double sum =0.0;
        double avg =0.0;

        // 합계란 모든 배열의 인덱스 공간에 위치한 값을 sum변수에 누적해서 더함
        for (int k=0; k<score.length; k++){
            sum += score[k];
        }

        avg = sum/score.length;

        System.out.println("5명의 합계는 "+sum+"점, 평균은 "+avg+"점 ");
    }
}
