package online.cccccc;

/**
 * @author 你是电脑
 * @create 2019/11/5 - 10:25
 */
public class CatMinComparable implements Comparable<Cat> {


    @Override
    public int compareTo(Cat o1, Cat o2) {
        if(o1.weight > o2.weight){
            return 1;
        }
        else if(o1.weight < o2.weight){
            return -1;
        }
        return 0;
    }
}
