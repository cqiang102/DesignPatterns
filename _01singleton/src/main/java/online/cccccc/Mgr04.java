package online.cccccc;

/**
 * @author 你是电脑
 * @create 2019/11/3 - 17:03
 * 枚举单例，解决线程同步，解决反序列化
 */
public enum  Mgr04 {
    //单例
    INSTANCE;
    public void m(){
        System.out.println("m");
    }
    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            new Thread(()->{
                // 同一个类的 不同对象，它的 hashCode 是不同的
                System.out.println(Mgr04.INSTANCE.hashCode());
            }).start();
        }
    }
}
