package GenericExample;

import java.util.Arrays;
import java.util.List;

class WildcardError {

    void foo(List<?> i) {
        fooHelper(i);

    }
    private <T> void fooHelper(List<T> l) {
        l.set(0, l.get(0));
        System.out.println(l);
    }

}

public class CaptureAndHelper {
    public static void main(String[] args) {
        WildcardError w=new WildcardError();
        List<Integer> l= Arrays.asList(1,2,3,4,5);
        w.foo(l);
    }
}

