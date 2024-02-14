abstract class ParentAbstract {
     final void show() {
        System.out.println("From ParentAbstract");
    }

    abstract void print();
}
class Child extends ParentAbstract{
    void print(){
        System.out.println("In print");
    }
//    void show(){
//        System.out.println("Fom child show");
//    }

}
public class AbstractExample {
    public static void main(String[] args) {
        ParentAbstract p=new Child();
        Child c=new Child();
        p.print();
//        p.show();
        c.show();
    }
}
