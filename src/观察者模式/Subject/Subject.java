package 观察者模式.Subject;

import 观察者模式.Observer.Observer;

/**
 * @author ytc
 * @ClassName Subject
 * @Description TODO
 * @date 2021/11/11
 */
//主题接口，约束主题的行为，可以帮助观察者 订阅 /退订主题，并通知观察者更新数据
public interface Subject {
    //帮助观察者订阅主题
    void registerObserver(Observer observer);
    //帮助观察者退订主题
    void removeObserver(Observer observer);
    //通知所有观察者更新数据
    void notifyObservers();
}
