package Collection;
import java.util.*;

public class SetExample {
    public static void main(String args[])
    {
        Set<Integer> a = new HashSet<Integer>();
        a.addAll(Arrays.asList(new Integer[] { 1, 3, 2, 4, 8, 9, 0 }));
        Set<Integer> b = new HashSet<Integer>();
        b.addAll(Arrays.asList(new Integer[] { 1, 3, 7, 5, 4, 0, 7, 5 }));
        // To find union
        Set<Integer> u = new HashSet<Integer>(a);
        u.addAll(b);
        System.out.print("Union of the two Set");
        System.out.println(u);

        // To find intersection
        Set<Integer> in = new HashSet<Integer>(a);
        in.retainAll(b);
        System.out.print("Intersection of the two Set");
        System.out.println(in);

        // To find the symmetric difference
        Set<Integer> diff = new HashSet<Integer>(a);
        diff.removeAll(b);
        System.out.print("Difference of the two Set");
        System.out.println(diff);
    }
}
