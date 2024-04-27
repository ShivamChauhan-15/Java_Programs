package CollectorsClass;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class ReducingExample {
    public static void main(String[] args) {
        List<Integer> num = List.of(1, 2, 3, 4, 5);

        // Perform reduction operation to find the sum of numbers
        Optional<Integer> sum=num.stream()
                .collect(Collectors.reducing((x,y)->x+y));

        // Print the result
        sum.ifPresent(System.out::println); // Output: 15

        //2nd with Identity
        System.out.println("with identity");
        List<Integer> num2 = Arrays.asList(1, 2, 3, 4, 5);
        Integer sum2=num2.stream()
                .collect(Collectors.reducing(5,(x,y)->x+y));
        System.out.println(sum2);

        //3rd with mapper
        System.out.println("with mapper");
        List<Integer> num3 = Arrays.asList(1, 2, 3);
        Integer sum3=num3.stream()
                .collect(Collectors.reducing(
                        5,
                        x->x*x,
                        Integer::sum
                ));
        System.out.println(sum3);


    }
}
