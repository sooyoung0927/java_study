package com.wanted.a_generic.b_use;

public class RabbitFarm<T extends Rabbit> {
    // 어떤 타입이든 올 수 있는데 레빗을 상속받은 것들만
    // Rabbit / Bunny / DrunkenRabbit 가능

    /* T 타입 변수에는 어떤 값이 올지 모르지만
    *  상속을 해주면 해당 T타입변수에는 Rabbit 혹은 Rabbit을 상속받은 클래스만 들어올 수 있게 된다 */
    private T animal;

    // 초기화하는 기본 생성자
    public RabbitFarm(){}

    public RabbitFarm(T animal) {
        this.animal = animal;
    }

    public T getAnimal() {
        return animal;
    }

    public void setAnimal(T animal) {
        this.animal = animal;
    }
}
