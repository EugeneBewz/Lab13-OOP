import org.junit.Test;
import org.junit.jupiter.api.Assertions;

import ua.edu.ucu.apps.task1.TwitterUser;
import ua.edu.ucu.apps.task1.FacebookUser;

public class testMessageSender {
    @Test
    public void testTwitterUserMail() {
        TwitterUser twitterUser = new TwitterUser("cheporte", "Ukraine", 12);
        String userMail = "cheporte@twitter.com";
        Assertions.assertEquals(twitterUser.getUserMail(), userMail);
    }

    @Test
    public void testFacebookUserMail() {
        FacebookUser facebookUser = new FacebookUser("cheporte", "Ukraine", 12);
        String userMail = "cheporte@meta.com";
        Assertions.assertEquals(facebookUser.getEmail(), userMail);
    }

    @Test
    public void testTwitterGetCountry() {
        TwitterUser twitterUser = new TwitterUser("cheporte", "Ukraine", 12);
        String userCountry = "Ukraine";
        Assertions.assertEquals(twitterUser.getCountry(), userCountry);
    }

    @Test
    public void testFacebookGetCountry() {
        FacebookUser facebookUser = new FacebookUser("cheporte", "Ukraine", 12);
        String userCountry = "Ukraine";
        Assertions.assertEquals(facebookUser.getUserCountry(), userCountry);
    }
}
