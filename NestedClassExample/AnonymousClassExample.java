package NestedClassExample;

import java.lang.reflect.InvocationTargetException;

interface Greeting {
    void greet();
    void display();
}
class Parent {
    void show() {
        System.out.println("Parent class");
    }
}

public class AnonymousClassExample {
    int b=9;
    static int p=15;
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        int a=4;
        AnonymousClassExample an=new AnonymousClassExample();
        Greeting anonymousGreeting = new Greeting() {
            static final int y=7;      //static variable must be final
            @Override
            public void greet() {
                System.out.println("Hello, world! "+y+" a="+a);
                an.b++;
                p++;
            }
            @Override
            public void display(){
                System.out.println("This is from Anonymous class");
            }
        };
//        a=10;   //Not Allowed because it becomes final

        Parent p=new Parent(){
            int x=9;
            //System.out.println("Outer");    //Not Allowed
            @Override
            public void show(){
                x++;
                System.out.println("This is show method of parent class "+x);
            }
            public void extra(){
                System.out.println("Extra Method");
            }
            //x++;      //Not Allowed

           /*abstract class Demo{         //Not Allowed
                abstract void print();
            }
            class DemoDrive extends Demo{
                public void print(){
                    System.out.println("This is abstract class method");
                }
            }*/
//            DemoDrive d=new DemoDrive();
//            d.print();


        };

        anonymousGreeting.greet(); // Output: Hello, world!
        anonymousGreeting.display();
        p.show();
        p.getClass().getMethod("extra").invoke(p);
    }
}
