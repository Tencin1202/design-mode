package 观察者模式;

import 观察者模式.Observer.CurrentConditionsDisplay;
import 观察者模式.Subject.WeatherData;

/**
 * @author ytc
 * @ClassName Main
 * @Description TODO
 * @date 2021/11/11
 */
public class Main {
    public static void main(String[] args) {

        WeatherData weatherData = new WeatherData();

        CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay();

        weatherData.registerObserver(currentConditionsDisplay);

        weatherData.setMeasurements(27.3f, 65, 30.6f);
        weatherData.setMeasurements(25.2f, 50, 29.1f);
    }
}
