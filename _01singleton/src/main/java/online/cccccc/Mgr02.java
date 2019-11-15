package online.cccccc;

/**
 * @author 你是电脑
 * @create 2019/11/3 - 16:28
 * 懒汉式 ， 线程不安全
 */
public class Mgr02 {
    private volatile static Mgr02 INSTANCE;
    private Mgr02(){};
    /**
     * 可以使用线程锁的方式（synchronized 修饰此方法）解决，但是性能会下降
     * @return
     */
    public static  Mgr02 getInstance(){
        if (INSTANCE == null) {
            // 或者在此处加锁,解决线程安全问题
            synchronized (Mgr02.class){
                if (INSTANCE == null ){
                    INSTANCE = new Mgr02();
                }
            }
        }
        return INSTANCE;
    }
    public void m(){
        System.out.println("m");
    }

    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            new Thread(()->{
                // 同一个类的 不同对象，它的 hashCode 是不同的
                System.out.println(Mgr02.getInstance().hashCode());
            }).start();
        }
    }
}
