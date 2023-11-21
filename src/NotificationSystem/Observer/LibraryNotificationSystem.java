package NotificationSystem.Observer;

import NotificationSystem.Strategy.NotificationType;

import java.util.ArrayList;
import java.util.List;

public class LibraryNotificationSystem implements NotificationSystem {


    private List<UserObserver> userObservers = new ArrayList<>();

    @Override
    public void addObserver(UserObserver userObserver) {
        userObservers.add(userObserver);
    }

    @Override
    public void removerObserver(UserObserver userObserver) {
        userObservers.remove(userObserver);
    }

    @Override
    public void notifyObservers(String message, NotificationType type) {
        for(UserObserver reader:userObservers){
            reader.handleEvent(message,type);
        }
    }
}
