public class DLList<T> {

    private static class Node<T> {
        T value;
        Node<T> next;
        Node<T> prev;

        Node(T value) {
            this.value = value;
            this.next = null;
            this.prev = null;
        }
    }
    
    private Node<T> head;
    private Node<T> tail;
    private int size;

    public DLList() {
        head = null;
        tail = null;
        size = 0;
    }

    public void addFirst(T value) {
        Node<T> newNode = new Node<>(value);
        if (size == 0) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
        size++;
    }

    public void addLast(T value) {
        Node<T> newNode = new Node<>(value);
        if (size == 0) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
        size++;
    }

    public T removeFirst() {
        if (size == 0) throw new IllegalStateException("List is empty");
        T value = head.value;
        head = head.next;
        if (head != null) head.prev = null;
        else tail = null; // List is now empty
        size--;
        return value;
    }

    public T removeLast() {
        if (size == 0) throw new IllegalStateException("List is empty");
        T value = tail.value;
        tail = tail.prev;
        if (tail != null) tail.next = null;
        else head = null; // List is now empty
        size--;
        return value;
    }

    public int size() {
        return size;
    }

    
}