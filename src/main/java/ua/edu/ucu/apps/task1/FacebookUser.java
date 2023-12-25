package ua.edu.ucu.apps.task1;

public class FacebookUser {
    private String userMail;
    private String country;
    private long lastActiveTime;
    
    public FacebookUser(
        String userName,
        String country,
        long lastActiveTime
    ) {
        this.userMail = userName + "@meta.com";
        this.country = country;
        this.lastActiveTime = lastActiveTime;
    }

    public String getEmail() {
        return this.userMail;
    }

    public String getUserCountry() {
        return this.country;
    }

    public long getUserActiveTime() {
        long lastOnline = System.currentTimeMillis() - this.lastActiveTime;
        return lastOnline;
    }
}
