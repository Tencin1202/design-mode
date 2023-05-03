package 装饰者模式.baseBeverages;

import 装饰者模式.Beverage;

/**
 * @author ytc
 * @ClassName HouseBlend
 * @Description HouseBlend类，一种饮料基底，最底层的被包症者
 * @date 2022/04/22
 */
public class HouseBlend extends Beverage {

    public HouseBlend() {
        this.description = "House Blend Coffee";
    }

    @Override
    public double cost() {
        return 0.89;
    }
}
