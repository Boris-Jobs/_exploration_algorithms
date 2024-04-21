/**
 * Our Mission: Understand the Universe
 * Created by Boris Jobs (FrameX Inc.) on 2024/4/15 0:54.
 */

public class IntList {
    public int first;
    public IntList rest;
    public IntList(int f, IntList r) {
        first = f;
        rest = r;
    }

    public static void main(String[] args){
        IntList L = new IntList(5, null);
        L.rest = new IntList(10, null);
    }

    
}
