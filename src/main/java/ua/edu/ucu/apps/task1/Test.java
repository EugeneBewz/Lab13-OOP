package ua.edu.ucu.apps.task1;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Test {
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("MM-dd-yyyy hh:mm:ss");
        String lastActiveTimeStr = "12-25-2023 16:00:00";
        long lastActiveTimeMillis;
        
        TwitterUser user;
        lastActiveTimeMillis = sdf.parse(lastActiveTimeStr).getTime();
        user = new TwitterUser("cheporte", "Ukraine", lastActiveTimeMillis);

        System.out.println(user.getUserMail());
        System.out.println(user.getCountry());
        System.out.println(user.getLastActiveTime());
    }
}
