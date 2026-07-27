package com.ciicc.interfaces;

public class Email implements NotificationManager{
    private String emailAddress;

    public Email(String userName) {
        this.emailAddress = userName;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    @Override
    public void notifyUser() {
        System.out.println("Notified " + emailAddress + " via Email");
    }
}
