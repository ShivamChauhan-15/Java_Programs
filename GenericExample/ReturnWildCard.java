package GenericExample;

import java.util.ArrayList;
import java.util.List;

public class ReturnWildCard {
    // Method to create a list of elements of unknown type
    public static List<?> createList() {
        List<Object> list = new ArrayList<>();
        list.add("Hello");
        list.add(42);
        list.add(3.14);
        return list;
    }

    public static void main(String[] args) {
        List<?> myList = createList();
        for (Object item : myList) {
            System.out.println(item);
        }
    }
}

