package NestedClassExample;
class Outer{
    private static int x=5;
    private String greet="Hello!";
    Outer(){
        System.out.println("Outer Constructor");;
    }
     final static class Inner{
        private static int x=10;
        private int z=15;
        Inner(){
            System.out.println("Inner Constructor");
        }
        void display(){
            System.out.println("x= "+this.x);
            System.out.println("z="+z);
            System.out.println("Outer class x="+Outer.x);
        }
    }
}
public class NestedStatic {
    public static void main(String[] args) {
        Outer o=new Outer();
        Outer.Inner n=new Outer.Inner();
        n.display();

    }
}
