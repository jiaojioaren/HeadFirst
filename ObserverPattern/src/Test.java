import observer.WeatherData;
import subject.WeatherStation;

public class Test {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        WeatherStation weatherStation = new WeatherStation();

        // 注册观察者
        weatherData.registerObserver(weatherStation);

        // 设置新数据并自动通知观察者
        weatherData.update(1.1f,1.2f,1.3f);
    }
}
