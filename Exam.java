import java.util.Arrays;

public class Exam{
//    public static String reverse(String input) {
//        StringBuilder reversed = new StringBuilder();
//        for (int i = input.length() - 1; i >= 0; i--) {
//            reversed.append(input.charAt(i));
//        }
//        return reversed.toString();
//    }

    public static void main(String[] args) {
        int []arr={1,2,3,4,5};
        Arrays.stream(arr).filter(x->x%2==0).forEach(x-> System.out.println(x));
    }
}
