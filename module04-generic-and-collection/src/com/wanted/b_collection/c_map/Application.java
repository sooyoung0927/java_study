package com.wanted.b_collection.c_map;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class Application {
    public static void main(String[] args) {
        /*comment
        *  Map
        *  Map의 자료구조를 이용하고 HashMap을 사용해보자
        *  Map의 가장 기억해야하는 특징
        *  1. 키-값 을 한 쌍으로 데이터를 저장한다
        *  2. 키는 Set 자료구조로 활용하여 구성되어 있으며 중복이 허용되지 않는다
        *  */

        Map map = new HashMap();
        
        // 값을 넣는 메서드
        map.put("one",new Date());
        map.put(12,"apple");
        map.put(1,true);
        // 만약 키값을 중복으로 넣게 되면
        // 가장 마지막에 작성한 값으로 덮어씌워진다
        // 값은 중복 상관없음

        System.out.println("map = " + map);
        // Map 자료구조에 담긴 값을 꺼낼 때는 키를 활용하고
        // 그땐 get메서드를 활용한다. get(key);

        System.out.println("키값이 12인 것의 값 꺼내기 : "+map.get(12));
        
        
        Map<String,String> map2 = new HashMap<>();
        //map2.put("one",12); 제네릭 타입 안 맞아서 오류남
        map2.put("one","go home!!");
        map2.put("a","aaaa");
        map2.put("two","lalala");
        map2.put("b","bbbb");

        System.out.println("map2 = " + map2);
    }
}
