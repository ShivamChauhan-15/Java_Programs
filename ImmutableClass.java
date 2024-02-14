import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

final class ImmutablePerson {
    private final String name;
    private final List<String> phoneNumbers;

    // Constructor without deep copy
    public ImmutablePerson(String name, List<String> phoneNumbers) {
        this.name = name;
        this.phoneNumbers = phoneNumbers; // Shallow copy - not recommended!
//          this.phoneNumbers=new ArrayList<>(phoneNumbers);
    }

    public String getName() {
        return name;
    }

    // Return an unmodifiable view of the phoneNumbers to ensure immutability
    public List<String> getPhoneNumbers() {
        return Collections.unmodifiableList(phoneNumbers);
    }
}
//class Demo2 extends ImmutablePerson{
//     List<String> add=new ArrayList<>();
//     public Demo2(String name,List<String> phoneNumbers){
//         super(name,phoneNumbers);
//         add=phoneNumbers;
//     }
//     @Override
//     public List<String> getPhoneNumbers() {
//         return add;
//     }
//}

public class ImmutableClass {
    public static void main(String[] args) {
        List<String> num=new ArrayList<>();
        num.add("98979675");
        num.add("234567");
        ImmutablePerson i=new ImmutablePerson("Shivam",num);
        System.out.println(i.getName());
        System.out.println(i.getPhoneNumbers());
        num.add("1237687");
        System.out.println(i.getPhoneNumbers());
//        Demo2 d=new Demo2("Rahul",num);
//        System.out.println(d.getPhoneNumbers());
//        System.out.println(d.getName());
//        num.add("1237687");
//        System.out.println(d.getPhoneNumbers());
    }
}
