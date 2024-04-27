package Exception;

class MyException extends Exception{
    MyException(String s){
        super(s);
    }
}
class Demo{
    void findArea(int s)throws MyException,ArithmeticException{
        if(s<0)
            throw new MyException("Side should be greater than 0");
        System.out.println("Area is: "+s*s);
        int d=5/0;
    }
}
public class CustomException {
    public static void main(String[] args) {
        Demo d=new Demo();
        try{
            d.findArea(3);
        }
        catch (MyException e){
            e.printStackTrace();
        }
        catch(ArithmeticException e){
            e.printStackTrace();
        }

    }
}

