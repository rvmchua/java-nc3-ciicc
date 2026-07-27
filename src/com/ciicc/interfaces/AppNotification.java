package com.ciicc.interfaces;

public class AppNotification implements NotificationManager {
    private String userName;

    public AppNotification(String userName) {
        this.userName = userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    @Override
    public void notifyUser() {
        System.out.println("Notified "+ userName + " via App");
    }
}
