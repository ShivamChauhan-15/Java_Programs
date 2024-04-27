import java.lang.Cloneable;
class B{
    int x;
}
class A implements Cloneable {
    int i;
    String s;
    B b1;
    public A(int i, String s,B b1)
    {
        this.i = i;
        this.s = s;
        this.b1=b1;
    }

    // Overriding clone() method
    // by simply calling Object class
    // clone() method.
    @Override
    protected Object clone()throws CloneNotSupportedException
    {
        return super.clone();
    }
}

public class ClonnableInterfaceShallow{
    public static void main(String[] args) throws CloneNotSupportedException
    {
        B b3=new B();
        b3.x=500;
        A a = new A(20, "GeeksForGeeks",b3);

        // cloning 'a' and holding
        // new cloned object reference in b

        // down-casting as clone() return type is Object
        A b =(A) a.clone();
        b.i=10;
        b.s="Shivam";
        b.b1.x=1000;
        System.out.println(a.i);
        System.out.println(a.s);
        System.out.println(b.i);
        System.out.println(b.s);
        System.out.println("a.b1.x= "+a.b1.x);
        System.out.println("b.b1.x= "+b.b1.x);
    }
}

