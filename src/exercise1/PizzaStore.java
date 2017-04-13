package exercise1;

import exercise1.decorator.BarbequeTopping;
import exercise1.decorator.FreshTomatoTopping;
import exercise1.pizza.PeppyPaneer;
import exercise1.pizza.Pizza;

public class PizzaStore {
    public static void main(String[] args) {
        Pizza pizza = new BarbequeTopping(new FreshTomatoTopping(new PeppyPaneer()));
        System.out.println(pizza.makePizza());
        System.out.println("Total Cost: " + pizza.cost());
    }
}
