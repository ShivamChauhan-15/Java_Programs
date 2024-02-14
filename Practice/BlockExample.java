package Practice;

class Demo{
    {
        System.out.println("Instance Block");
    }
    static {
        System.out.println("Static Block");
    }
    int x;
    Demo(int x){
        this.x=x;
        System.out.println("x="+x);
    }
}
public class BlockExample {
    static{
        System.out.println("Main Class Static Block");
    }
    {
        System.out.println("Main class instance block");
    }

    public static void main(String[] args) {
        Demo d=new Demo(5);
        BlockExample b=new BlockExample();
        System.out.println("This is main method");


    }
}
