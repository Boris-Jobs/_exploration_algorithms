/**
 * Our Mission: Understand the Universe
 * Created by Boris Jobs (FrameX Inc.) on 2024/5/24 13:03.
 */

public class DLLists_Arrays {
    private IntNode sentinel;
    private int size;

    // Improvement #7: Looking Back
    private class IntNode {
        public IntNode prev;
        // public BleepBlorp item;
        public IntNode next;
    }

    public static void main(String[] args) {
        /** Since generics only work with reference types, we cannot put primitives like int or double inside of angle brackets, e.g. <int>. Instead, we use the reference version of the primitive type, which in the case of int case is Integer, e.g. */
        // DLLists<Integer> d1 = new DLList<>(5);

        // http://goo.gl/fCZ9Dr, array is a reference type, and System.arraycopy can truly copy things to new address.
        int[] x = new int[3];
        int[] y = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] z = {9, 8, 7, 6, 5, 4, 3, 2, 1};


        System.arraycopy(z, 0, x, 0, 3);
        for (int i = 0; i < x.length; i++) {
            System.out.print(x[i] + " ");
        }
        /**
         * int[] x = {9, 10, 11, 12, 13};
         * int[] y = new int[2];
         * int i = 0;
         * while (i < x.length) {
         *     y[i] = x[i];
         *     i += 1;
         * }
         *
         * Note that Java arrays only perform bounds checking at runtime. That is, the code above compiles just fine, but will crash at runtime.
         * */
    }
}
