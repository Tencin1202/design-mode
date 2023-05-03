package 观察者模式.Observer;

import 观察者模式.Subject.Subject;

/**
 * @author ytc
 * @ClassName CurrentConditionsDisplay
 * @Description TODO
 * @date 2021/11/11
 */
//某个布告板观察者,其他观察者类似,也是实现两个接口
public class CurrentConditionsDisplay implements Observer,Display{

    //观察者保存的数据
    private float temperature;
    private float humidity;

    @Override
    public void display() {
        System.out.println("temperature : "+ temperature);
        System.out.println("humidity : "+ humidity);
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        this.temperature = temp;
        this.humidity = humidity;
        display();
    }
}
