import java.lang.*;
import java.sql.SQLOutput;

class Demo {
    static int x;
    final static int y;
    static String name;
    int a;
    int b=50;
    Demo(){
        this(10);
        x=10;
        name="Shivam";
        System.out.println(x+" "+"Hello"+" "+name);
    }
    Demo(int a)
    {
        super();
        this.a=a;
        System.out.println("World");
    }
    int show(){
        display();
        return a;
    }
    void display()
    {
        System.out.println("This is executing using this keyword");
    }
    static{
        x=15;
        y=20;        //final static variable initialized in static block only
        name="A";
        System.out.println("Static");
    }
    {
        x=15;
//        y=50;       //we cannot initialized final static variable here
        System.out.println(x+" "+name);
        System.out.println("init"+a);
    }
    void print2(){
        System.out.println("This is parent");
    }
}
class DemoDrive extends Demo{
    int b=100;
    void print(){
//        super.display();
        display();   //we can call superclass method either directly or by using super.
        System.out.println("This is from drive class");
//        System.out.println(super.b);
    }
    void print2(){
        System.out.println("This is child");
    }
    void display()
    {
        System.out.println("This is base class");
    }
}
//class DemoDrive2{
//    DemoDrive d1=new DemoDrive();
//    void show(){
//        d1.super.print2();
//    }
//
//}
class Test{
//    static{
//        System.out.println("First Block");
//    }
    public static void main(String[] args) {
        Demo d=new Demo();
//        System.out.println(d.show());
        d.name="B";
        Demo d2=new Demo();
        DemoDrive dd=new DemoDrive();
        dd.print();
//        DemoDrive2 d2=new DemoDrive2();
//        d2.show();


    }
    static{
        System.out.println("After Main Method");
    }

}