package observer;

public interface Subject {

    void register(Observer o);
    void unregister(Observer o);
    void notifyObserver(double temp, int humidity, int pressure);

}
