package StreamExample;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class TestQuestion {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};

        //Create a stream from the array
        Arrays.stream(array).forEach(System.out::println);

        Character[] charArray={'a','b','c','d','e'};
//        Arrays.stream(charArray).forEach(System.out::println);

        //Find first repeated character
        String s="Java Programming";
//        Optional<Character> first = s.chars().mapToObj(c -> (char) c)
//                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
//                .entrySet().stream()
//                .filter(entry -> entry.getValue() > 1)
//                .map(Map.Entry::getKey)
//                .findFirst();
//        if (first.isPresent()) {
//            System.out.println("\nFirst repeated character: " + first.get());
//        } else {
//            System.out.println("\nNo repeated characters found.");
//        }
        //2nd Approach
//        s.chars().mapToObj(c -> (char) c)
//                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting())).forEach((k,v)->{
//                    if(v>1) {
//                        System.out.println(k);
//                        System.exit(0);
//                    }
//                });
        //3rd Approach
        System.out.println("\nFirst repeated character:");
        Set<Integer> set=new LinkedHashSet<>();
        s.chars()
                .filter(i -> !set.add(i))
                .findFirst().ifPresent(x-> {
                    System.out.println((char) x);
                });
//        if(first1.isPresent())
//            System.out.println("\nFirst Repeated Character:"+(char)first1.getAsInt());

        //Find occurence of each character
        System.out.println("\nFind occurence of each character: ");
        s.chars()
                .mapToObj(c->(char)c)
                .filter(c->c!=' ')
                .collect(Collectors.groupingBy(c->c,TreeMap::new,Collectors.counting()))
                .forEach((k,v)->{
                    System.out.println(k+" : "+v);
                });

    }
}
