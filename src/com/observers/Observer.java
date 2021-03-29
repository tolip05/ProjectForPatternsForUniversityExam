package com.observers;

public abstract class Observer {
    protected Subject subject;

    protected Observer() {
    }
    public abstract void update(boolean state);

}
