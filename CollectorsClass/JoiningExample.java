package CollectorsClass;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class JoiningExample {
    public static void main(String[] args) {
        List<Character> s= Arrays.asList('S','h','i','v','a','m');
        System.out.println(s.stream().map(String::valueOf).collect(Collectors.joining()));

        //2nd with delimeter
        System.out.println("with delimeter: ");
        List<String>s1=Arrays.asList("I","am","happy");
        System.out.println(s1.stream().collect(Collectors.joining(",")));

        //3rd with prefix, suffix
        System.out.println("with prefix, suffix");
        System.out.println(s1.stream().collect(Collectors.joining(",","[","]")));

    }
}
