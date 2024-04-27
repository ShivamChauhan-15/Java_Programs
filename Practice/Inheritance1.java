package Practice;

class GrandFather{
    public static void eat(){
        System.out.println("GrandFather");
    }
}
class Father extends GrandFather{
    public static void eat(){
        System.out.println("Father");
    }
}
class Son extends Father{
    public static void eat(){
        System.out.println("Son");
    }
}

public class Inheritance1 {
    public static void main(String[] args) {
        GrandFather g=new Son();
        g.eat();
        Father f=new Son();
        Son s=new Son();
        g = new Father();
        g.eat();



    }
}
