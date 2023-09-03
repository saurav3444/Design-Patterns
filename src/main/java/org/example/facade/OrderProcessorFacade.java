package org.example.facade;

public class OrderProcessorFacade {

    OrderProcessor orderProcessor =  new OrderProcessor();

    public void processOrder(String item, int qty){

        boolean stockPresent = orderProcessor.checkStock(item);
        if(stockPresent) {
            int id = orderProcessor.placeOrder(item, qty);
            orderProcessor.shipOrder(id);
        }
    }

}
