package StreamExample;

import java.util.Arrays;
import java.util.Collections;
import java.util.stream.Collectors;

public class ReverseString {
    public static void main(String[] args) {
        String s="Shivam Chauhan";

        //1st Approach
        String ans = s.chars()
                .mapToObj(c->String.valueOf((char)c)).reduce("",(t,c) -> c+t);
        System.out.println(ans);

        //2nd Approach
        String reversedString = s.chars()
                .mapToObj(c -> String.valueOf((char) c))
                .collect(Collectors.collectingAndThen( // Collect the characters into a String
                        Collectors.toList(),
                        list -> {
                            Collections.reverse(list); // Reverse the list
                            return list.stream().collect(Collectors.joining()); // Join the characters into a single String
                        }
                ));
        System.out.println(reversedString);

        //Word Reverse
        System.out.println("\nWord Reverse:");
        String s1="Shivam Chauhan";
        String reduce = Arrays.stream(s1.split("\\s+"))
                .reduce("", (c, t) -> t+" "+ c);
        System.out.println(reduce);

        System.out.println("\n2nd Approach Word Reverse:");
        String collect1 = Arrays.stream(s1.split("\\s+"))
                .collect(Collectors.collectingAndThen(Collectors.toList(),
                        list -> {
                            Collections.reverse(list);
                            return list.stream().collect(Collectors.joining(" "));
                        }));
        System.out.println(collect1);

        //Word Wise Reverse
        System.out.println("\nWordWise Reverse:");
        String collect = Arrays.stream(s1.split("\\s+"))  // Split the string into words
                .map(word -> new StringBuilder(word).reverse())   // Reverse each word
                .collect(Collectors.joining(" "));
        System.out.println(collect);


    }
}
