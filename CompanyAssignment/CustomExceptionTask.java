package CompanyAssignment;

import java.util.Scanner;

class NoMatchException extends Exception {
    NoMatchException(String s){
        super(s);
    }

}
public class CustomExceptionTask {
    static boolean validate(String str)throws NoMatchException{
        if(!str.equalsIgnoreCase("india"))
            throw new NoMatchException("Country Name is not matched");
        else
            return true;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Country Name ");
        String str=sc.nextLine();
        try{
            if(validate(str))
                System.out.println("Country is matched");
        }
        catch(NoMatchException e){
//            e.printStackTrace();
            System.out.println(e);

        }
    }
}
