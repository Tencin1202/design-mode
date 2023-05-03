package 设计模式入门.pojo;

import 设计模式入门.behaiver.FlyBehavior;
import 设计模式入门.behaiver.QuackBehavior;

/**
 * @author ytc
 * @ClassName Duck
 * @Description TODO
 * @date 2021/10/19
 */
//Duck抽象父类，里面引用两个接口类型变量，由 Duck的子类来组合引用变量的具体实现，面向接口编程
public abstract class Duck {
    //引用变量为接口类型，鸭子类只依赖接口，这样接口的 具体实现 就和鸭子类无关，做到和实现解耦
    protected FlyBehavior flyBehavior;
    protected QuackBehavior quackBehavior;

    public void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

    public void setQuackBehavior(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }

    public void performFly(){
        flyBehavior.fly();
    }

    public void performQuack(){
        quackBehavior.quack();
    }

    public abstract void display();
}
