package CollectorsClass;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class GroupingByExample {
    public static void main(String[] args) {
        Stream<String> words = Stream.of("dog","cat","apple", "banana","cow","annanas", "bat", "ball");

        // Group words by their first letter
        Map<Character,List<String>> groups = words.collect(Collectors.groupingBy(s -> s.charAt(0)));

        // Print the resulting groups
        groups.forEach((key, value) -> System.out.println(key + ": " + value));

//
        //2nd groupingBy (downstream collector)
        System.out.println("2nd groupingBy (downstream collector): ");
        Stream<String> w = Stream.of("dog","cat","apple", "banana","cow","annanas", "bat", "ball");
        Map<Character,Long> count=w.collect(Collectors.groupingBy(
                x->x.charAt(0),           // classifier function
                Collectors.counting()     // downstream collector (counts occurrences)
        ));
        count.forEach((k,v)-> System.out.println(k+" : "+ v));


        //3rd groupingBy (downstream collector with supplier )
        System.out.println("3rd groupingBy (downstream collector with supplier: )");
        Stream<String> w2 = Stream.of("dog","cat","apple", "banana","cow","annanas", "bat", "ball");
        TreeMap<Character,Long> sorted=w2.collect(Collectors.groupingBy(
                x->x.charAt(0),           // classifier function
                TreeMap::new,
                Collectors.counting()     // downstream collector (counts occurrences)
        ));
        sorted.forEach((k,v)-> System.out.println(k+" : "+ v));



    }
}
