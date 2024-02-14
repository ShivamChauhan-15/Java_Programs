import java.util.*;

class LengthException extends Exception{
      LengthException(String s){
          super(s);
      }
//    @Override
//    public String getMessage(String s) {
//        return s;
//    }
}
class Complex{
    double real;
    double img;
    Complex(){
        real=0.0;
        img=0.0;
    }
    Complex(double real,double img){
        this.real=real;
        this.img=img;
    }
    Complex sum(Complex n1,Complex n2){
        double realSum=n1.real + n2.real;
        double imgSum=n1.img + n2.img;
        return new Complex(realSum,imgSum);
    }
    Complex sum(Complex n1,Complex n2,Complex n3){
       return sum(sum(n1,n2),n3);
    }
    Complex sum(Complex ...arr){
        if(arr.length==1)
            return arr[0];
        if(arr.length==2)
            return sum(arr[0],arr[1]);
        if(arr.length==3)
            return sum(arr[0],arr[1],arr[2]);
        else
            return sum(arr[0],sum(Arrays.copyOfRange(arr,1,arr.length)));
    }
    Complex mul(Complex n1,Complex n2){
        double realMul=n1.real*n2.real - n1.img*n2.img;
        double imgMul=n1.real*n2.img + n1.img*n2.real;
        return new Complex(realMul,imgMul);
    }
    Complex mul(Complex n1,Complex n2, Complex n3){
        return mul(mul(n1,n2),n3);
    }
    Complex mul(Complex ...arr){
        if(arr.length==1)
            return arr[0];
        if(arr.length==2)
            return mul(arr[0],arr[1]);
        if(arr.length==3)
            return mul(arr[0],arr[1],arr[2]);
        else
            return mul(arr[0],mul(Arrays.copyOfRange(arr,1,arr.length)));
    }
    public void print() {
        System.out.println(real+ " + " +img+ "i");
    }

    // Method to read a complex number from the user
    public Complex read() {
        Scanner sc= new Scanner(System.in);
        System.out.print("Real part: ");
        double real = sc.nextDouble();
        System.out.print("Imaginary part: ");
        double img= sc.nextDouble();
        return new Complex(real, img);
    }
    private Complex max;
    private Complex min;
    public double absoluteValue() {
        return Math.sqrt(real * real + img * img);
    }
    public void max_min(Complex ... arr) {
        max=arr[0];
        min=arr[0];
        for(Complex x:arr){
            if(x.absoluteValue()> max.absoluteValue())
                max=x;
            if(x.absoluteValue()<min.absoluteValue())
                min=x;
        }
    }
    public Complex getMax(Complex ...arr){
        max_min(arr);
        return max;
    }
    public Complex getMin(Complex ...arr){
        max_min(arr);
        return min;
    }

    public Complex average(Complex ... arr) {
        double avReal =0.0;
        double avImg=0.0;
        for(Complex x: arr){
            avReal+=x.real;
            avImg+=x.img;
        }
        return new Complex(avReal/ arr.length,avImg/ arr.length);
    }

    public void isPrime(Complex ...arr) {
        for(Complex x:arr){
            int f=1;
            if(x.real==1)
                x.print();
            else {
                for (int i = 2; i <= x.real/2; i++) {
                    if (x.real % i == 0) {
                        f = 0;
                        break;
                    }
                }
                if(f==1)
                    x.print();
            }
        }
    }

    public void isOdd(Complex ...arr) {
        for(Complex x:arr) {
            if (x.real % 2 != 0)
                x.print();
        }
    }

    public void isEven(Complex ...arr) {
        for(Complex x:arr){
            if(x.real%2==0)
                x.print();
        }
    }

    public int random(double min, double max) {
        return (int) (Math.random() * (max - min) + min);
    }

}

public class Task2 {
    public static void main(String[] args) {
        int n;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of elements on which you want to perform operation: ");
        n=sc.nextInt();
        Complex c=new Complex();
        Complex[] arr= new Complex[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Enter "+(i+1)+" number");
            arr[i] = c.read();
        }
        try{
            if(arr.length<=0)
                throw new LengthException("Length is invalid...please enter it again: ");

        }
        catch(LengthException e){

        }
        switch (arr.length) {

            case 0:{

            }
            case 1: {
                System.out.println("Sum is: ");
                arr[0].print();
                System.out.println("Prduct is: ");
                arr[0].print();
                break;
            }
            case 2: {
                Complex sum2 = c.sum(arr[0], arr[1]);
                System.out.println("Sum of two complex numbers: ");
                sum2.print();
                Complex prodOf2 = c.mul(arr[0], arr[1]);
                System.out.println("Product of two complex numbers: ");
                prodOf2.print();
                break;
            }
            case 3: {
                Complex sum3 = c.sum(arr[0], arr[1], arr[2]);
                System.out.println("Sum of three complex numbers:");
                sum3.print();
                Complex prodOf3 = c.mul(arr[0], arr[1], arr[2]);
                System.out.println("Product of three complex numbers: ");
                prodOf3.print();
                break;
            }
            default: {
                Complex sumOfN = c.sum(arr);
                System.out.println("Sum of N complex numbers: ");
                sumOfN.print();
                Complex prodOfN = c.mul(arr);
                System.out.println("Product of N complex numbers: ");
                prodOfN.print();
            }
        }
        //To find maximum
        System.out.println("Maximum number is: ");
        Complex max=c.getMax(arr);
        max.print();

        //To find minimum
        System.out.println("Minimum number is: ");
        Complex min=c.getMin(arr);
        min.print();

        //Avearge
        System.out.println("Average number is: ");
        Complex av=c.average(arr);
        av.print();

        //To find absolute value
        for(Complex x: arr) {
            System.out.print("Absolute value of ");
            x.print();
            System.out.println(x.absoluteValue());
        }

        //Odd
        System.out.println("Odd numbers are: ");
        c.isOdd(arr);

        //Even
        System.out.println("Even numbers are: ");
        c.isEven(arr);

        //Prime Numbers
        System.out.println("Prime numbers are: ");
        c.isPrime(arr);

        //Random Number
        System.out.println("Random number is: ");
        System.out.println(c.random(min.real,max.real));

    }
}
