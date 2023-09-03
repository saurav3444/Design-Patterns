package org.example.decorator;

public class PizzaDecorator implements Pizza{

    Pizza pizza;

    public PizzaDecorator(Pizza pizza) {
        this.pizza = pizza;
    }
    @Override
    public void bake(){
        pizza.bake();
    }
}
