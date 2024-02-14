package StreamExample;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class ParallelStreamExample {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4);
        list.parallelStream().forEach(number ->
                System.out.println(number + " " + Thread.currentThread().getName())
        );
        System.out.println("\n2nd Example");
        List<Integer> l2=Arrays.asList(45,2,67,5,4,3,46,24,68,70);
        l2.parallelStream().sorted().forEachOrdered(System.out::println);
//        Integer reduce = list.parallelStream().reduce(5, Integer::sum);  //it adds 5 to every worker thread and give 30 result
//        Integer reduce = list.parallelStream().reduce(Integer::sum)+5;
//        System.out.println(reduce);


        //3rd Example
        System.out.println("\n3rd Example");
        List<Integer> l3=Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        Integer i = l3.parallelStream()
                .filter(x -> x % 2 == 0)
                .peek(number ->
                        System.out.println(number + " " + Thread.currentThread().getName()))

                .map(x -> x * x)
                .peek(number ->
                        System.out.println(number + " " + Thread.currentThread().getName()))
                .reduce((x, y) -> {
                    System.out.println("Reducing x=" + x + " y=" + y);
                    return x + y;
                }).orElse(-1);
        System.out.println("Sum is :"+i);
    }
}
