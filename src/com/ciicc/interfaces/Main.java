package com.ciicc.interfaces;

public class Main {
    public static void main(String[] args) {
        String userName = "royce";
        String phoneNumber = "09123456789";
        String emailAddress = "royce@royce.com";

        NotificationManager email = new Email(emailAddress);
        NotificationManager sms = new Sms(phoneNumber);
        NotificationManager appNotification = new AppNotification(userName);

//        Constructor Injection
        NotificationService notificationService = new NotificationService(email);
        notificationService.send();

//        Setter injection
        notificationService.setNotificationManager(sms);
        notificationService.send();

//        Regular method injection
        notificationService.send(appNotification);
    }
}