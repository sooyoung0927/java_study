package com.wanted.a_generic.b_use.run;

import com.wanted.a_generic.b_use.*;

public class Application01 {
    public static void main(String[] args) {
        // RabbitFarm<Animal> farm1 = new RabbitFarm<Animal>();
        // Rabbit을 상속받은 것만 들어갈 수 있음

        RabbitFarm<Rabbit> farm2 = new RabbitFarm<>();
        RabbitFarm<Bunny> farm3 = new RabbitFarm<>();
        RabbitFarm<DrunkenBunny> farm4 = new RabbitFarm<>();

//        Rabbit rabbit = new Rabbit();
//        farm2.setAnimal(rabbit);
        farm2.setAnimal(new Rabbit());

//        Rabbit rabbit = farm2.getAnimal();
//        rabbit.cry();
        farm2.getAnimal().cry();

        farm3.setAnimal(new Bunny());
        farm3.getAnimal().cry();

        farm4.setAnimal(new DrunkenBunny());
        farm4.getAnimal().cry();
    }
}
