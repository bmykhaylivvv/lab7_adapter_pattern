package sender;

import facebook.FacebookUser;
import org.junit.Assert;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import users.MyFacebookUser;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

class MessageSenderTest {
    public MessageSender messageSender;
    public MyFacebookUser myFacebookUser;
    @BeforeEach
    void setUp() {
        messageSender = new MessageSender();
        myFacebookUser  = new MyFacebookUser( new FacebookUser("facebook.user@gmail.com", "Netherlands", new Date(System.currentTimeMillis())));
    }

    @Test
    void send() {
        Assert.assertTrue(messageSender.send("Test text", myFacebookUser, "USA"));
    }
}