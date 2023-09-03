package org.example.template;

public class BruCoffeeMaker extends CoffeeMaker{
    @Override
    public void boilWater() {
        System.out.println("boil coffee for one minute");
    }

    @Override
    public void addSugarMilk() {
        System.out.println("add one tablespoon sugar and one cup milk ");
    }

    @Override
    public void addCoffee() {
        System.out.println("add one tablespoon BRU coffee");
    }
}
