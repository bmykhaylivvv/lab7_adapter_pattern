package sender;

import users.User;

public class MessageSender {
    public boolean send(String text, User user, String country) {
        try {
            user.send(text, country);
            return true;
        } catch (Exception e) {
            System.out.println("Oops, some error with message sending :(");
            return false;
        }
    }
}
