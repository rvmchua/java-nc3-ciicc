package com.ciicc.interfaces;

public class NotificationService {

    private NotificationManager notificationManager;

    public NotificationService(NotificationManager notificationManager) {
        this.notificationManager = notificationManager;
    }

    public void setNotificationManager(NotificationManager notificationManager) {
        this.notificationManager = notificationManager;
    }

    public void send() {
        notificationManager.notifyUser();
    }

//  Method overloading
    public void send(NotificationManager notification) {
        notification.notifyUser();
    }

}
