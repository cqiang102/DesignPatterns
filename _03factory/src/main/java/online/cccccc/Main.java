package online.cccccc;

import online.cccccc.base.AbstractArms;
import online.cccccc.base.AbstractFactory;
import online.cccccc.base.AbstractFood;
import online.cccccc.base.AbstractMoveable;
import online.cccccc.fairy.FairyFactory;
import online.cccccc.real.RealFactory;

/**
 * @author 你是电脑
 * @create 2019/11/15 - 22:34
 */
public class Main {
    public static void main(String[] args) {

//        AbstractFactory factory = new RealFactory();
        AbstractFactory factory = new FairyFactory();

        AbstractArms abstractArms = factory.creatArms();
        abstractArms.me();
        AbstractFood abstractFood = factory.creatFood();
        abstractFood.me();
        AbstractMoveable abstractMoveable = factory.creatMoveable();
        abstractMoveable.me();
    }
}
