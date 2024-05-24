import static java.lang.System.*;

/**
 * Our Mission: Understand the Universe
 * Created by Boris Jobs (FrameX Inc.) on 2024/5/7 21:38.
 */

public class SLList {

    /* This is a nested class. */
    /** Declaring a nested class as static means that methods inside the static class can not access any of the members of the enclosing class. In this case, it means that no method in IntNode would be able to access first, addFirst, or getFirst.
     * Put another way, if you examine the code here, you'll see that the IntNode class never uses the first variable of SLList, nor any of SLList's methods. As a result, we can use the static keyword, which means the IntNode class doesn't get a reference to its boss, saving us a small amount of memory.*/

    // Improvement #1: Rebranding
    // Improvement #4: Nested Classes
    public static class IntNode {
        public int item;
        public IntNode next;
        public IntNode(int i, IntNode n) {
            item = i;
            next = n;
        }
    }

    // Improvement #2: Bureaucracy
    // Improvement #3: Public vs. Private
    private IntNode first;

    // Improvement #5: Caching (This practice of saving important data to speed up retrieval is sometimes known as caching.)
    private int size;


    public SLList(int x) {
        first = new IntNode(x, null);
        size = 1;
    }

    // Improvement #6a: The Empty List
    public SLList() {
        first = null;
        size = 0;
    }

    /** Adds an item to the front of the list. */
    public void addFirst(int x) {
        first = new IntNode(x, first);
        size += 1;
    }

    /** retrieves the front item from the list. */
    public int getFirst() {
        return first.item;
        // return this.first.item;
    }

    public void addLast(int x) {
        IntNode p = first;
        /* Advance p to the end of the list. */
        while (p.next != null) {
            p = p.next;
        }
        p.next = new IntNode(x, null);
        size += 1;
    }

    /** Returns the size of the list starting at IntNode p. */
    private static int size(IntNode p) {
        if (p.next == null) {
            return 1;
        }
        return 1 + size(p.next);
    }  // retrieve 1,000 个元素要2s的话，retrieve 1,000,000 个元素那就得2,000s，是线性增加的

    /* get the size recursively. */
    public int Size() {
        return size(first);
    }

    /* get the size by caching. */
    public int size() {
        return size;
    }


    public static void main(String[] args) {
        IntList L1 = new IntList(5, null);
        SLList L2 = new SLList(5);

        /* In SLList it would be: */
        SLList L = new SLList(15);
        L.addFirst(10);
        L.addFirst(5);
        int x = L.getFirst();

        /* In IntList it would be: */
        IntList l = new IntList(15, null);
        l = new IntList(10, l);
        l = new IntList(5, l);
        int X = l.first;

        SLList testL = new SLList(15);
        testL.addFirst(10);
        testL.first.next.next = testL.first.next;
        System.out.println(testL.first.next.next.item);
        System.out.println(L2.size());
        System.out.println(L2.size);  // 同一个class可以访问private变量，没毛病
    }
}
