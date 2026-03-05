package baristahamburger;

public class Kitchen<T extends Burger> {
    private T selectBurger;

    public Kitchen(){}

    public Kitchen(T selectBurger) {
        this.selectBurger = selectBurger;
    }

    public T getSelectBurger() {
        return selectBurger;
    }

    public void setSelectBurger(T selectBurger) {
        this.selectBurger = selectBurger;
    }

    @Override
    public String toString() {
        return "Kitchen{" +
                "selectBurger=" + selectBurger +
                '}';
    }
}
