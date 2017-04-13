package exercise1.pizza;

public class Farmhouse implements Pizza {
    @Override
    public int cost() {
        return 150;
    }

    @Override
    public String makePizza() {
        return "Making Farmhouse Pizza";
    }
}
