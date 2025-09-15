public class IntList {
    public int first;
    public IntList rest;

    public IntList(int f, IntList r) {
        first = f;
        rest = r;
    }
    public int size() {
        if (rest == null) {
            return 1;
        }
        return 1 + rest.size();
    }

    public int get(int i) {
        if (i == 0) {
            return first;
        }
        return rest.get(i - 1);
    }
    public static void main(String[] args) {
        IntList L = new IntList(5, null);
        L = new IntList(10, L);
        L = new IntList(15, L);
        System.out.println(L.first); // 15
        System.out.println(L.rest.first); // 10
        System.out.println(L.rest.rest.first); // 5
        System.out.println(L.rest.rest.rest); // null
    }
}


