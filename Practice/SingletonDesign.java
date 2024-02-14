package Practice;

class Singleton {
    private static Singleton instance;

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
    void display(){
        System.out.println("This is display method");
    }
}
public class SingletonDesign {
    public static void main(String[] args) {
        // Get the Singleton instance
        Singleton sing = Singleton.getInstance();    //since getInstance is static method so we call it with Class name
        sing.display();
    }
}