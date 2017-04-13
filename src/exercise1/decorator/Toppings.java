package exercise1.decorator;

import exercise1.pizza.Pizza;

public abstract class Toppings implements Pizza {
    private Pizza pizza;

    public Toppings(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public int cost() {
        return pizza.cost();
    }

    @Override
    public String makePizza() {
        return pizza.makePizza();
    }
}
