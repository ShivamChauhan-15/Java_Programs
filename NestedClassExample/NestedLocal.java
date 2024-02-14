package NestedClassExample;

class Outer2{
    private static int x=5;
    private static String greet="Hello!";
    Outer2(){
        System.out.println("Outer Constructor");;
    }
    void show(){
        int y=5;
        System.out.println("This is static method inside innerclass");
        final class Inner{
            private int x=10; //we cannot declare static variable inside inner class
            Inner(){
                System.out.println("Inner Constructor");
            }
            void display(int x){
                System.out.println(x);
                System.out.println("x= "+this.x);
                System.out.println("y="+y);
                System.out.println(greet);
                System.out.println("Outer class x="+Outer2.this.x);
            }
        }
        Inner i=new Inner();
        i.display(60);
    }

}
public class NestedLocal {
    public static void main(String[] args) {
        Outer2 o=new Outer2();
        o.show();
    }
}

