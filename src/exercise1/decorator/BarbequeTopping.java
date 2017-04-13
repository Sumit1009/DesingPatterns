package exercise1.decorator;

import exercise1.pizza.Pizza;

public class BarbequeTopping extends Toppings{
    public BarbequeTopping(Pizza pizza) {
        super(pizza);
    }

    @Override
    public int cost() {
        return super.cost()+20;
    }

    @Override
    public String makePizza() {
        return super.makePizza()+" with Barbeque";
    }
}
