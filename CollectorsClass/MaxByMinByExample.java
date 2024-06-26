package CollectorsClass;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class MaxByMinByExample {
    public static void main(String[] args) {
        List<Integer> li= Arrays.asList(1,4,8,3,9);
        //1.maxBy(Comprator c)
        Optional<Integer> collectMax = li.stream().collect(Collectors.maxBy((n1,n2)->n1-n2));
        collectMax.ifPresent(System.out::println);
        //2.minBy(Comprator c)
        Optional<Integer> collectMin = li.stream().collect(Collectors.minBy((n1, n2) -> n1 - n2));
        collectMin.ifPresent(System.out::println);

    }
}