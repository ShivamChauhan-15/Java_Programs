package Company1;
import Company.*;
class Demo1{
    Demo1(){
        super();
        System.out.println("This is Demo1");
    }
}
class Demo2 extends ProtectedConstructorExample{
    Demo2(){
        super();
        System.out.println("This is demo2");
    }
}
public class ProtectedConstructorExample2 {
    public static void main(String[] args) {
        Demo1 d=new Demo1();
        Demo2 d2=new Demo2();
    }
}
