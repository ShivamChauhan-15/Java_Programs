package Practice;

class Singleton {
    private static Singleton instance;
    int x;

    //Private Constructor
    private Singleton() {
        System.out.println("From private constructor");
    }

    // Static method to get the instance
    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
//    void setX(int x){
//        this.x=x;
//    }
//    int getX(){
//        return x;
//    }
    void display(){
        System.out.println("This is display method");
    }
}
public class SingletonDesign {
    public static void main(String[] args) {
        // Get the Singleton instance
        Singleton s1 = Singleton.getInstance();    //since getInstance is static method so we call it with Class name
        s1.display();
        s1.x=7;
        Singleton s2=Singleton.getInstance();
//        s1.setX(5);
        System.out.println(s2.x);

    }
}