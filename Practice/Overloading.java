package Practice;

class A1{
    int sum(int a,int b){
        return a+b;
    }
//    double sum(int a,int b){
//        return a+b;
//    }
}
public class Overloading {
    public static void main(String[] args) {
        A1 a=new A1();
        double s=a.sum(2,3);
        int s1=a.sum(4,5);
        System.out.println("s="+s);
        System.out.println("s1="+s1);
    }
}
