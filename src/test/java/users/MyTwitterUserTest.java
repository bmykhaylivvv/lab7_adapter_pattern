package users;

import org.junit.Assert;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import twitter.TwitterUser;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

class MyTwitterUserTest {
    public  MyTwitterUser myTwitterUser;
    @BeforeEach
    void setUp() {
        myTwitterUser = new MyTwitterUser( new TwitterUser("twitter.user@gmail.com", "USA", new Date(System.currentTimeMillis())));
    }

    @Test
    void getEmail() {
        Assert.assertEquals(myTwitterUser.getEmail(), "twitter.user@gmail.com");
    }

    @Test
    void getCountry() {
        Assert.assertEquals(myTwitterUser.getCountry(), "USA");
    }
}