import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Fruit> list = new ArrayList<>();
        Apple apple =new Apple();
        Orange orange = new Orange();
        Orange orange1 = new Orange();
        Apple apple1 = new Apple();
        Apple apple2 = new Apple();

        list.add(apple);
        list.add(orange);
        list.add(orange1);
        list.add(apple1);
        list.add(apple2);

        DupeFinder df = new DupeFinder(list);
        System.out.println(df.getDupes());


    }
}