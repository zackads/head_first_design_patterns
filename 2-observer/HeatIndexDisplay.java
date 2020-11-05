public class HeatIndexDisplay implements DisplayElement, Observer {
    private float temperature;
    private float humidity;
    private Subject weatherData;
    
    public HeatIndexDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    public void update(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        display();
    }

    public float calculateHeatIndex() {
        return(this.temperature * this.humidity);
    }

    public void display() {
        System.out.println("Heat index is " + calculateHeatIndex());
    }
}