package online.cccccc.real;

import online.cccccc.base.AbstractFactory;
import online.cccccc.base.AbstractArms;
import online.cccccc.base.AbstractFood;
import online.cccccc.base.AbstractMoveable;

/**
 * @author 你是电脑
 * @create 2019/11/15 - 22:32
 */
public class RealFactory extends AbstractFactory {
    @Override
    public AbstractArms creatArms() {
        return new Keyboard();
    }

    @Override
    public AbstractFood creatFood() {
        return new Rice();
    }

    @Override
    public AbstractMoveable creatMoveable() {
        return new Car();
    }
}
