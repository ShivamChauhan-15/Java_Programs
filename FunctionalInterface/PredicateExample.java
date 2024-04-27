package FunctionalInterface;

import java.util.*;
import java.util.function.BiFunction;
import java.util.function.*;

import static java.util.function.Predicate.not;

public class PredicateExample {
    public static void main(String[] args) {
        Predicate<Integer> p1 = x -> x % 2 == 0;
        System.out.println(p1.test(4));
        Predicate<String> p2 = s -> s.startsWith("S");
        Predicate<String> p3 = s -> s.length() == 6;

//        //and
        Predicate<String> p4 = p2.and(p3);
        System.out.println(p4.test("Shivam"));

        //or
        Predicate<String> p5 = s -> s.toLowerCase().endsWith("s");
        Predicate<String> p6 = p2.or(p5);
        System.out.println(p6.test("Shivam"));

        //isEqual
        Predicate<String> p7= Predicate.isEqual("Rajput");
        System.out.println(p7.test("Shivam"));

        //negate
        System.out.println(p7.negate().test("Shivam"));

        //not
        Predicate<String> p8=not(p7);
        System.out.println(p8.test("Shivam"));

        //biPredicate
        BiPredicate<Integer, Integer> sumGreaterThan100 = (a, b) -> a + b > 100;
        System.out.println(sumGreaterThan100.test(80,30));
    }


}
