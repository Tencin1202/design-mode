package 设计模式入门.pojo;

import 设计模式入门.behaiver.FlyBehaviorImpl.FlyNoWay;
import 设计模式入门.behaiver.QuackBehaviorImpl.Quack;

/**
 * @author ytc
 * @ClassName ModelDuck
 * @Description TODO
 * @date 2021/10/19
 */
public class ModelDuck extends Duck{

    public ModelDuck() {
        flyBehavior=new FlyNoWay();
        quackBehavior=new Quack();
    }

    @Override
    public void display() {
        System.out.println("I' m ModelDuck");
        this.performFly();
        this.performQuack();
    }
}
