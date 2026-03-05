package com.wanted.b_collection.a_list.run;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;

public class Application01 {
    public static void main(String[] args) {
        /*comment
        *  Collection Framework
        *  1. List 
        *  - 순서 있는 데이터 집합으로 중복의 허용한다
        *  2. Set
        *  - 순서 없는 데이터의 집합으로 데이터의 중복을 허용하지 않는다 
        *  3. Map
        *  - 키와 값 한 쌍으로 이루어지는 데이터 집합이다 
        *  - key는 set 방식으로 관리가 되어 있기 때문에 중복이 허용되지 않는다 */

        // List list = new List();
        // List 자체는 인터페이스라서 객체 만들 수 없음 -> 그래서 이 인터페이스를 상속받은 클래스를 가져와 객체로 생성
        
        /*comment
        *  ArrayList는 가장 많이 사용되는 컬렉션의 클래스이다
        *  내부적으로 배열의 특징을 가지고 있으며
        *  배열의 특징이기 때문에 인덱스를 통해 각 공간의 값에 접근할 수 있다 */
        List list = new ArrayList();
        list.add("apple");
        list.add("apple"); // 중복 저장 허용
        list.add(123);
        list.add(123.123);
        list.add(new Date());

        System.out.println("list = " + list);

        list.size();
        System.out.println("list.size = " + list.size());
        //원래는 10칸으로 기본 세팅이 되는데 우리가 넣는만큼 늘고 줄고 함

        for(int i=0;i< list.size();i++){
            // list 안에 있는 값 꺼내는 방법
            System.out.println(i+" : "+list.get(i));
        }
        
        list.add(1,"i like");
        System.out.println("list = " + list);
        
        list.remove(2);
        System.out.println("list = " + list);

        System.out.println("===================");

        // 제네릭 개념을 사용해서 스트링 값만 들어가는 리스트 생성해보자
        List<String> stringList = new ArrayList<>();

        //stringList.add(1);
        stringList.add("a");
        stringList.add("c");
        stringList.add("d");
        stringList.add("b");

        // 정렬 기능
        Collections.sort(stringList);

        System.out.println("stringList = " + stringList);


    }
}
// 오버라이딩 : 부모 클래스에 있는 메서드를 받아서 내멋대로 바꾼 것
// 오버로딩 : 메서드명은 같지만 다른 기능을 수행