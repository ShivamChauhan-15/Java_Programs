package NestedClassExample;

class Outer1{
    private static int x=5;
    private static String name;
    Outer1(){
        System.out.println("Outer Constructor");;
    }
    final class Inner{
        private int x=10; //we cannot declare static variable inside inner class
        private int z=15;
        Inner(){
            System.out.println("Inner Constructor");
        }
         void show(){
            System.out.println("This is static method inside innerclass");
        }
        void display(int x){
            System.out.println(x);
            System.out.println("x= "+this.x);
            System.out.println("z="+z);
            System.out.println("Outer class x="+Outer1.this.x);
        }
    }
}
public class NestedInnerClass {
    public static void main(String[] args) {
        Outer1 o=new Outer1();
        Outer1.Inner n=o.new Inner();
        n.display(50);
        n.show();
    }
}
