package online.cccccc;

import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.Properties;

/**
 * @author 你是电脑
 * @create 2019/11/3 - 17:18
 */
public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        Properties properties = new Properties();
        InputStream resource = Main.class.getClassLoader().getResourceAsStream("comparable.properties");

        properties.load(resource);

        Cat[] cats = {new Cat(3,3),new Cat(1,1),new Cat(5,5)};

        Sorter<Cat> sorterCat = new Sorter<>();

        String comparableClass = properties.getProperty("comparable");

        Comparable comparable = (Comparable) Class.forName(comparableClass).getDeclaredConstructor().newInstance();

        sorterCat.sort(cats,comparable);

        System.out.println(Arrays.toString(cats));
    }
}
