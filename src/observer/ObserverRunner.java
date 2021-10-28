package observer;

public class ObserverRunner {

    public static void main(String[] args) {

        WeatherStation weatherStation = new WeatherStation();

        WeatherObserver observer1 = new WeatherObserver();
        WeatherObserver observer2 = new WeatherObserver();
        WeatherObserver observer3 = new WeatherObserver();

        weatherStation.register(observer1);
        weatherStation.register(observer2);
        weatherStation.register(observer3);

        weatherStation.notifyObserver(26.0,50,20);

        weatherStation.unregister(observer1);

        weatherStation.notifyObserver(27,40,70);


    }

}
