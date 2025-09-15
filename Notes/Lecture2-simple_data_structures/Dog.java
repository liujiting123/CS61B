public class Dog {

    public static int size = 5;

    // Constructor
    public Dog(int s) {
        size = s;
    }
    public static void makeNoise() {
        if (size<10) {
            System.out.println("yip");
        } else if (size<30) {
            System.out.println("bark");
        } else {
            System.out.println("woof");
        }
    }

    public static void main(String[] args) {
        makeNoise();
    }
}
