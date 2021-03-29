package com.observers;

import java.util.ArrayList;
import java.util.List;

public class Subject {
    private List<Observer> observers;
    private boolean state;

    public Subject() {
        this.observers = new ArrayList<>();
    }

    public boolean getState() {
        return state;
    }

    public void setState(boolean state) {
        this.state = state;
        notifyAllObservers();
    }

    public void attach(Observer observer){
        observers.add(observer);
    }

    public void notifyAllObservers(){
        for (Observer observer : observers) {
            observer.update(state);
        }
    }
}
