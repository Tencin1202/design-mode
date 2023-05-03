package 装饰者模式;

/**
 * @author ytc
 * @ClassName Beverage
 * @Description 材料抽象父类
 * @date 2022/04/22
 */
public abstract class Beverage {

    protected String description = "Unknown Beverage";

    public String getDescription(){
        return this.description;
    }

    //抽象方法，由子类实现
    public abstract double cost();
}
