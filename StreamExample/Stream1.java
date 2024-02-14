package StreamExample;

import java.util.*;
import java.util.stream.Stream;

public class Stream1 {
    public static void main(String[] args) {
        List<String> li=new ArrayList<>();
        li.add("rahul");
        li.add("sonakshi");
        li.add("shivani");
        li.add("karan");
        li.add("atul");
        Stream<String> s=li.stream();
        s.map(value->value.toUpperCase()).forEach(System.out::println);
        System.out.println(li);

        Stream<String> sl=li.stream();
        System.out.println("Word having length greater than 5: ");
        sl.filter(x->x.length()>5).forEach(System.out::println);

        //peek(), sorted()
        System.out.println("peek() exapmle");
        Stream<Integer> stream = Stream.of(15, 2, 40, 4, 50,61,17,28,39,10);
        stream.filter(x->x>4).peek(System.out::println).map(x->x*2).sorted().peek(System.out::println).forEach(System.out::println);

        //distinct()
        System.out.println("distinct() Example: ");
        Stream<Integer> s2=Stream.of(14,2,1,33,25,41,2,33,44,5,6,3,2,1);
        s2.peek(x-> System.out.println("x:"+x)).distinct().peek(System.out::println).sorted().peek(x-> System.out.println("s:"+x)).count();
    }
}
