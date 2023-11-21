package NotificationSystem.Strategy;

import NotificationSystem.Observer.UserObserver;

public class NewBookObserver implements UserObserver {
    @Override
    public void handleEvent(String message, NotificationType type) {
        if(type==NotificationType.NEW_BOOK){
            System.out.println("Added new book notification: "+message);
        }
    }
}
