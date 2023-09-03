package org.example.template;

public class NescafeCoffeeMaker extends CoffeeMaker{
    @Override
    public void boilWater() {
        System.out.println("boil coffee for two minute");
    }

    @Override
    public void addSugarMilk() {
        System.out.println("add one and half tablespoon sugar and one cup milk ");
    }

    @Override
    public void addCoffee() {
        System.out.println("add one tablespoon Nescafe coffee");
    }
}
