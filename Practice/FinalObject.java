package Practice;

public class FinalObject {
    public static void main(String[] args) {
//        System.out.println("Hello, World!");
        final A a=new A();
//        a=null;     //Not allowed
//        a=new B(6);   //Not allowed
//        B b=new B(5);
//        b.display();
    }
}
class A{
    public static int x=5;
    A(){
        System.out.println("A");
    }

}
class B extends A{
    void display(){
            x = 10;
            System.out.println("x=" + x);

    }
    B(int a){
        System.out.println("B");
        System.out.println(x);
    }
}
