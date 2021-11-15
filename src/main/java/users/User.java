package users;

import java.util.Date;

public interface User {
    String getEmail();
    String getCountry();
    Date getLastActiveTime();
    void send(String text, String country);
}
