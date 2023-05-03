package 观察者模式.Subject;

import 观察者模式.Observer.Observer;

import java.util.ArrayList;
import java.util.List;

/**
 * @author ytc
 * @ClassName WeatherData
 * @Description TODO
 * @date 2021/11/11
 */
public class WeatherData implements Subject{

    private float temperature;
    private float humidity;
    private float pressure;
    private List<Observer> observers;

    public WeatherData() {
        this.observers = new ArrayList<>();
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        int i = observers.indexOf(observer);  //查找不到返回 -1
        if(i>=0){
            observers.remove(i);
        }
    }

    @Override
    public void notifyObservers() {
        for (Observer observer: observers) {
            observer.update(temperature,humidity,pressure);
        }
    }

    public void setMeasurements(float temperature,float humidity,float pressure){
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        notifyObservers();
    }
}
