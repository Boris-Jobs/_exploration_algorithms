/**
 * Our Mission: Understand the Universe
 * Created by Boris Jobs (FrameX Inc.) on 2024/4/14 14:20.
 *
 * The Law of the Broken Futon
 *
 * You might ask yourself why we spent so much time and space covering what seems like a triviality. This is probably especially true if you have prior Java experience. The reason is that it is very easy for a student to have a half-cocked understanding of this issue, allowing them to write code, but without true comprehension of what's going on.
 *
 * While this might be fine in the short term, in the long term, doing problems without full understanding may doom you to failure later down the line.
 */

public class _03_Basics {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        // Box and Pointer Notation
        Walrus a = new Walrus(1000, 8.3);

        // The Golden Rule of Equals (GRoE)
        Walrus b;
        b = a;
        b.weight = 5;
        System.out.println(a);
        System.out.println(b);
        System.out.println("a and b are reference objects, b copied a's address, so they changed together.");
        int x = 5;
        int y;
        y = x;
        x = 2;
        System.out.println("x is: " + x);
        System.out.println("y is: " + y);
        System.out.println("x and y are primitive types, y copied x's address, so they changed together. In Java, there are 8 primitive types: byte, short, int, long, float, double, boolean, and char.");

        // Parameter Passing
        doStuff(a, x);
        System.out.println(a);
        System.out.println(x);
        x = doStuff2(a, x);
        System.out.println(a);
        System.out.println(x);

        // Bits
        System.out.println("72 and H are stored as 01001000");
        char c = 'H';
        int d = c;
        System.out.println(c);
        System.out.println(d);

        // Instantiation of Arrays
        int[] li;


        li = new int[]{0, 1, 2, 95, 4};


    }

    public static double average(double a, double b) {
        return (a + b) / 2;
    }

    public static void doStuff(Walrus w, int x) {
        w.weight = w.weight - 100;
        x = x - 5;
    }

    public static int doStuff2(Walrus w, int x) {
        w.weight = w.weight - 100;
        x = x - 5;
        return x;
    }

    public static class Walrus{
        public int weight;
        public double tuskSize;

        public Walrus(int w, double ts) {
            weight = w;
            tuskSize = ts;
        }

        public String toString() {
            return String.format("weight: %d, tusk size: %.2f", weight, tuskSize);
        }
    }



}