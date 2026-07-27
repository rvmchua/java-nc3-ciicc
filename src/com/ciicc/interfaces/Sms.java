package com.ciicc.interfaces;

public class Sms implements NotificationManager {
    private String phoneNumber;

    public Sms(String userName) {
        this.phoneNumber = userName;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public void notifyUser() {
        System.out.println("Notified " + phoneNumber + " via SMS");
    }
}
