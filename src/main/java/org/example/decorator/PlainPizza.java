package org.example.decorator;

public class PlainPizza implements Pizza{
    @Override
    public void bake() {
        System.out.println("Base Pizza prepared");
    }
}
