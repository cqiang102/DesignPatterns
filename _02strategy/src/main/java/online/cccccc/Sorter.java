package online.cccccc;

/**
 * @author 你是电脑
 * @create 2019/11/3 - 17:19
 */
public class Sorter<T> {

    public  void sort(T[] a, Comparable<T> comparable) {
        for(int i=0;i<a.length;i++){
            int minPos = i;
            for(int j = i+1;j<a.length;j++){
                minPos = comparable.compareTo(a[j],a[minPos]) == -1? j : minPos;
            }
            swap(a,i,minPos);
        }
    }
     void swap(T[] a,int i,int j){
        T temp = a[i];
        a[i]=a[j];
        a[j]=temp;
    }
}
