package FunctionalInterface;

import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class ConsumerAndSupplierInterface {
    public static void main(String[] args) {
        Consumer<String> c= s-> System.out.println(s);
        c.accept("Consumer Interface");

        Consumer<String> c1=s->s.toUpperCase();
        Consumer<String> c2=s-> System.out.println(s.length());
        Consumer<String> c3=c1.andThen(c2);
        c3.accept("hello");

        //BiConsumer
        BiConsumer<String,Integer> bc=(s,i)-> System.out.println(s+" "+i);
        bc.accept("Shivam",1);

//        //Supplier
        Supplier<String> s=()->"Supplier";
        System.out.println(s.get());

    }
}
