/**
 * Our Mission: Understand the Universe
 * Created by Boris Jobs (FrameX Inc.) on 2024/5/7 21:38.
 */

public class SLLists {

    /* This is a nested class. */
    /** Declaring a nested class as static means that methods inside the static class can not access any of the members of the enclosing class. In this case, it means that no method in IntNode would be able to access first, addFirst, or getFirst.
     * Put another way, if you examine the code here, you'll see that the IntNode class never uses the first variable of SLLists, nor any of SLLists's methods. As a result, we can use the static keyword, which means the IntNode class doesn't get a reference to its boss, saving us a small amount of memory.*/

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


    public SLLists(int x) {
        first = new IntNode(x, null);
        size = 1;
    }  // 这是一个constructor

    // Improvement #6a: The Empty List
    public SLLists() {
        first = null;
        size = 0;
    }  // 这也是一个constructor

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

    /** We need to first find the second to last item, and then set its next pointer to be null. Adding a secondToLast pointer will not help either, because then we'd need to find the third to last item in the list in order to make sure that secondToLast and last obey the appropriate invariants after removing the last item. */
    public void addLast(int x) {
        size += 1;

        if (first == null) {
            first = new IntNode(x, null);
            return;
        }  // This is for situations where first is null

        IntNode p = first;
        /* Advance p to the end of the list. */
        while (p.next != null) {
            p = p.next;
        }
        p.next = new IntNode(x, null);

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
        IntLists L1 = new IntLists(5, null);
        SLLists L2 = new SLLists(5);

        /* In SLLists it would be: */
        SLLists L = new SLLists(15);
        L.addFirst(10);
        L.addFirst(5);
        int x = L.getFirst();

        /* In IntLists it would be: */
        IntLists l = new IntLists(15, null);
        l = new IntLists(10, l);
        l = new IntLists(5, l);
        int X = l.first;

        SLLists testL = new SLLists(15);
        testL.addFirst(10);
        testL.first.next.next = testL.first.next;
        System.out.println(testL.first.next.next.item);
        System.out.println(L2.size());
        System.out.println(L2.size);  // 同一个class可以访问private变量，没毛病
        SLLists nullist = new SLLists();
        nullist.addLast(3);  // Cannot read field "next" because "p" is null
    }
}
