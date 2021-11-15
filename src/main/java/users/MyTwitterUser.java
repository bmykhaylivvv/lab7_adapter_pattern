package users;

import twitter.TwitterUser;

import java.util.Date;

public class MyTwitterUser implements User {
    private TwitterUser twitterUser;

    public MyTwitterUser(TwitterUser twitterUser) {
        this.twitterUser = twitterUser;
    }

    public String getEmail() {
        return twitterUser.getEmail();
    }

    public String getCountry() {
        return twitterUser.getUserCountry();
    }

    public Date getLastActiveTime() {
        return twitterUser.getLastActiveTime();
    }

    @Override
    public void send(String text, String country) {
        System.out.println("Send to TWITTER user: " + "\nUser Email: " + twitterUser.getEmail() + ", User Country:  " +
                twitterUser.getUserCountry() + ", User was active on " +  twitterUser.getLastActiveTime()  + "\n" +
                "Message text: \"" + text + "\", Message Country: " + country );
    }

}
