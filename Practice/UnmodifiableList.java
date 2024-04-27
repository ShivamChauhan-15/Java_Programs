package Practice;

import java.util.*;

public class UnmodifiableList {
    public static void main(String[] args) {
        List<Integer> originalList = new ArrayList<>();
        originalList.add(1);
        originalList.add(2);
//        originalList.add(null); null can be add here but not in list.of and copyOf

        // Create an unmodifiable view of the original list
        List<Integer> unmodifiableList = Collections.unmodifiableList(originalList);

        // Attempting to modify the unmodifiable list will result in UnsupportedOperationException
        // unmodifiableList.add(3); // This line would throw an exception

        // However, changes to the original list are reflected in the unmodifiable list
        System.out.println("Original List: "+originalList);
        originalList.add(3);
//        unmodifiableList.set(2,5);
        System.out.println("Original List After adding 3: "+originalList);
        System.out.println("Unmodifiable list: " + unmodifiableList);

        List<Integer> immutableList=List.of(1,2,3,4,5);
        List<Integer> immList=List.copyOf(originalList);
//        immutableList.add(4);    //throw UnsupportedOperationException
        System.out.println("Immutable List:"+immutableList);
//        immList.add(6);          //throw UnsupportedOperationException
        originalList.add(10);
        System.out.println("Original List: "+originalList);
        System.out.println("Immutable List by copyOf method: "+immList);

    }
}
