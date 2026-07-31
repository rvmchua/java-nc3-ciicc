package com.ciicc.interfaces;

public class Email implements NotificationManager{
    private String emailAddress;

    public Email(String email) {
        this.emailAddress = email;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    @Override
    public void notifyUser() {
        System.out.println("Notified " + emailAddress + " via Email");
    }

    @Override
    public void sendDetail() {
        System.out.println("Email address is: " + emailAddress);
    }

}

