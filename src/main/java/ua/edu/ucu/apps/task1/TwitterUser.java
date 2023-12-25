package ua.edu.ucu.apps.task1;

public class TwitterUser {
    private String userMail;
    private String country;
    private long lastActiveTime;
    
    public TwitterUser(
        String userName,
        String country,
        long lastActiveTime
    ) {
        this.userMail = userName + "@twitter.com";
        this.country = country;
        this.lastActiveTime = lastActiveTime;
    }

    public String getUserMail() {
        return this.userMail;
    }

    public String getCountry() {
        return this.country;
    }

    public long getLastActiveTime() {
        long lastOnline = this.lastActiveTime - System.currentTimeMillis();
        return lastOnline;
    }
}
