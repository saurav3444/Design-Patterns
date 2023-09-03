package org.example.factory;
//@ConditionalOnProperty(prefix = "notification", name = "service", havingValue = "email")

public class EmailNotification implements Notification{
    @Override
    public void send() {
        System.out.println("Email Send");
    }
}
