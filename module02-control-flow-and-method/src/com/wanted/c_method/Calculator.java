package com.wanted.c_method;

public class Calculator {
    /*comment
    *  계산을 잘 할 수 있는 메서드들의 집합체*/

    // 전달 받은 두 수를 최솟값을 반환하는 메소드
    public int minNumberOf(int first, int second){
        return (first>second) ? second : first;
    }

    // 전달 받은 두 수를 최댓값을 반환하는 메소드
    public static int maxNumberOf(int first, int second){
        return (first<second) ? second : first;
    }
}
