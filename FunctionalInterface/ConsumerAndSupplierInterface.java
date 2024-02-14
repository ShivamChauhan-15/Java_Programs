package FunctionalInterface;

import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class ConsumerAndSupplierInterface {
    public static void main(String[] args) {
        Consumer<String> c= s-> System.out.println(s);
        c.accept("Consumer Interface");

        //BiConsumer
        BiConsumer<String,Integer> bc=(s,i)-> System.out.println(s+" "+i);
        bc.accept("Shivam",1);

        //Supplier
        Supplier<String> s=()->"Supplier";
        System.out.println(s.get());

    }
}
