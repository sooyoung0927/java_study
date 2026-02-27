package com.wanted.object.b_array;

public class Application01 {
    public static void main(String[] args) {

        /*comment
        *  배열이란? 동일한 자료형의 묶음
        *  핵심 포인트는 !동일한! 자료형만 취급
        *  배열은 heap 영역에 생성이 되며, new 연산자를 통해 할당한다
        *  new 키워드 = 할당 연산자 */

        /*comment
        *  배열의 사용 이유
        *  1. 만약 배열을 사용하지 않는다면 변수를 여러 개 만들어야 한다
        *  2. 각각의 변수는 규칙이 없기 때문에 반복문을 통한 연속처리가 불가능하다
        *  ---
        *  배열의 사용 방법
        *  1. 자료형[] 변수명; -> 배열 선언
        *  2. new int[크기] / { 값 나열 } -> 할당 */

        int[] iarr = new int[5];
        System.out.println("iarr = " + iarr);
        System.out.println("iarr의 길이 : "+iarr.length);
        // 배열 안의 값 설정 안 해줘도 기본적으로 0으로 세팅됨

        /*comment
        *  heap 공간은 값이 비어있을 수 없다
        *  이때 우리가 값을 지정해주지않고 출력을 하면 0이 출력된다
        *  이는  각 자료형별 기본값이 출력된다는 뜻이다
        *  ---
        *  정수 : 0
        *  실수 : 0.0
        *  논리 : false
        *  문자 : 유니코드
        *  참조형 : null */

        // 10개의 정수가 들어갈 수 있는 배열 생성
        int[] iarr2 = new int[10];

        // 배열에 들어있는 값에 접근하는 방법 : 변수명[공간번호 (인덱스)]
        for (int i =0; i< iarr2.length;i++){
            System.out.println("iarr2["+i+"] = "+iarr2[i]);
        }

        String[] sarr = new String[5];
        for (int i =0; i< sarr.length;i++){
            System.out.println("sarr["+i+"] = "+sarr[i]);
        }

        System.out.println("NullPointerException 발생 "+sarr[4].length());

    }
}
