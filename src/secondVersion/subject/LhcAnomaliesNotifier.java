package secondVersion.subject;

import secondVersion.observer.Observer;

import java.util.LinkedList;
import java.util.List;

public class LhcAnomaliesNotifier {
    private List<Observer> observers = new LinkedList<>();

    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    public void unregisterObserver(Observer observer) {
        observers.remove(observer);
    }

    public void notifyObservers(String message) {
        observers.forEach(observer -> observer.notify(message));
    }
}
