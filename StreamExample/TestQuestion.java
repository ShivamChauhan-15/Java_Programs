package StreamExample;

import java.util.Arrays;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class TestQuestion {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};

//         Create a stream from the array
        Arrays.stream(array).forEach(System.out::println);

        Character[] charArray={'a','b','c','d','e'};
        Arrays.stream(charArray).forEach(System.out::println);
        String s="Java Programming";
        Optional<Character> first = s.chars().mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet().stream()
                .filter(entry -> entry.getValue() > 1)
                .map(Map.Entry::getKey)
                .findFirst();
        if (first.isPresent()) {
            System.out.println("First repeated character: " + first.get());
        } else {
            System.out.println("No repeated characters found.");
        }

    }
}
