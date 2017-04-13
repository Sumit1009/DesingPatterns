package exercise1.decorator;

import exercise1.pizza.Pizza;

public class JalpenoTopping extends Toppings {

    public JalpenoTopping(Pizza pizza) {
        super(pizza);
    }

    @Override
    public int cost() {
        return super.cost()+20;
    }

    @Override
    public String makePizza() {
        return super.makePizza()+" with Jalpeno ";
    }
}
