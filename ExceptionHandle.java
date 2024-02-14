
/*
class MyException extends Exception {
//    MyException(String str) {
//        super(str);
//    }
}
class FindArea{
    void area(int s) throws MyException{
        if(s<0){
            throw new MyException();
        }
        else
            System.out.println(s*s);
    }
}


public class ExceptionHandle {
    public static void main(String[] args) {
        FindArea a= new FindArea();
        try {
            a.area(5);
            a.area(-4);
        }
        catch (Exception e) {
//            e.printStackTrace();

            System.out.println(e);
        }

    }
}*/


// Java program to demonstrate
// the getLocalizedMessage() Method.

import java.io.*;

class ExceptionHandle {


    public static void main(String[] args)
            throws Exception
    {

        try {
            addPositiveNumbers(2, -1);
        }
        catch (Exception e) {
            System.out.println("LocalizedMessage = "
                    + e.getLocalizedMessage());
        }
//        try{
//            int a=5/0;
//        }
//        catch(ArithmeticException e) {
//            System.out.println(e);
//        }
    }
    public static void addPositiveNumbers(int a, int b)
            throws Exception
    {

        if (a < 0 || b < 0) {

            throw new Exception("Numbers are not Positive");
        }
        else {

            System.out.println(a + b);
        }
    }
}


