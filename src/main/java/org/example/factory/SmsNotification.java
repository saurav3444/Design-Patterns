package org.example.factory;

//@ConditionalOnProperty(prefix = "notification", name = "service", havingValue = "sms")
public class SmsNotification implements Notification{
    @Override
    public void send() {
        System.out.println("SMS send");
    }
}
