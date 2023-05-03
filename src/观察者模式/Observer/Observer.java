package 观察者模式.Observer;

/**
 * @author ytc
 * @ClassName Observer
 * @Description TODO
 * @date 2021/11/11
 */
//观察者接口，抽象观察者的观察更新行为
public interface Observer {
    public void update(float temp,float humidity,float pressure);
}
