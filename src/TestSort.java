/**
 * Our Mission: Understand the Universe
 * Created by borisσ (FrameX Inc.) on 2024/5/28 11:49.
 *
 * 'insert inline proposal' really impressed me!
 *
 * The Law of the Broken Futon
 *
 * You might ask yourself why we spent so much time and space covering what seems like a triviality. This is probably especially true if you have prior Java experience. The reason is that it is very easy for a student to have a half-cocked understanding of this issue, allowing them to write code, but without true comprehension of what's going on.
 *
 * While this might be fine in the short term, in the long term, doing problems without full understanding may doom you to failure later down the line.
 */

public class TestSort {
    /** Tests the sort method of the Sort class. */
    public static void testSort() {
        String[] input = {"i", "have", "an", "egg"};
        String[] expected = {"an", "egg", "have", "i"};
        Sort.sort(input);
        for (int i = 0; i < expected.length; i++) {
            if (!input[i].equals(expected[i])) {
                System.out.println("Mismatch in position " + i + ", expected " + expected[i] + ", but got: " + input[i] + ".");
            }
        }
    }

    public static void main(String[] args) {
        testSort();

    }
}
