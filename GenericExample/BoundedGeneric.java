package GenericExample;

interface A{
    void display();
    default void show(){
        System.out.println("This is default method of interface");
    }
}
interface C{
    default void print(){
        System.out.println("Print Method");
    }
}
class B implements A,C{
    public void display(){
        System.out.println("This is interface method which implements in class B");
    }
    public void print(){
        System.out.println("This is print method of class B");
    }
   public void show(){
        System.out.println("Show");
    }
}

class Bound<T extends B & A & C>{
    private T obj;
    Bound(T obj){
        this.obj=obj;
    }
    public T getObj(){
        return obj;
    }
    public void dom(){
        obj.show();
        obj.display();
    }

}
public class BoundedGeneric {
    public static void main(String[] args) {
        A a=new B();
        Bound<B> b=new Bound<>(new B());
        System.out.println(b.getObj());
        b.dom();
    }

}
