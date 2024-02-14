package Company;

public class PolymorphismExample2 {
    public static void one(Object obj){
        System.out.println("Object");
    }
//    public static void one(String obj){
//        System.out.println("String");
//    }
    public static void one(Number obj){
        System.out.println("Number");
    }
    public static void one(Integer obj){
        System.out.println("Integer");
    }
    public static void one(int obj){
        System.out.println("int");
    }

    public static void main(String[] args) {
        one(null);
        one('a');

    }
}
