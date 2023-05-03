package 装饰者模式.condimentDecorators;

import 装饰者模式.Beverage;
import 装饰者模式.CondimentDecorator;

/**
 * @author ytc
 * @ClassName Whip
 * @Description Whip类，附加材料的一种，作为可选的材料
 * @date 2022/04/22
 */
public class Whip extends CondimentDecorator {
    //这个变量用于保持被 Mocha 包装的材料
    private Beverage beverage;

    public Whip(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        //通过委托的方式，获取其包装的材料的 description，再加上自己的 description
        return beverage.getDescription() + ", Whip";
    }

    @Override
    public double cost() {
        //通过委托的方式，获取其包装的材料的 cost，再加上自己的 cost
        return beverage.cost() + 0.10;
    }
}
