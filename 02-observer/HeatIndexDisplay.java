import java.util.Observable;
import java.util.Observer;

public class HeatIndexDisplay implements Observer, DisplayElement {
    Observable observable;
    private float temperature;
    private float humidity;
    
    public HeatIndexDisplay(Observable observable) {
        this.observable = observable;
        observable.addObserver(this);
    }

    public void update(Observable obs, Object arg) {
        if (obs instanceof WeatherData) {
            WeatherData weatherData = (WeatherData)obs;
            this.temperature = weatherData.getTemperature();
            this.humidity = weatherData.getHumidity();
            display();
        }
    }

    public float calculateHeatIndex() {
        return(this.temperature * this.humidity);
    }

    public void display() {
        System.out.println("Heat index is " + calculateHeatIndex());
    }
}