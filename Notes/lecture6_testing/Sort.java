
import java.util.Arrays;
class Pair {
    String value;
    int index;

    Pair(String value, int index) {
        this.value = value;
        this.index = index;
    }
}

public class Sort {
    public static void sort(String[] x) {
        for (int i = 0;i<x.length;i++) {
            String[] new_arr = Arrays.copyOfRange(x,i,x.length);
            Pair result = findSmallest(new_arr);
            String smallest = result.value;
            int number = result.index;
            swap(x,i,i+number);
        }
    }

    public static Pair findSmallest(String [] x) {
        String smallest = x[0];
        int number = 0;

        for (int i=0; i < x.length;i+=1) {
            if (x[i].compareTo(smallest) < 0) {
                smallest = x[i];
                number = i;
            }
        }
        return new Pair(smallest,number) ;
    }

    public static void  swap(String[] x,int a, int b) {
        String tem = x[b];
        x[b] = x[a];
        x[a] = tem;
    }
}