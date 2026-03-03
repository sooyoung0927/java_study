package com.wanted.oop.b_encapsulation.problem3;

public class Application {
    public static void main(String[] args) {

        /*comment
        *  캡슐화 적용 전 발생할 수 있는 문제(3)
        *  앞서 발생한 문제 1과 2를 해결해보자
        *  method를 통해서 필드에 직접 값을 넣지 않고 진행  */

        // 1번 몬스터 생성
        Monster monster1 = new Monster();
        monster1.setName( "또도가스");
        monster1.setHP(200);

//        System.out.println("monster1.name = " + monster1.name);
//        System.out.println("monster1.hp = " + monster1.hp);
        monster1.getInfo();

        System.out.println("---");

        // 2번 몬스터 생성
        Monster monster2 = new Monster();
        monster2.setName( "가라도스");
        monster2.setHP(-200);

        /*comment
        *  문제 상황 발생 !!
        *  검증되지 않은 값을 넣을 때 문제가 발생할 수 있다 */

//        System.out.println("monster2.name = " + monster2.name);
//        System.out.println("monster2.hp = " + monster2.hp);
        monster2.getInfo();

        System.out.println("---");

        // 3번 몬스터 생성
        Monster monster3 = new Monster();
        monster3.setName( "피카츄");
        monster3.setHP(-200);

//        System.out.println("monster3.name = " + monster3.name);
//        System.out.println("monster3.hp = " + monster3.hp);
        monster3.getInfo();


        /*comment
        *  이제 거의 다 해결했는데 아직도 문제인 거는
        *  여전히 필드에 접근할 수 있다는 것이다 */

    }
}
