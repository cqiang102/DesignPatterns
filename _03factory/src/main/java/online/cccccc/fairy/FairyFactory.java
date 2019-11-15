package online.cccccc.fairy;

import online.cccccc.base.AbstractArms;
import online.cccccc.base.AbstractFactory;
import online.cccccc.base.AbstractFood;
import online.cccccc.base.AbstractMoveable;

/**
 * @author 你是电脑
 * @create 2019/11/15 - 22:52
 */
public class FairyFactory extends AbstractFactory {
    @Override
    public AbstractArms creatArms() {
        return new Spell();
    }

    @Override
    public AbstractFood creatFood() {
        return new Reiki();
    }

    @Override
    public AbstractMoveable creatMoveable() {
        return new Sword();
    }
}
