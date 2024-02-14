// Java program to demonstrate
// unmodifiableCollection() method
// for <Character> Value

import java.util.*;

public class UnmodifiableCollectionExample{
    public static void main(String[] argv) throws Exception
    {
        try {

            // creating object of ArrayList<Character>
            List<Character> list = new ArrayList<Character>();

            // populate the list
            list.add('X');
            list.add('Y');

            // printing the list
            System.out.println("Initial list: " + list);

            // getting unmodifiable list
            // using unmodifiableCollection() method
            Collection<Character> immutablelist = Collections.unmodifiableCollection(list);
//            immutablelist.add('Z');
            list.add('Z');
            System.out.println("Unmodifiable: "+immutablelist);
        }
        catch (UnsupportedOperationException e) {

            System.out.println("Exception thrown : " + e);
        }
    }
}
