package org.example.decorator;

public class ChickenPizzaDecorator extends PizzaDecorator{

    public ChickenPizzaDecorator(Pizza pizza) {
        super(pizza);
    }

    @Override
    public void bake() {
        super.bake();
        System.out.println("add chicken toppings");
    }
}
