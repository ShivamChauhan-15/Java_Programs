package GenericExample;
import CompanyAssignment.MapAssignment.Employee;

import java.util.*;
// We use < > to specify Parameter type
class Test<T, U>
{
    T obj1; // An object of type T
    U obj2; // An object of type U
    Test(T obj1, U obj2)
    {
        this.obj1 = obj1;
        this.obj2 = obj2;
    }
    public void print()
    {
        System.out.println(obj1);
        System.out.println(obj2);
    }
}


// Driver class to test above
//class GenericClassExample
//{
//    public static void main (String[] args)
//    {
//        Test <String, Integer> obj = new Test<String, Integer>("GfG", 15);
//        obj.print();
//
//    }
//}
// Java program to demonstrate that NOT using

class GenericClassExample
{
    public static void main(String[] args)
    {
        // Creating an ArrayList without any type specified
        ArrayList al = new ArrayList();

        al.add("Sachin");
        al.add("Rahul");
        al.add(10); // Compiler allows this

        String s1 = (String)al.get(0);
        String s2 = (String)al.get(1);

        // Causes Runtime Exception
        String s3 = (String)al.get(2);
    }
}

