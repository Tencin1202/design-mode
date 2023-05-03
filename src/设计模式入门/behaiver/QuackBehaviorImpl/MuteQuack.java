package 设计模式入门.behaiver.QuackBehaviorImpl;

import 设计模式入门.behaiver.QuackBehavior;

/**
 * @author ytc
 * @ClassName MuteQuack
 * @Description TODO
 * @date 2021/10/19
 */
public class MuteQuack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("I can't quack");
    }
}
