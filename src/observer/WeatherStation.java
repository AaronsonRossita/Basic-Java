package observer;

import java.util.ArrayList;

public class WeatherStation implements Subject {

    private ArrayList<Observer> observers;

    public WeatherStation() {
        observers = new ArrayList<>();

    }

    public ArrayList<Observer> getObservers() {
        return observers;
    }

    @Override
    public void register(Observer o) {
        if(!observers.contains(o)){
            observers.add(o);
        }
    }

    @Override
    public void unregister(Observer o) {
        if(observers.contains(o)){
            observers.remove(o);
        }
    }

    @Override
    public void notifyObserver(double temp, int humidity, int pressure) {
        for (Observer o : observers){
            o.update(temp,humidity,pressure);
        }
    }
}
