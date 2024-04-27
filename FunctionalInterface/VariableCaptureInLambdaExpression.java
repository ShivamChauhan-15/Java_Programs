package FunctionalInterface;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class VariableCaptureInLambdaExpression {
    int n;
    final int a=10;
    static int y;
    public static void main(String[] args) {
        VariableCaptureInLambdaExpression v=new VariableCaptureInLambdaExpression();
        int x=10;
        Function<Integer,Integer>f=num->{
            int value;
            v.n=10;    //Instance Variable Modification Allowed
            v.n++;
            System.out.println("n="+v.n);
            y=5;        //Static Variable Modification also Allowed
            y++;
            System.out.println("y="+y);
            value=num+x;   //Allowed
//            x++;        //Local Variable Modification Not Allowed
//            x=5;        //Not Allowed
            return value;
        };
//        x=10;     //x becomes effectively final
        v.n=20;
        System.out.println(f.apply(20));
        
    }
}
