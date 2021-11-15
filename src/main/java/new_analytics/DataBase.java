package new_analytics;
import analytics.БазаДаних;

public class DataBase extends БазаДаних {
    public String getUserData() {
        return отриматиДаніКористувача();
    }

    public String getStaticticsData() {
        return отриматиСтатистичніДані();
    }
}
