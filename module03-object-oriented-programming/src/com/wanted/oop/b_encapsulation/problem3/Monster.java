package com.wanted.oop.b_encapsulation.problem3;

public class Monster {

    /* 몬스터의 이름, 체력 */
//    String name;
//    int hp;

    String kind;
    int hp;

    /*필드에 접근해서 값을 초기화 하게 되면
    * problem2에서 확인한 것처럼 변수명을 바꾸었을 때 Application에서도 에러가 발생한다
    * 그 문제를 해결하기 위해 hp를 설정할 때 method를 사용했던 것처럼 name관련 메서드를 만들 것이다 */

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

    public void setName(String name){
        this.kind = name;
    }

    public String getInfo(){
        return "몬스터의 이름은 "+this.kind+"이며 체력은 "+this.hp+"이다";
    }
}
