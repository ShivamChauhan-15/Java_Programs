package CompanyAssignment;

import java.util.Objects;
import java.util.function.Function;

@FunctionalInterface
interface TriFunction<T, U, V, R> {
    R apply(T t, U u, V v);

    default <W> TriFunction<T, U, V, W> andThen(Function<? super R, ? extends W> after) {
        Objects.requireNonNull(after);
        return (T t, U u, V v) -> after.apply(apply(t, u, v));
    }
}

public class FunctionalInterfaceTask {
    public static void main(String[] args) {
        TriFunction<Integer, Double, String, String> concatAndFormat =
                (i, d, s) -> {
                    if (s == null || s.isEmpty())
                        throw new IllegalArgumentException("Invalid input");
                    return "Result: " + i + String.format("%.2f", d) + " " + s;
                };


        // Applying the TriFunction
        System.out.println(concatAndFormat.apply(42, 3.14159, "Shivam"));
        TriFunction<Integer,Double,String,String> add=concatAndFormat.andThen(s->s.toUpperCase());
        System.out.println(add.apply(2,3.4,"Shivam"));
    }
}
