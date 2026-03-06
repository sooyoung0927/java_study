package com.wanted.b_collection.b_set;

import java.util.Set;
import java.util.TreeSet;

public class Application02 {
    public static void main(String[] args) {
        /*comment
        *  TreeSet
        *  TreeSet을 활용하여 로또 추첨기 만들기
        *  TreeSet 자료구조는 Set처럼 중복을 허용하지 않는다
        *  일반적인 Set과 다르게 데이터가 정렬이 된다  = 순서가 보장된다
        *  이진 검색 트리 구조로 저장을 한다
        *  따라서 데이터를 추가하거나 검색 혹은 제거하는 기본 동작이 매우 빠르다 
        *   */
        
        Set<String> stringSet = new TreeSet<>();//set이 인터페이스라서 TreeSet이라는 클래스 사용
        
        stringSet.add("java");
        stringSet.add("db");
        stringSet.add("jdbc");
        stringSet.add("servlet");

        System.out.println("=========");
        stringSet.add("a");
        stringSet.add("g");
        stringSet.add("c");
        stringSet.add("e");
        stringSet.add("e");

        // Set의 기본적인 특징인 중복은 여전히 허용하지 않지만
        // 데이터 정렬은 Set과 달리 가능하다

        System.out.println("stringSet = " + stringSet);


        // 로또 번호 추첨기 만들기
        Set<Integer> lotto = new TreeSet<>();
        while(lotto.size()<6){
            lotto.add((int)(Math.random()*45)+1);
        }
        System.out.println("lotto = " + lotto);
    }
}
