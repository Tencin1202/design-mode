package 设计模式入门.pojo;

import 设计模式入门.behaiver.FlyBehaviorImpl.FlyWithWings;
import 设计模式入门.behaiver.QuackBehaviorImpl.Quack;

/**
 * @author ytc
 * @ClassName MallardDuck
 * @Description TODO
 * @date 2021/10/19
 */
//Duck的子类，可以根据自己的特性，在构造函数中 自由组合 接口的实现类实例
public class MallardDuck extends Duck {

    public MallardDuck() {
        flyBehavior=new FlyWithWings();
        quackBehavior=new Quack();
    }

    @Override
    public void display() {
        System.out.println("I' m MallardDuck");
        this.performFly();
        this.performQuack();
    }
}
