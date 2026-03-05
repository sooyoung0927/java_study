package com.wanted.b_collection.b_set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Application {
    public static void main(String[] args) {
        /*comment
        *  Set 자료구조의 특징
        *  1. 요소의 저장 순서를 유지하지 않는다
        *  2. 같은 요소의 중복저장을 허용하지 않는다 (null 도 단 한 개의 null만 들어간다.)
        *  */

        Set<String> hset = new HashSet<>(); //set도 인터페이스라서 HashSet이라는 클래스 사용
        hset.add("java");
        hset.add("db");
        hset.add("servlet");
        hset.add("spring");
        hset.add("grafana");
        hset.add("grafana"); // 같은 거 두 번 입력해도 중복 허용 안 해서 하나만 출력됨

        System.out.println("hset = " + hset);
        // 중복 허용 안 함
        // add 순서랑 관계 없이 출력됨
        
        for(String str : hset){
            System.out.println("str = " + str);
        }

        // 값 꺼내는 방법
        // Iterator 클래스의 iterator() 메서드 활용해서 연속처리
        Iterator<String> iter = hset.iterator();

        // hasNext() : 순서가 없는 자료형에서 순회를 해야할 때 많이 쓰인다
        // 다음 요소가 있는지를 확인해주는 메서드로 요소가 더이상 없을 때까지 반복을 진행한다
        while(iter.hasNext()){
            System.out.println(iter.next());
        }

    }
}
