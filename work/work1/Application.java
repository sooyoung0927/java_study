package com.wanted.a_generic.b_use.work1;

public class Application {
    public static void main(String[] args) {
        WildcardFarm wfarm = new WildcardFarm();

        wfarm.anyType(new Kitchen<Burger>(new Burger()));
        wfarm.anyType(new Kitchen<Cheeseburger>(new Cheeseburger()));
        wfarm.anyType(new Kitchen<DroppedCheeseburger>(new DroppedCheeseburger()));

        //wfarm.extendsType(new Kitchen<Burger>(new Burger()));
        wfarm.extendsType(new Kitchen<Cheeseburger>(new Cheeseburger()));
        wfarm.extendsType(new Kitchen<DroppedCheeseburger>(new DroppedCheeseburger()));

        wfarm.superType(new Kitchen<Burger>(new Burger()));
        wfarm.superType(new Kitchen<Cheeseburger>(new Cheeseburger()));
        //wfarm.superType(new Kitchen<DroppedCheeseburger>(new DroppedCheeseburger()));
    }
}
