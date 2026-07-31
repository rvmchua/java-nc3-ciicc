package com.ciicc.interfaces;

public class Sms implements NotificationManager {
    private String phoneNumber;

    public Sms(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public void notifyUser() {
        System.out.println("Notified " + phoneNumber + " via SMS");
    }

    @Override
    public void sendDetail() {
        System.out.println("Phone number is: " + phoneNumber);
    }
}
