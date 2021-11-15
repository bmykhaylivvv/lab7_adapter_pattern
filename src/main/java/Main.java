import facebook.FacebookUser;
import sender.MessageSender;
import twitter.TwitterUser;
import users.MyFacebookUser;
import users.MyTwitterUser;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        MessageSender messageSender = new MessageSender();

        MyTwitterUser myTwitterUser = new MyTwitterUser( new TwitterUser("twitter.user@gmail.com", "USA", new Date(System.currentTimeMillis())));
        MyFacebookUser myFacebookUser  = new MyFacebookUser( new FacebookUser("facebook.user@gmail.com", "Netherlands", new Date(System.currentTimeMillis())));


        messageSender.send("Twitter NOTIFICATION", myTwitterUser, "USA");
        System.out.println("---");
        messageSender.send("Facebook NOTIFICATION", myFacebookUser, "USA");

    }
}
