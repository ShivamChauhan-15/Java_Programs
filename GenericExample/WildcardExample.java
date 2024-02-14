//package GenericExample;
//import java.util.*;
//
//public class WildcardExample {
//    public static void main(String[] args) {
//        System.out.println("UpperBound Wildcard Example");
//        List<Integer> l1=Arrays.asList(1,2,3,4,5);
//        System.out.println("Sum of List1: "+l1+" is: "+sum(l1));
//        List<Double> l2=Arrays.asList(2.4,5.6,6.8,4.5);
//        System.out.println("Sum of List1: "+l2+" is: "+sum(l2));
//
//        System.out.println("LowerBound Wildcard Example");
//        List<Number> l3=new ArrayList<>();
//        List<Number> l4=new ArrayList<>();
//        l3.add(1);
//        l3.add(1.3);
//        l3.add(4);
//        l3.add(5);
//        l3.add(6);
//        lowerBoundWildcard(l3);
//        lowerBoundWildcard(l4);
//
//    }
//    //UpperBound Example
//    static double sum(List<? extends Number> list){
//        double sum=0.0;
////        list.add(5.6);    //Not Allowed
//        Number d=list.get(3);    //read is allowed
//        System.out.println("d="+d);
//        for(Number i:list){
//            sum+= i.doubleValue();
//        }
//        return sum;
//    }
//
//
//    //LowerBound Example
//    static void lowerBoundWildcard(List<? super Integer> list){
//        list.add(null);
//        for(Integer i=20;i<=25;i++)
//            list.add(i);
//        System.out.println(list);
//    }
//
//    //Unbounded Wildcard Example
//    static void unboundWildcardExample(List<?>){
//
//    }
//
//}
