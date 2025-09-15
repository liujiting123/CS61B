public class SLList {

    private class IntNode {
        public int item;
        public IntNode next;
        

        public IntNode(int i, IntNode n) {
            item = i;
            next = n;
        }

    }
    private int size;
    private IntNode centinel;
    public SLList(int x) {
        centinel = new IntNode(1258, null);
        centinel.next = new IntNode(x, null);
        size = 1;
    }

    public SLList() {
        centinel = new IntNode(1258, null);
        size = 0;
        
    }

    public void addFirst(int x) {
        size++;
        centinel.next = new IntNode(x, centinel.next);
    }

    public int getFirst() {
        return centinel.next.item;
    }

    public void addLast(int x) {
        size++;
        IntNode p = centinel;
        while (p.next != null) {
            p = p.next;
        }
        p.next = new IntNode(x, null);
    }

    public int size() {
        return size;
    }

    

    public static void main(String[] args) {
        SLList L = new SLList(15);
        L.addFirst(10);
        L.addFirst(5);
        System.out.println(L);

    }
}
