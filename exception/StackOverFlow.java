package exception;

public class StackOverFlow {
    static void rec(int i){
        System.out.println(("Hello "+i));
        rec(i+1);

    }
    static void createArray(){
        long []arr=new long[Integer.MAX_VALUE];
    }
    public static void main(String[] args) {
        createArray();
//          rec(1);


    }
}
