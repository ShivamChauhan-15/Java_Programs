import java.lang.Cloneable;
class A implements Cloneable {
    int i;
    String s;
    public A(int i, String s)
    {
        this.i = i;
        this.s = s;
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
        A a = new A(20, "GeeksForGeeks");

        // cloning 'a' and holding
        // new cloned object reference in b

        // down-casting as clone() return type is Object
        A b =(A) a.clone();
        b.i=10;
        b.s="Shivam";
        System.out.println(a.i);
        System.out.println(a.s);
        System.out.println(b.i);
        System.out.println(b.s);
    }
}

