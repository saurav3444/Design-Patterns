package org.example;

import org.example.adapter.WeatherAdapter;
import org.example.adapter.WeatherUI;
import org.example.builder.HttpClient;
import org.example.decorator.ChickenPizzaDecorator;
import org.example.decorator.Pizza;
import org.example.decorator.PlainPizza;
import org.example.decorator.VeggiePizzaDecorator;
import org.example.facade.OrderProcessor;
import org.example.facade.OrderProcessorFacade;
import org.example.factory.Notification;
import org.example.factory.NotificationFactory;
import org.example.factory.NotificationType;
import org.example.template.BruCoffeeMaker;
import org.example.template.CoffeeMaker;
import org.example.template.NescafeCoffeeMaker;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int ch = sc.nextInt();

        switch(ch){
            case 1:
                System.out.println("Singleton");
                break;
            case 2:
                System.out.println("Factory");
                break;

            case 3:
                System.out.println("Template");
                CoffeeMaker coffeeMaker = new NescafeCoffeeMaker();
                coffeeMaker.makeCoffee();
                coffeeMaker = new BruCoffeeMaker();
                coffeeMaker.makeCoffee();
                break;

            case 4:
                System.out.println("Adapter");
                WeatherUI weatherUI = new WeatherUI();
                weatherUI.findTemperature(411014);
                break;
            case 5:
                System.out.println("Decorator");
                Pizza pizza = new PlainPizza();
                pizza.bake();
                System.out.println("---------");
                pizza = new ChickenPizzaDecorator(pizza);
                pizza.bake();
                System.out.println("---------");
                pizza = new VeggiePizzaDecorator(pizza);
                pizza.bake();
                System.out.println("---------");

                break;
            case 6:
                System.out.println("Without Facade");
                OrderProcessor orderProcessor = new OrderProcessor();
                orderProcessor.checkStock("MacBook");
                int id = orderProcessor.placeOrder("MacBook", 3);
                orderProcessor.shipOrder(id);

                System.out.println("With Facade");
                OrderProcessorFacade orderProcessorFacade = new OrderProcessorFacade();
                orderProcessorFacade.processOrder("MacBook", 3);
                break;

            case 7:
                System.out.println("Builder");
                HttpClient.HttpClientBuilder httpClientBuilder = new HttpClient.HttpClientBuilder();
                httpClientBuilder.method("m1").username("user1").password("324rhhf$3");
                HttpClient httpclient = httpClientBuilder.build();
                System.out.println(httpclient.toString());
                break;

            case 8:
                System.out.println("Factory");
                NotificationFactory nf = new NotificationFactory();
                Notification notification = nf.createNotification(NotificationType.EMAIL);
                System.out.println(notification.getClass());
                notification = nf.createNotification(NotificationType.SMS);
                System.out.println(notification.getClass());

                System.out.println("Using ConditionalOnProperty we can instantiate a specific " +
                        "instance from multiple implementation of a given interface");
                break;
        }
    }
}