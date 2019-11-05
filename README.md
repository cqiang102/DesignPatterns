# DesignPatterns
## 了解23种设计模式
### 第一天
#### 单例模式
单例模式的可用写法，通常以下几种
- 饿汉式 
> 类加载到内存后就实例化一个单例 ， JVM 保证线程安全 
> 缺点： 不管是否用到，类装载时就完成实例化 (通常问题不大，写法简单)
- 懒汉式
> 为了保证线程安全，写法相对饿汉式麻烦，但是只有在使用时才会实例化
- 静态内部类
> 与饿汉式类似，都是由 JVM 保证线程安全，但静态内部类是延迟加载
- 枚举
> 枚举单例，解决线程同步，解决反序列化(不能通过反射拿到多个实例，枚举没有构造方法)
#### 策略模式
