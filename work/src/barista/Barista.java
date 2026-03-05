package barista;

public class Barista {

    private Machine machine = new Machine();

    public void startUp() {
        machine.start();
    }

    public void order() {
        machine.makecoffee();
    }

    public void fullIngredient() {
        machine.full();
    }

    public void washMachine() {
        machine.wash();
    }
}
