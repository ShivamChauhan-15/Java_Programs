package GenericExample;

class Node<T> {

    public T data;

    public Node(T data) { this.data = data; }

    public void setData(T data) {
        System.out.println("Node.setData");
        this.data = data;
        System.out.println("d1="+data);
    }
}
class Derived extends Node<Integer> {
    public Derived(Integer data) { super(data); }

    public void setData(Integer data) {
        System.out.println("MyNode.setData");
        super.setData(data);
        System.out.println("d2="+data);
    }
}
public class BridgeMethod {
    public static void main(String[] args) {
        Derived d=new Derived(5);
        d.setData(10);
    }
}
