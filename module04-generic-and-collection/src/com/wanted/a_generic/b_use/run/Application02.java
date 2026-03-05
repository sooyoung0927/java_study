package com.wanted.a_generic.b_use.run;

import com.wanted.a_generic.b_use.*;

public class Application02 {
    public static void main(String[] args) {
        /*comment
        *  와일드카드
        *  제네릭 클래스 타입의 객체를 매개변수로 전달받을 때 그 객체의 타입 변수를 제한할 수 있다
        *  <?> : 제한 없음
        *  <? extends Type> : 와일드카드 상한 제한
        *  <? super Type> : 와일드카드 하한 제한 */

        WildcardFarm wfarm = new WildcardFarm();
        // 와일드카드팜 클래스 객체 생성
        // 와일드카드팜 클래스의 메서드를 쓸 수 있게 됨

        wfarm.anyType(new RabbitFarm<Rabbit>(new Rabbit()));

        // new Rabbit() -> 레빗이 한 마리 생김
        // new RabbitFarm() -> 레빗팜 생성
        // 레빗팜에 레빗을 매개변수로 넣어줌 이때 레빗의 타입은 레빗
        // 레빗을 타입으로 쓴다? String처럼 클래스를 타입읃로 쓰는 것 -> 그러면 그 클래스 안에 있는 메서드 쓸 수 있는 것
        // 레빗 객체 == 레빗 한 마리 이고
        // 레빗팜 클래스의 매개변수가 있는 기본생성자메서드로 들어가서
        // 타입을 레빗으로 만들어둔 animal이라는 변수에 레빗 객체로 만든 레빗을 넣는다 = 매개변수가 있는 메서드 실행(인자 넘겨줌)
        // 와일드카드팜에서 매개변수로 넘겨받은 토끼 한 마리 = 레빗을 farm에 넣는다
        // 그러면 farm. 레빗의 = 레빗 안에 있는 메서드를 실행하는
        // 그래서 farm.getAnimal = rabbit
        // farm.getAnimal.cry() == rabbit.cry();


        wfarm.anyType(new RabbitFarm<Bunny>(new Bunny()));
        wfarm.anyType(new RabbitFarm<DrunkenBunny>(new DrunkenBunny()));

        System.out.println("=========================");

        //wfarm.extendsType(new RabbitFarm<Rabbit>(new Rabbit()));
        wfarm.extendsType(new RabbitFarm<Bunny>(new Bunny()));
        wfarm.extendsType(new RabbitFarm<DrunkenBunny>(new DrunkenBunny()));
        // Bunny를 상속받는 애들만 가능하게 설정을 해둠

        System.out.println("=========================");

        wfarm.superType(new RabbitFarm<Rabbit>(new Rabbit()));
        wfarm.superType(new RabbitFarm<Bunny>(new Bunny()));
        //wfarm.superType(new RabbitFarm<DrunkenBunny>(new DrunkenBunny()));
        // Bunny보다 위에 있는 애들만 가능하게 해둠
    }
}
