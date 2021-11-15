package users;

import facebook.FacebookUser;

import java.util.Date;

public class MyFacebookUser implements User{
    private FacebookUser facebookUser;

    public MyFacebookUser(FacebookUser facebookUser) {
        this.facebookUser = facebookUser;
    }

    public String getEmail() {
        return facebookUser.getEmail();
    }

    public String getCountry() {
        return facebookUser.getUserCountry();
    }

    public Date getLastActiveTime() {
        return facebookUser.getLastActiveTime();
    }

    @Override
    public void send(String text, String country) {
        System.out.println("Send to FACEBOOK user: " + "\nUser Email: " + facebookUser.getEmail() + ", User Country:  " +
                facebookUser.getUserCountry() + ", User was active on " +  facebookUser.getLastActiveTime()  + "\n" +
                "Message text: \"" + text + "\", Message Country: " + country );
    }
}
