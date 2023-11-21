package NotificationSystem.Strategy;

import NotificationSystem.Observer.UserObserver;

public class ReleasedBookObserver implements UserObserver {
    @Override
    public void handleEvent(String message, NotificationType type) {
        if(type==NotificationType.RELEASED_BOOK) {
            System.out.println("1 book just released: " + message);
        }
    }
}
