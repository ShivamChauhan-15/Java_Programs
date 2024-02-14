package MethodReferencePractice;

interface Multiplication{
    int find(int a,int b);
}
class CalMul{
    int mul(int a,int b){
        return a*b;
    }
}
public class InstanceMethodReference {
    public static void main(String[] args) {
        CalMul m=new CalMul();
        Multiplication m1=m::mul;
        System.out.println(m1.find(4,5));
    }
}
