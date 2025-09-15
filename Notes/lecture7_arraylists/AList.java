package lecture7_arraylists;
public class AList<T> {
    private T[] items;
    private int size;
    private static final int INITIAL_CAPACITY = 10;

    @SuppressWarnings("unchecked")
    public AList() {
        // Java 不允许直接 new T[]，所以要用 Object[] 然后强转
        items = (T[]) new Object[INITIAL_CAPACITY];
        size = 0;
    }

    public void addLast(T x) {
        if (size == items.length) {
            resize(items.length * 2);
        }
        items[size] = x;
        size++;
    }

    public T getLast() {
        if (size == 0) {
            throw new IllegalStateException("List is empty");
        }
        return items[size - 1];
    }

    public T removeLast() {
        if (size == 0) {
            throw new IllegalStateException("List is empty");
        }
        T lastItem = items[size - 1];
        items[size - 1] = null; // 避免 loitering
        size--;
        if (size > 0 && size == items.length / 4) {
            resize(items.length / 2);
        }
        return lastItem;
    }

    public int size() {
        return size;
    }

    @SuppressWarnings("unchecked")
    private void resize(int capacity) {
        T[] newItems = (T[]) new Object[capacity];
        System.arraycopy(items, 0, newItems, 0, size);
        items = newItems;
    }

    public T get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index out of bounds");
        }
        return items[index];
    }

    public static void main(String[] args) {
        AList<Integer> list = new AList<>();
        for (int i = 0; i < 15; i++) {
            list.addLast(i);
        }
        System.out.println("Size after additions: " + list.size());
        System.out.println("Last item: " + list.getLast());
    }
}

