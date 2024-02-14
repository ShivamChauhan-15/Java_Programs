package CollectorsClass;

import java.util.List;
import java.util.stream.Collectors;

public class MappingExample {
    public static void main(String[] args) {
        List<String> strings = List.of("apple", "banana", "orange");

        // Collect the lengths of strings after converting them to uppercase
        List<Integer> lengths = strings.stream()
                .collect(Collectors.mapping(
                        String::toUpperCase, // Mapper function
                        Collectors.mapping(
                                String::length, // Downstream collector
                                Collectors.toList() // Downstream collector
                        )
                ));

        System.out.println(lengths); // Output: [5, 6, 6]
    }
}
