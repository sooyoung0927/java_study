package com.wanted.a_generic.a_basic;

public class GenericTest<T> {
    /*comment
    *  제네릭 설정하는 방법은 클래스 선언부 마지막에 <T>를 사용한다
    *  T는 타입변수라고 불리고 어느 알파벳이든 괜찮지만 관례상 T를 사용한다
    *  */

    private T value;

    public void setValue(T value){
        this.value=value;
    }

    public T getValue(){
        return this.value;
    }
    // 변수의 데이터 타입을 지정하지 않고 T라고만 둠

    @Override
    public String toString() {
        return "GenericTest{" +
                "value=" + value +
                '}';
    }
}
