package org.example.facade;

public class OrderProcessor {

    public boolean checkStock(String item){
        System.out.println("Checking stock for " + item);
        return true;
    }

    public int placeOrder(String item, int qty){
        System.out.println("place order for "+ item + " qty:" + qty);
        return 101;
    }

    public void shipOrder(int id){
        System.out.println("Ordered shipped:" + id);
    }
}
