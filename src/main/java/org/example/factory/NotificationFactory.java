package org.example.factory;

public class NotificationFactory {

    public Notification createNotification(NotificationType type){

        switch(type){

            case EMAIL: return new EmailNotification();
            case SMS:   return new SmsNotification();
            default:    return null;
        }
    }
}
