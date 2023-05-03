package 装饰者模式;

import 装饰者模式.baseBeverages.DarkRoast;
import 装饰者模式.baseBeverages.Espresso;
import 装饰者模式.baseBeverages.HouseBlend;
import 装饰者模式.condimentDecorators.Mocha;
import 装饰者模式.condimentDecorators.Soy;
import 装饰者模式.condimentDecorators.Whip;

/**
 * @author ytc
 * @ClassName Main
 * @Description TODO
 * @date 2022/04/22
 */
public class Main {
    public static void main(String[] args) {
        //一杯 Espresso不加任何调料
        Beverage beverage1 = new Espresso();
        System.out.println(beverage1.getDescription() + "  $" +beverage1.cost());

        //一杯 DarkRoast,加 2份 Mocha 和 1份 Whip
        //1.先弄一杯 DarkRoast
        Beverage beverage2 = new DarkRoast();
        //2.将这杯 DarkRoast用 1份 Mocha包装，得到一杯加 1份 Mocha的 DarkRoast
        beverage2 = new Mocha(beverage2);
        //3.将这杯 DarkRoast再用 1份 Mocha包装，得到一杯加 2份 Mocha的 DarkRoast
        beverage2 = new Mocha(beverage2);
        //4.最后将这杯 DarkRoast用 1份 Whip包装，得到一杯加 2份 Mocha和 1份 Whip的 DarkRoast
        beverage2 = new Whip(beverage2);
        System.out.println(beverage2.getDescription() + "  $" +beverage2.cost());

        //一杯 HouseBlend,加 1份 Soy、1份 Mocha和 1份 Whip
        //1.先弄一杯 HouseBlend
        Beverage beverage3 = new HouseBlend();
        //2.将这杯 HouseBlend用 1份 Soy包装，得到一杯加 1份 Soy的 HouseBlend
        beverage3 = new Soy(beverage3);
        //3.将这杯 HouseBlend再用 1份 Mocha包装，得到一杯加 1份 Soy和 1份 Mocha的 HouseBlend
        beverage3 = new Mocha(beverage3);
        //4.最后将这杯 HouseBlend用 1份 Whip包装，得到一杯加 1份 Soy、1份 Mocha和 1份 Whip的 DarkRoast
        beverage3 = new Whip(beverage3);
        System.out.println(beverage3.getDescription() + "  $" +beverage3.cost());
    }
}
