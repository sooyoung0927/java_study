package hamburger;

public class Kitchen<T extends Burger>{

    private T selectBurger;

    // 기본 생성자
    public Kitchen() {}

    // 초기화하는 메서드
    public Kitchen(T selectBurger) {
        this.selectBurger = selectBurger;
    }

    public T getSelectBurger() {
        return selectBurger;
    }

    public void setSelectBurger(T selectBurger) {
        this.selectBurger = selectBurger;
    }
}
