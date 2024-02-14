package Company;
class X
{
    static class Y
    {
        static String Z="black";
    }
     static C Y=new C();
}
class C
{
    String Z="white";
}
public class InnerStaticClass
{
    public static void main(String[] args) {
//        X obj=new X();
//        System.out.println(obj.Y.Z);
        System.out.println(X.Y.Z);
    }
}
