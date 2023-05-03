package 设计模式入门.behaiver.FlyBehaviorImpl;

import 设计模式入门.behaiver.FlyBehavior;

/**
 * @author ytc
 * @ClassName FlyNoWay
 * @Description TODO
 * @date 2021/10/19
 */
public class FlyNoWay implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("I can't fly");
    }
}
