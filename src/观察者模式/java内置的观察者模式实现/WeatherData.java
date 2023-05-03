package 观察者模式.java内置的观察者模式实现;

import 观察者模式.Observer.Observer;

import java.util.List;
import java.util.Observable;

/**
 * @author ytc
 * @ClassName WeatherData
 * @Description 主题继承jdk提供的Observable
 * @date 2022/04/15
 */
public class WeatherData extends Observable{

    private float temperature;
    private float humidity;
    private float pressure;

    //不需要自定义观察者列表，父类已有
    //private List<Observer> observers;

    //构造方法为空
    public WeatherData() { }

    /*
    * 订阅、退订、通知方法不用自己实现，父类已实现
    * */

    //    @Override
    //    public void registerObserver(Observer observer) {
    //        observers.add(observer);
    //    }
    //
    //    @Override
    //    public void removeObserver(Observer observer) {
    //        int i = observers.indexOf(observer);  //查找不到返回 -1
    //        if(i>=0){
    //            observers.remove(i);
    //        }
    //    }
    //
    //    @Override
    //    public void notifyObservers() {
    //        for (Observer observer: observers) {
    //            observer.update(temperature,humidity,pressure);
    //        }
    //    }

    public void setMeasurements(float temperature,float humidity,float pressure){
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }

    public void measurementsChanged(){
        //父类已实现的 setChanged()方法
        setChanged();
        //父类已实现的通知方法，通知完会将 Changed 改为 false
        //该方法不携带参数时，观察者必须主动向主题拉取数据，用于更新
        //该方法携带参数时，主题向观察者推送最新的数据，用于更新
        notifyObservers();
    }

    //getter，用于给观察者拉取数据
    public float getTemperature() {
        return temperature;
    }

    public float getHumidity() {
        return humidity;
    }

    public float getPressure() {
        return pressure;
    }
}
