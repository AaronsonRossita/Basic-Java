package observer;

public class WeatherObserver implements Observer {

    @Override
    public void update(double temp, int humidity, int pressure) {
        System.out.println("Temperature : " + temp + "" +
                "\nHumidity : " + humidity + "" +
                "\nPressure : " + pressure);
    }
}
