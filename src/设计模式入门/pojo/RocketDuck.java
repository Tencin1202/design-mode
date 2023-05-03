package 设计模式入门.pojo;

import 设计模式入门.behaiver.FlyBehaviorImpl.FlyWithRocketPower;
import 设计模式入门.behaiver.QuackBehaviorImpl.MuteQuack;

/**
 * @author ytc
 * @ClassName RocketDuck
 * @Description TODO
 * @date 2021/10/19
 */
public class RocketDuck extends Duck{

    public RocketDuck() {
        flyBehavior=new FlyWithRocketPower();
        quackBehavior=new MuteQuack();
    }

    @Override
    public void display() {
        System.out.println("I' m RocketDuck");
        this.performFly();
        this.performQuack();
    }
}
