package 装饰者模式.baseBeverages;

import 装饰者模式.Beverage;

/**
 * @author ytc
 * @ClassName DarkRoast
 * @Description DarkRoast类，一种饮料基底，最底层的被包装者
 * @date 2022/04/22
 */
public class DarkRoast extends Beverage {

    //构造方法给继承的 description 赋值
    public DarkRoast() {
        this.description = "Dark Roast Coffee";
    }

    @Override
    public double cost() {
        return 0.99;
    }
}
