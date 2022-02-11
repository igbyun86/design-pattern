package behavior.observer.example2.solving;

import java.util.ArrayList;
import java.util.List;

public abstract class Subject {
    private List<Observer> observers = new ArrayList<>();

    //통보 대상을 추가함
    public void attach(Observer observer) {
        observers.add(observer);
    }

    //통보 대상을 제거함
    public void detach(Observer observer) {
        observers.remove(observer);
    }

    //통보 대상 목록, 즉 observers의 각 옵서버에게 변경을 통보함
    public void notifyObservers() {
        observers.forEach(Observer::update);
    }
}
