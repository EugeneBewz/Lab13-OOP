package ua.edu.ucu.apps.task1;

import java.util.Date;

public class MessageSender {
    public static void send(String text, Object user, String country) {
        Date currentDateTime = new Date();
        Date nextHour = new Date(currentDateTime.getTime() + 60 * 60 * 2);

        if (user instanceof TwitterUser) {
            TwitterUser twitterUser = (TwitterUser) user;
            if (twitterUser.getCountry().equals(country) && twitterUser.getLastActiveTime() < nextHour.getTime()) {
                System.out.println("Sending message to " + twitterUser.getUserMail() + ": " + text);
            } else {
                System.out.println("User not eligible for message sending.");
            }
        } else if (user instanceof FacebookUser) {
            FacebookUser facebookUser = (FacebookUser) user;
            if (facebookUser.getUserCountry().equals(country) && facebookUser.getUserActiveTime() < nextHour.getTime()) {
                System.out.println("Sending message to " + facebookUser.getEmail() + ": " + text);
            } else {
                System.out.println("User not eligible for message sending.");
            }
        } else {
            System.out.println("Invalid user type.");
        }
    }
}