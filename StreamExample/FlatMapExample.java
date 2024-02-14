package StreamExample;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;
class Emp{
    int id;
    String name;

}
public class FlatMapExample {
    public static void main(String[] args) {
        List<String> stringList = new ArrayList<String>();

        stringList.add("One flew over the cuckoo's nest");
        stringList.add("To kill a muckingbird");
        stringList.add("Gone with the wind");

        Stream<String> st = stringList.stream();

//        Stream<String> result= st.flatMap((value) -> {
//                    String[] split = value.split(" ");
//                    List<String>l=Arrays.asList(split);
//                    System.out.println("Before Stream: "+l);
//                    return (Stream<String>) l.stream();
//                });
//        result.forEach(System.out::println);
        List<Integer>l1=Arrays.asList(1,2);
        List<Integer>l2=Arrays.asList(3,4);
        List<Integer>l3=Arrays.asList(5,6);
        List<List<Integer>> li=new ArrayList<>();
        li.add(l1);
        li.add(l2);
        li.add(l3);
        Stream<List<Integer>> s=li.stream();
        List<Integer> collect = s.flatMap(x -> x.stream().filter(i->i%2==0).map(y -> y * 5)).collect(Collectors.toList());
        System.out.println(collect);

    }
}
