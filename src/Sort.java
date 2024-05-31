/**
 * Our Mission: Understand the Universe
 * Created by borisσ (FrameX Inc.) on 2024/5/28 12:38.
 *
 * The Law of the Broken Futon
 *
 * You might ask yourself why we spent so much time and space covering what seems like a triviality. This is probably especially true if you have prior Java experience. The reason is that it is very easy for a student to have a half-cocked understanding of this issue, allowing them to write code, but without true comprehension of what's going on.
 *
 * While this might be fine in the short term, in the long term, doing problems without full understanding may doom you to failure later down the line.
 */

import java.util.Arrays;
import java.util.Comparator;

public class Sort {
    public static void sort(String[] x) {
        sort(x, 0);
    }

    private static void sort(String[] x, int start) {
        if (start == x.length) {
            return;
        }
        int smallest = findSmallest2(x, start);
        swap(x, start, smallest);
        sort(x, start+1);
    }

    public static String findSmallest1(String[] x) {
        return Arrays.stream(x)
                .min(Comparator.comparing(String::toString))
                .orElse(null);
    }


    public static int findSmallest2(String[] x, int start) {
        int smallest = start;
        for (int i = start; i < x.length; i += 1) {
            int cmp = x[i].compareTo(x[smallest]);
            if (cmp < 0) {
                smallest = i;
            }
        }
        return smallest;
    }


    public static void swap(String[] x, int a, int b) {
        String tmp = x[a];
        x[a] = x[b];
        x[b] = tmp;
    }


    public static void main(String[] args) {
        String[] x = {"hello", "world", "cz"};
        System.out.println(findSmallest1(x));
        System.out.println(x[1].compareTo(x[2]));
    }
}
