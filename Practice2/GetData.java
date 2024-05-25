package Practice2;

import java.lang.reflect.Field;

public class GetData {
    public static void display(){
        Class<?> studentClass = Student.class;  //Reflection
        Field[] fields = studentClass.getDeclaredFields();
        for (int i = 0; i < fields.length; i++) {
            System.out.println(fields[i].getName());
        }
    }

    public static void main(String[] args) {
        display();
    }
}


