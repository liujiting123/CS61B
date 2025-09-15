import java.util.ArrayList;
import java.util.List;
import java.util.LinkedList;

public class ListDemo {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("c");
        System.out.println(list);
        String x = list.get(1);
        System.out.println(x);
        list.set(1,"abdcaohoi");
        System.out.println(list);
    }
}
