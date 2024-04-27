package Collection;

class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
        this.next=null;
    }
}
class Linked{
    Node head=null;
    void add(int elem){
        Node temp=new Node(elem);
        if(head==null)
            head=temp;
        else{
            Node curr=head;
            while(curr.next!=null){
                curr=curr.next;
            }
            curr.next=temp;
        }
    }

    void print(){
        Node t=head;
        while(t!=null){
            System.out.println(t.data);
            t=t.next;
        };
    }
}
public class CustomLinkedList {
    public static void main(String[] args) {
        Linked l=new Linked();
        l.add(5);
        l.add(10);
        l.add(15);
        l.add(20);
        l.print();
    }
}
