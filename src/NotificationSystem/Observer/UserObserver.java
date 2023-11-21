package NotificationSystem.Observer;
import NotificationSystem.Strategy.NotificationType;
public interface UserObserver {
    public void handleEvent(String message, NotificationType type);


}
