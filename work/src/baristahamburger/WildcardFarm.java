package baristahamburger;

import hamburger.Kitchen;

public class WildcardFarm {
    public void anyType(Kitchen<?> giveBurger){
        giveBurger.getSelectBurger().order();
    }
}
