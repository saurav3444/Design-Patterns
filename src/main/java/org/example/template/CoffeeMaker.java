package org.example.template;

public abstract class CoffeeMaker {

    public void makeCoffee(){

        boilWater();
        addSugarMilk();
        addCoffee();
    }

    public abstract void boilWater();
    public abstract void addSugarMilk();
    public abstract void addCoffee();
}
