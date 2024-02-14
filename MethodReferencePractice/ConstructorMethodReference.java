package MethodReferencePractice;

interface Demo{
    Person create(int age,String name);
}
class Person{
    int age;
    String name;
    public Person(int age,String name){
        this.age=age;
        this.name=name;
    }
    String getName(){
        return name;
    }
    int getAge(){
        return age;
    }
}
public class ConstructorMethodReference {
    public static void main(String[] args) {
        Demo d=Person::new;
        Person p=d.create(20,"Shivam");
        System.out.println("Age: "+p.getAge());
        System.out.println("Name: "+p.getName());
    }
}
