package com.ciicc.interfaces;

public class Main {
    public static void main(String[] args) {
//        UserInfo user = new UserInfo(
//                "Royce",
//                "royce@royce.com",
//                "09123456789"
//        );

        String emailAddress = "royce@royce";
        String phone = "09123456789";
        String userName = "royce";

        NotificationManager email = new Email(emailAddress);
        NotificationManager sms = new Sms(phone);
        NotificationManager app = new AppNotification(userName);

//        Constructor Injection
        NotificationService emailNotif = new NotificationService(email);
        emailNotif.send();
        emailNotif.sendDetail();

        NotificationService smsNotif = new NotificationService(sms);
        smsNotif.send();
        smsNotif.sendDetail();

        NotificationService appNotif = new NotificationService(app);
        appNotif.send();
        appNotif.sendDetail();





////        Setter injection
//        notificationService.setNotificationManager(sms);
//        notificationService.send();
//
////        Regular method injection
//        notificationService.send(appNotification);
    }
}
