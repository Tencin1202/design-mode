package 观察者模式.java内置的观察者模式实现;


/**
 * @author ytc
 * @ClassName Main
 * @Description 测试观察者模式JDK实现
 * @date 2022/04/16
 */
public class Main {
    public static void main(String[] args) {

        WeatherData weatherData = new WeatherData();

        CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay(weatherData);

        weatherData.setMeasurements(27.3f, 65, 30.6f);
        weatherData.setMeasurements(25.2f, 50, 29.1f);
    }
}
