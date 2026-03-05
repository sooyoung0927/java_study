package hamburger;

public class WildcardFarm {

     /*  <?> : 제한 없음
        *  <? extends Type> : 와일드카드 상한 제한
        *  <? super Type> : 와일드카드 하한 제한 */

    public void anyType(Kitchen<?> giveBurger){
        giveBurger.getSelectBurger().order();
    }

    public void extendsType(Kitchen<? extends Cheeseburger> giveBurgeer){
        giveBurgeer.getSelectBurger().order();
    }

    public void superType(Kitchen<? super Cheeseburger> giveBurger){
        giveBurger.getSelectBurger().order();
    }

}
