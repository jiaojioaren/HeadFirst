package subject;

import display.Display;
import observer.Subject;
import observer.WeatherData;

public class WeatherStation implements Observer , Display {
    private float temperature;
    private float humidity;
    private float pressure;

    @Override
    public void display() {
        System.out.println("Weather Station: 温度 = " + temperature + "℃, 湿度 = " + humidity + "%, 气压 = " + pressure);
    }

    @Override
    public void update(Subject subject) {
        if (subject instanceof WeatherData weatherData) {
            this.temperature = weatherData.getTemperature();
            this.humidity = weatherData.getHumidity();
            this.pressure = weatherData.getPressure();
            display();
        }
    }
}
