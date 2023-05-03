package 装饰者模式;

import 装饰者模式.Beverage;

/**
 * @author ytc
 * @ClassName CondimentDecorator
 * @Description 抽象的CondimentDecorator类为可选的附加材料,也是材料的子类
 * @date 2022/04/22
 */
public abstract class CondimentDecorator extends Beverage {

    //子类可以声明与父类同名的抽象方法
    public abstract String getDescription();
}
