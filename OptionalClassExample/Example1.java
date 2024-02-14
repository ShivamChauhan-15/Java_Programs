package OptionalClassExample;

import java.util.*;

public class Example1 {
    public static void main(String[] args)
    {
        // creating a string array
        String[] str = new String[5];

        // Setting value for 2nd index
        str[2] = "Geeks Classes are coming soon";

        // It returns an empty instance of Optional class
        Optional<String> empty = Optional.empty();
        System.out.println(empty);

        // It returns a non-empty Optional
        Optional<String> value = Optional.of(str[2]);
        System.out.println(value);

        //Create list of integer elements
        List<Integer> list= Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        Optional<List<Integer>> op=Optional.of(list);
//        Optional<Integer> i = op.flatMap(x -> x.stream().reduce((a, b) -> a + b));
//        System.out.println(i);

//        op.filter(li->li.stream().map(x->x*x))

    }
}
