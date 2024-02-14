//package CollectorsClass;
//
//import java.net.Inet4Address;
//import java.util.ArrayList;
//import java.util.List;
//import java.util.Set;
//import java.util.function.BiConsumer;
//import java.util.function.BinaryOperator;
//import java.util.function.Function;
//import java.util.function.Supplier;
//import java.util.stream.Collector;
//
//class Student{
//    int age;
//    String name;
//    int [] marks;
//
//    public Student(int age, String name, int[] marks) {
//        this.age = age;
//        this.name = name;
//        this.marks = marks;
//    }
//}
//class MyCollector implements Collector<Integer,List<Integer>,List<Integer>>{
//    @Override
//    public Supplier<List<Integer>> supplier() {
//        return ()->new ArrayList<Integer>();
//    }
//
//    @Override
//    public BiConsumer<List<Integer>, Integer> accumulator() {
//        return (li,e)->li.add(e);
//    }
//
//    @Override
//    public BinaryOperator<List<Integer>> combiner() {
//        return  (l1,l2)-> {
//             l1.addAll(l2);
//             return l1;
//        };
//    }
//
//    @Override
//    public Function<List<Integer>, List<Integer>> finisher() {
//        return x->x;
//    }
//
//    @Override
//    public Set<Characteristics> characteristics() {
//        return null;
//    }
//}
//
//public class CollectorClassExample {
//    public static void main(String[] args) {
//        Student s1=new Student(21,"Rahul",new int[]{50,55,60});
//        Student s2=new Student(21,"Rahul",new int[]{70,75,82});
//        Student s3=new Student(21,"Rahul",new int[]{80,85,50});
//        Student s4=new Student(21,"Rahul",new int[]{70,75,90});
//    }
//}
