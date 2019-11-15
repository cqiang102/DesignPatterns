package online.cccccc;

/**
 * @author 你是电脑
 * @create 2019/11/3 - 16:57
 * 静态内部类方式 懒加载 , JVM 线程安全
 */
public class Mgr03 {

    private Mgr03(){}
    private static class Mgr03Holder {
        private static final Mgr03 INSTANCE = new Mgr03();
    }
    public static Mgr03 getInstance() {
        return Mgr03Holder.INSTANCE;
    }
    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            new Thread(()->{
                // 同一个类的 不同对象，它的 hashCode 是不同的
                System.out.println(Mgr03.getInstance().hashCode());
            }).start();
        }
    }
}
