import static java.lang.System.*;

/**
 * Our Mission: Understand the Universe
 * Created by Boris Jobs (FrameX Inc.) on 2024/5/7 21:38.
 */

public class SLList {
    private IntNode first;

    public SLList(int x) {
        first = new IntNode(x, null);
    }

    /** Adds an item to the front of the list. */
    public void addFirst(int x) {
        first = new IntNode(x, first);
    }

    /** retrieves the front item from the list. */
    public int getFirst() {
        return first.item;
        // return this.first.item;
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
    }
}
