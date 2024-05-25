package MethodReferencePractice;

interface Addition{
    int sum(int a,int b);
    default void show(){
        System.out.println("Default method of interface");
    }
    static void display(){
        System.out.println("Static method of interface");
    }
}
class PerformAdd{
    static int add(int a,int b) {
        return a + b;
    }
}
public class StaticMethodReference {
    public static void main(String[] args) {
       //Addition a=(x,y)->PerformAdd.add(x,y);
        //we can write above statement using method reference as
        Addition a=PerformAdd::add;
        System.out.println(a.sum(4,5));
        Addition.display();
        a.show();
    }
}
