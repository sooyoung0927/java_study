package baristahamburger;

public class DroppedBurger extends Burger
{
    @Override
    public void order() {
        System.out.println("주문하신 떨군 버거 나왔습니다");
    }
}
