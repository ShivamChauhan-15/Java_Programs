public class Riwo {
    static int x = 10;
    static
    {
        m1();
        System.out.println("block1");
        System.out.println(x);
     //System.out.println("y="+y);   //it gives illegal forward reference?
    }

    public static void main(String[] args)
    {
        m1();
        System.out.println("Inside main");
    }

    public static void m1()
    {
        System.out.println(y);   //here it print 0?
        System.out.println("Inside block m1");
    }

    static int y = 20;
    static {
        System.out.println("end of code");
    }
}