package 装饰者模式.baseBeverages;

import 装饰者模式.Beverage;

/**
 * @author ytc
 * @ClassName Espresso
 * @Description Espresso类,一种饮料基底，最底层的被包装者
 * @date 2022/04/22
 */
public class Espresso extends Beverage {

    //构造方法给继承的 description 赋值
    public Espresso() {
        this.description = "Espresso";
    }

    @Override
    public double cost() {
        return 1.99;
    }
}
