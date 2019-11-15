package online.cccccc;

/**
 * @author 你是电脑
 * @create 2019/11/3 - 17:30
 */
public class Cat {
    int weight,height;

    public Cat(int weight, int height) {
        this.weight = weight;
        this.height = height;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "weight=" + weight +
                ", height=" + height +
                '}';
    }
}
