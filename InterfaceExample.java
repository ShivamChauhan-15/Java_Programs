interface Multiplication{
    int x=5;
    int multiply(int a, int b);
    private void greeting(){
        System.out.println("Hello Everyone!");
    }
    default int square(int a){
        System.out.println(("In Multiplication"));
        greeting();
        return multiply(a, a);
    }
     static void display(){
        System.out.println("Multiplication Static");
    }
}
interface Division extends Multiplication{
    int divide(int a,int b);
    default int square(int a){
        System.out.println("In Division");
        return a*a;
    }
    static void display(){
        System.out.println("Division Static");
    }
}
interface Third extends Multiplication{
    default int square(int a){
        return Multiplication.super.square(a);
    }
}
class Drive implements Multiplication,Division,Third{
    public int multiply(int a,int b){
        return a*b;
    }
    public int divide(int a,int b){
        return a/b;
    }
     void display(){
        System.out.println("Class Static");
         System.out.println("x="+x);
    }
    public int square(int a){
//        System.out.println(Multiplication.super.square(5)); //it is not invoked bc'z class run that inetrface method which is more specific
        System.out.println(Division.super.square(4));
        System.out.println(Third.super.square(10));
        return a;
    }
}
public class InterfaceExample {
    public static void main(String[] args) {
        Drive d=new Drive();
//        System.out.println(d.square(4));
//        d.square(4);
//        Multiplication.display();
//        Division.display();
        d.display();
//        Division dm=new Drive();
//        dm.display();
        System.out.println(Multiplication.x);
    }
}
