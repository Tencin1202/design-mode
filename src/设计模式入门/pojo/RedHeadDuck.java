package 设计模式入门.pojo;

import 设计模式入门.behaiver.FlyBehaviorImpl.FlyWithWings;
import 设计模式入门.behaiver.QuackBehaviorImpl.Quack;

/**
 * @author ytc
 * @ClassName RedHeadDuck
 * @Description TODO
 * @date 2021/10/19
 */
public class RedHeadDuck extends Duck{

    public RedHeadDuck() {
        flyBehavior=new FlyWithWings();
        quackBehavior=new Quack();
    }

    @Override
    public void display() {
        System.out.println("I' m RedHeadDuck");
        this.performFly();
        this.performQuack();
    }
}
