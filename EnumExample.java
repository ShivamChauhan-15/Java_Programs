// A Java program to demonstrate that we can have
// main() inside enum class.

//enum EnumExample {
//    RED,
//    GREEN,
//    BLUE;
//
//    // Driver method
//    public static void main(String[] args)
//    {
//        EnumExample c1 = EnumExample.RED;
//        EnumExample c2 = EnumExample.GREEN;
//        System.out.println(c1);
//        System.out.println(c2);
//    }
//}

import java.util.HashMap;

/******************************************************************************

 Welcome to GDB Online.
 GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
 C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
 Code, Compile, Run and Debug online from anywhere in world.

 *******************************************************************************/
class Salary{
    int id;
    int sal;
    Salary(int id,int sal){
        this.id=id;
        this.sal=sal;
    }

    @Override
    public String toString() {
        return "Salary{" +
                "id=" + id +
                ", sal=" + sal +
                '}';
    }
}
public class EnumExample {

    public static void main(String[] args) {
        HashMap<Integer,Salary> map=new HashMap<>();
        for(int i=1;i<=3;i++){
            Salary s=new Salary(i,10000);
            map.put(i,s);
        }
        for(HashMap.Entry<Integer,Salary> m:map.entrySet()){
            System.out.println("Hello");
            System.out.println(m);
        }

    }
}
