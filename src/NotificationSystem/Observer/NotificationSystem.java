package NotificationSystem.Observer;
import NotificationSystem.Strategy.NotificationType;
public interface NotificationSystem {
    public void addObserver(UserObserver userObserver);
    public void removerObserver(UserObserver userObserver);
    public void notifyObservers(String message, NotificationType type);

}
