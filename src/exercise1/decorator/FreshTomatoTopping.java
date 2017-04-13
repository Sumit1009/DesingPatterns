package exercise1.decorator;

import exercise1.pizza.Pizza;

public class FreshTomatoTopping extends Toppings {

    public FreshTomatoTopping(Pizza pizza) {
          super(pizza);
    }

    @Override
    public int cost() {
        return super.cost()+50;
    }

    @Override
    public String makePizza() {
        return super.makePizza()+" with Fresh Tomato";
    }
}
