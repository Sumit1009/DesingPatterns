package exercise1.pizza;

public class Magherita implements Pizza {
    @Override
    public int cost() {
        return 120;
    }

    @Override
    public String makePizza() {
        return "Making Magherita Pizza";
    }
}
