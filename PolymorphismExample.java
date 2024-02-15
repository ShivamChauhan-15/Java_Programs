class DemoPoly {
    private int sum(int a, int b) {
        return a + b;
    }
    static int x=26;

    //    float sum(int a,int b){              //It is not allowed
//        return a+b;
//    }
    final int sum(int a,int b,int c){

        return a+b+c;
    }
    void sum1(int a,float b){
        System.out.println(a+b);
        System.out.println("intFloat");

    }
//    void sum1(float a,int b){
//        System.out.println(a+b);
//        System.out.println("floatInt");
//    }
    public static void sum(int a, double b) {
        //System.out.println(a + b);
        System.out.println("Prarent class");
    }
    public int getSum(int a,int b){
        int s= sum(a,b);
        return s;
    }

}
class DemoPolyDrive extends DemoPoly{
//    @Override
//    int sum(int a,int b){
//        return a+b;
//    }
    double sum(double a,double b){
        return a+b;
    }

//    final int sum(int a,int b,int c){       //Less Access Specifier
//        return a+b+c;
//    }
    public static void sum(int a, double b) {
//        System.out.println(a + b);
        System.out.println("Child Class");
    }
//    public Double sum(int a,int b){   //return type should be same for primitive data type but may be different in case of covarinat
//        return a+b;
//    }


}
public class PolymorphismExample {
    public static void main(String[] args) {
        DemoPoly d=new DemoPoly();
//        System.out.println(d.getSum(2,3));
//        d.sum(4,5.0);
        DemoPolyDrive dd=new DemoPolyDrive();
        DemoPoly d1=new DemoPolyDrive();
//        d.sum(5,6.8);
//        dd.sum(4,6.6);
//        d1.sum(4,7.8);
        d.sum1(4,5);
        d.sum1(4,6);
    }
}
