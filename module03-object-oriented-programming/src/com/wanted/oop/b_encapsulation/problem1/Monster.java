package com.wanted.oop.b_encapsulation.problem1;

public class Monster {

    /* 몬스터의 이름, 체력 */
    String name;
    int hp;

    // hp를 설정하는 메서드
    // 매개변수로 전달받은 hp값을 변경해주는 메서드
    // 양수인 경우에는 전달받은 값으로 세팅 / 음수인 경우에는 0으로 변경
    public void setHP(int hp){
        if(hp>0){
            System.out.println("정상! 몬스터 체력을 "+hp+"로 설정합니다 ");
            /* this : 인스턴스가 생성될 때, 자신의 주소를 저장하는 레퍼런스 변수
            *  지역변수와 전역변수의 이름이 같을 때 지역변수를 우선적으로 접근하기 때문에
            *  전역변수에 값을 대입하기 위해서는 this. 을 명시해야 한다 */

            // 즉, 전역변수에 this.을 붙여서 지정
            this.hp=hp;
        }else{
            System.out.println("오류! 몬스터의 체력을 0으로 설정합니다");
            this.hp=0;
        }
    }


}
