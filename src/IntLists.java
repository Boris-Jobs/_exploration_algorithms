/**
 * Our Mission: Understand the Universe
 * Created by Boris Jobs (FrameX Inc.) on 2024/4/15 0:54.
 */

public class IntLists {
    public int first;
    public IntLists rest;

    /** The constructor with signature public IntLists(int f, IntLists r) will be invoked anytime that we try to create a IntLists using the new keyword and a single integer parameter. For those of you coming from Python, the constructor is very similar to the __init__ method. */
    public IntLists(int f, IntLists r) {
        first = f;
        rest = r;
    }

    /** Return the size of the list using... recursion! */
    public int size() {
        if (rest == null) {
            return 1;
        }
        return 1 + this.rest.size();
    }

    /** return the size of the list using no recursion! */
    public int iterativeSize() {
        IntLists p = this;
        int sizeCount = 0;
        while (p != null) {
            sizeCount += 1;
            p = p.rest;
        }
        return sizeCount;
    }

    public int get(int addr) {
        IntLists p = this;
        while (addr != 0) {
            p = p.rest;
            addr -= 1;
        }
        return p.first;
    }

    public void addFirst(int newElement) {
        rest = new IntLists(first, rest); // 将原来的链表（可能为空）作为新链表的rest部分
        first = newElement; // 设置新元素为链表的头节点
        /* IntLists p = new IntLists(newElement, this);
         * this = p;
         * 这样的方法是错误的
         * */
    }

    /** The method we've written takes linear time, that is, if you have a list that is 1,000,000 items long, then getting the last item is going to take much longer than it would if we had a small list.*/

    public static void main(String[] args) {
        System.out.println("First way to make Linked List 5, 10, 15");
        IntLists L = new IntLists(5, null);
        L.rest = new IntLists(10, null);
        L.rest.rest = new IntLists(15, null);

        System.out.println("Second way to make Linked List 5, 10, 15");
        IntLists L2 = new IntLists(15, null);
        L2 = new IntLists(10, L2);
        L2 = new IntLists(5, L2);

        System.out.println(L2);
        L2.addFirst(3);
        L2.addFirst(100);
        System.out.println(L2);
        System.out.println(L2.first);
    }

}
