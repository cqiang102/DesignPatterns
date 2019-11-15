package online.cccccc;

/**
 * @author 你是电脑
 * @create 2019/11/3 - 16:16
 * 饿汉式
 * 类加载到内存后就实例化一个单例 ， JVM 保证线程安全 , 因为 JVM 类加载机制
 * 缺点： 不管是否用到，类装载时就完成实例化
 */
public class Mgr01 {
    private static final Mgr01 INSTANCE = new Mgr01();
    private Mgr01(){}
    private static Mgr01 getInstance(){return INSTANCE;}
    public void m(){
        System.out.println("m");
    }

    public static void main(String[] args) {
        Mgr01 m1 = Mgr01.getInstance();
        Mgr01 m2 = Mgr01.getInstance();
        System.out.println(m1 == m2);
    }

}
