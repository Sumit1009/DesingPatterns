package exercise1.pizza;

public class PeppyPaneer implements Pizza {
    @Override
    public int cost() {
        return 180;
    }
    @Override
    public String makePizza() {
        return "Making Peppy Paneer Pizza";
    }
}
