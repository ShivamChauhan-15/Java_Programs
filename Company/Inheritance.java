package Company;

class Demo{
    private static final int x=10;
    void one(){
        System.out.println("From Parent Class = "+x);
    }

}
public class Inheritance extends Demo {
    public static int x = 20;

    Inheritance() {
        System.out.println(x);
    }

    protected void one() {
        System.out.println("From Drive Class = " + x);
    }

    public static void main(String[] args) {
//        System.out.println(Demo.x);
//        System.out.println(Inheritance.x);
        Inheritance i = new Inheritance();
        Demo d = new Inheritance();
        Demo d1 = new Inheritance();

        i.one();
        d.one();
    }
}

