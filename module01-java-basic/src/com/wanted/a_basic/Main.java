package com.wanted.a_basic;

public class Main {
    // 한 줄 주석
    /* 여러 줄 주석
    * 작성 가능하다
    *  이말이야 */

    // 자바의 기본 구조 및 실행 방식
    /* 1. 모든 자바 기반의 프로그램은 클래스 안에서 동작한다
    *  2. main()이라는 메서드가 프로그램의 시작점이 된다 */

    //자바의 실행 과정
    /* 1. 자바 소스코드(.java) 를 작성한다
    *  2. 컴파일러(javac)를 사용하여 바이트코드(.class) 로 변환한다
    *  3. JVM(Java Virtual Machine) 이 .class 파일을 실행한다
    *  4. JVM은 바이트코드를 해석하여 OS에서 싷행 가능한 기계어로 변환
    *  5. 실행 결과를 출력하거나, 다른 연산을 진행한다 */

    //주요개념
    /* - 컴파일(Compile) : .java -> .class 변환(jvm이 이해할 수 있도록)
    *  - 바이트코드(ByteCode) : JVM에서 실행 가능한 중간 코드
    *  - JVM : 바이트 코드를 OS에 맞는 기계어로 변환하여 실행 */

    public static void main(String[] args) {
        System.out.println("hello world");
    }
}