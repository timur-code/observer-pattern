package com.company.observable;

import com.company.observers.IObserver;

public interface IObservable {
    public void add(IObserver observer);
    public void remove(IObserver observer);
    public void notifyObservers(Integer postType);

}
