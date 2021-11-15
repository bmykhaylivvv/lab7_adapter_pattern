package users;

import facebook.FacebookUser;
import org.junit.Assert;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Date;

class MyFacebookUserTest {
    public MyFacebookUser myFacebookUser;

    @BeforeEach
    void setUp() {
        myFacebookUser = new MyFacebookUser(new FacebookUser("facebook.user@gmail.com", "Netherlands", new Date(System.currentTimeMillis())));
    }

    @Test
    void getEmail() {
        Assert.assertEquals(myFacebookUser.getEmail(), "facebook.user@gmail.com");
    }

    @Test
    void getCountry() {
        Assert.assertEquals(myFacebookUser.getCountry(), "Netherlands");
    }
}