/* Java 里面的八种基本类型会在做“=”的时候进行类似于deepcopy的操作。具体有：
byte, short, int, long, float, double, char, boolean 

但是对于引用类型，做“=”的时候只是把引用（reference）copy了一份而已。指向的内存是同一块，所以会发生
赋值的传递  


*/
class ExampleClass {
    int x;
    String y;

    ExampleClass(int x, String y) {
        this.x = x;
        this.y = y;
    }
}

public class DataType {
    public static void main(String[] args) {
        int a = 3;
        int b = a; // 这里是把a的值copy了一份给b
        b = 4;
        System.out.println(a); // 3
        System.out.println(b); // 4

        int[] arr1 = {1, 2, 3};
        int[] arr2 = arr1; // 这里是把arr1的引用copy了一份给arr2
        arr2[0] = 100;
        System.out.println(arr1[0]); // 100
        System.out.println(arr2[0]); // 100

        ExampleClass example = new ExampleClass(42, "Hello");
        System.out.println(example); // 打印实例
    }
}
