package FunctionalInterface;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class FunctionInterface {
    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(1,2,3,4,5,6,7,8,9);
        Function<List<Integer>,List<Integer>> li=l1->{
            List<Integer> res=new ArrayList<>();
            for(Integer i:l1){
                if(i%2==0)
                    res.add(i);
            }
            return res;
        };

        System.out.println("Resultant List: "+li.apply(list));

        //andThen
        Function<String,String> f1=s->s.toUpperCase();
        Function<String,String> f2=s->s.substring(0,4);
        System.out.println(f2.andThen(f1).apply("Shivam"));

        //compose
        System.out.println(f1.compose(f2).apply("Shivam"));

        //identity
        Function<String,String> f3=Function.identity();
        System.out.println(f3.apply("Identity Function"));

        //BiFunctional
        BiFunction<Integer,Integer,Integer> bi=(a,b)->a+b;
        System.out.println("Sum is: "+bi.apply(2,3));

        //UnaryOperator
        UnaryOperator<String> uf=s->s.toUpperCase();
        System.out.println(uf.apply("rahul"));

        //BinaryOperator
        BinaryOperator<String> b=(s1,s2)->s1+s2;
        System.out.println(b.apply("Shivam","Chauhan"));

    }
}
