/**
 * Our Mission: Understand the Universe
 * Created by Boris Jobs (FrameX Inc.) on 2024/4/14 14:20.
 */

public class _03_Basics {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Walrus a = new Walrus(1000, 8.3);
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

        System.out.println("72 and H are stored as 01001000");
        char c = 'H';
        int d = c;
        System.out.println(c);
        System.out.println(d);
    }
    /**
     * Our Mission: Understand the Universe
     * Created by Boris Jobs (FrameX Inc.) on ${DATE} ${TIME}.
     */

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