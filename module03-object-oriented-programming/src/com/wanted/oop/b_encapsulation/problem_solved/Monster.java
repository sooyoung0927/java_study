package com.wanted.oop.b_encapsulation.problem_solved;

public class Monster {

    /*comment
    *  접근제어자
    *  1. public : 모든 패키지에서 접근 가능
    *  2. private : 해당 클래스 내부에서만 접근 가능
    *  3. default : 동일 패키지에서만 접근 가능 (작성하지 않으면 default)
    *  4. protected : 동일 패키지에서 접근 가능 (상속관계일 경우 다른 패키지도 가능) */

    private String kind;
    private int hp;

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
        return "몬스터의 이름은 "+this.kind+"이며"+" 체력은 "+this.hp+"이다";
    }


}
