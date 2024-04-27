
class Deep1{
    int x;
    int y;
}
class Deep2 implements Cloneable {
    int a,b;
    String name;
    Deep1 t=new Deep1();
    public Object clone()throws CloneNotSupportedException {
//        Deep2 d=(Deep2)super.clone();
//        d.t=new Deep1();
//        return d;
        return super.clone();
    }
}
public class DeepCloning {
    public static void main(String[] args) throws CloneNotSupportedException {
        {
            Deep2 d2= new Deep2();
            d2.a = 10;
            d2.b = 20;
            d2.t.x = 30;
            d2.t.y = 40;
            d2.name="Shivam";

            Deep2 cln = (Deep2)d2.clone();
            cln.t=new Deep1();
            cln.a = 100;

            // Change in primitive type of Deep2 will not
            // be reflected in Deep1 field
            cln.t.x = 300;
            cln.t.y=500;
            cln.name="Chauhan";


            // Change in object type field of Deep2 will not
            // be reflected in Deep1(deep copy)
            System.out.println(d2.a + " " + d2.b + " " + d2.t.x
                    + " " + d2.t.y+" "+d2.name);
            System.out.println(cln.a + " " + cln.b + " " + cln.t.x
                    + " " + cln.t.y+" "+cln.name);
        }

    }
}
