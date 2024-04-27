package Practice;

import java.util.List;

class NumberProcessor {
    // Method to process a list of numbers
    void processNumbers(List<Number> numbers) {
        for (Number num : numbers) {
            System.out.println(num);
        }
    }
}

public class WildCard {
    public static void main(String[] args) {
        NumberProcessor processor = new NumberProcessor();

        // Create a list of integers
        List<Number> integerList = List.of(1, 2, 3, 4, 5);
        // Process the list of integers
        processor.processNumbers(integerList);

        // Create a list of doubles
        List<Double> doubleList = List.of(1.5, 2.5, 3.5, 4.5, 5.5);
        // Process the list of doubles
//        processor.processNumbers(doubleList);
    }
}
