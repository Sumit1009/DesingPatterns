package exercise1.pizza;

public class ChickenFiesta implements Pizza {
    @Override
    public int cost() {
        return 200;
    }

    @Override
    public String makePizza() {
        return "Making Chicken Fiesta Pizza ";
    }
}
