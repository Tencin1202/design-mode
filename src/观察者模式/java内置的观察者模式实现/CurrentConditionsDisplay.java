package 观察者模式.java内置的观察者模式实现;

import java.util.Observable;
import java.util.Observer;

/**
 * @author ytc
 * @ClassName CurrentConditionsDisplay
 * @Description CurrentConditionsDisplay实现jdk提供的Observer接口
 * @date 2022/04/16
 */
public class CurrentConditionsDisplay implements Observer {

    //观察者保存的数据
    private float temperature;
    private float humidity;

    //持有主题对象，这样才能从主题对象中拉取数据.
    private Observable observable;

    //构造方法中设置主题对象，并订阅主题
    public CurrentConditionsDisplay(Observable observable) {
        this.observable = observable;
        //向主题注册观察者自己
        observable.addObserver(this);
    }

    //实现Observer接口的 update 方法
    //主题对象调用 notifyObservers() 方法时会，遍历每一个注册的观察者，调用其 update() 方法
    //主题中调用的 notifyObservers() 方法没有携带参数，采用的是 ”拉“ 的方式更新数据，观察者需要从主题中主动拉取数据
    @Override
    public void update(Observable o, Object arg) {
        if(o instanceof WeatherData){
            WeatherData weatherData = (WeatherData) o;
            //观察者主动拉取主题的数据
            this.humidity = weatherData.getHumidity();
            this.temperature = weatherData.getTemperature();
            display();
        }
    }

    private void display(){
        System.out.println("temperature : "+ temperature);
        System.out.println("humidity : "+ humidity);
    }
}
