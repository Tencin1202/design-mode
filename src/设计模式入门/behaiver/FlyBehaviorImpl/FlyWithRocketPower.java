package 设计模式入门.behaiver.FlyBehaviorImpl;

import 设计模式入门.behaiver.FlyBehavior;

/**
 * @author ytc
 * @ClassName FlyWithRocketPower
 * @Description TODO
 * @date 2021/10/19
 */
public class FlyWithRocketPower implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("I can fly with rocket power");
    }
}
