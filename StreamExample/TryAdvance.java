package StreamExample;

import java.util.ArrayList;
import java.util.List;
import java.util.Spliterator;

public class TryAdvance {
    public static void main(String[] args) {
        // Create a list of integers
//        ArrayList<Integer> numbers = new ArrayList<>();
//        numbers.add(1);
//        numbers.add(2);
//        numbers.add(3);
//        numbers.add(4);
//        numbers.add(5);
//
//        // Obtain a Spliterator for the list
//        Spliterator<Integer> spliterator = numbers.spliterator();
//
//        // Process each element using tryAdvance() and a Consumer
//        System.out.println("Processing elements:");
//        while (spliterator.tryAdvance(System.out::println)) {
//            // Continue processing elements until tryAdvance() returns false
//        }

        //trySplit
        List<Integer> num = new ArrayList<>();
        for (int i = 1; i <= 10; i++) {
            num.add(i);
        }

        Spliterator<Integer> spliterator1 = num.spliterator();

        // Recursively split the Spliterator
        processSpliterator(spliterator1);
    }

    private static void processSpliterator(Spliterator<Integer> spliterator) {
        if (spliterator.estimateSize() <= 1) {
            // If the estimate size is 1 or less, we cannot split further
            System.out.println("Processing element: " + spliterator.tryAdvance(System.out::println));
        } else {
            // Try to split the Spliterator into two parts
            Spliterator<Integer> splitSpliterator = spliterator.trySplit();

            // Recursively process both parts
            processSpliterator(spliterator);
            processSpliterator(splitSpliterator);

        }
    }

}

