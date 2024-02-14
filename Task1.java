import java.util.Scanner;

class Publication{
    private String title;
    private float price;
    Publication(String title,float price){
        this.title=title;
        this.price=price;
    }
    float getPrice(){
        return price;
    }
    String getTitle(){
        return title;
    }
    public void showDetails(){
        System.out.println("Title: "+title);
        System.out.println("Price: "+price);
    }
}
class Book extends Publication{
    private int pageCount;
    Book(String title,float price,int pageCount){
        super(title, price);
        this.pageCount=pageCount;
    }
    @Override
    public void showDetails(){
        super.showDetails();
        System.out.println("Number of Pages: "+pageCount);
    }
}
class Tape extends Publication{
    private float time;
    Tape(String title,float price,float time){
        super(title,price);
        this.time=time;
    }
    @Override
    public void showDetails(){
        super.showDetails();
        System.out.println("Playing Time: "+time+"minutes");
    }
}
public class Task1 {
    public static void main(String[] args) {
        try{
            Scanner sc=new Scanner(System.in);
            //Book Input
            System.out.println("Enter title of the book: ");
            String bookTitle=sc.nextLine();
            System.out.println("Enter price of the book: ");
            float bookPrice=Float.parseFloat(sc.nextLine());
            System.out.println("Enter number of pages in the book: ");
            int pageCount=Integer.parseInt(sc.nextLine());

            //Tape Input
            System.out.println("Enter title of the tape");
            String tapeTitle=sc.nextLine();
            System.out.println("Enter price of the tape: ");
            float tapePrice=Float.parseFloat(sc.nextLine());
            System.out.println("Enter playing time of tape in minutes: ");
            float time=Float.parseFloat(sc.nextLine());

            Book b=new Book(bookTitle,bookPrice,pageCount);
            System.out.println("Book Details: ");
            b.showDetails();
            Tape t=new Tape(tapeTitle,tapePrice,time);
            System.out.println("Tape Details: ");
            t.showDetails();
        }
        catch(Exception e){
            e.printStackTrace();
            Book b=new Book("",0.0f,0);
            Tape t=new Tape("",0.0f,0.0f);
            System.out.println("Book Details: ");
            b.showDetails();
            System.out.println("Tape Details: ");
            t.showDetails();
        }
    }
}
