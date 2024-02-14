package Company1;

import org.w3c.dom.ls.LSOutput;

class Animal{
    Animal eat(){
        System.out.println("Animal eat");
        return new Animal();
    }
    void print(){
        System.out.println("In Animal print method");
    }
}
class Dog extends Animal{
    Animal eat(){
        System.out.println("Dog eat");
        return new Dog();
    }
    Animal bark(){
        System.out.println("In Dog Bark");
        return new Dog();
    }
    void print(){

        System.out.println("In Dog print method");
    }
}
public class CovariantExample
{
    public static void main(String[] args) {
//        Animal a=new Animal();
////        a.eat();
        Dog d=new Dog();
//        Animal a1=d.eat();
//        a1.print();
//        ((Dog)a1).print();
        Animal a1=new Dog();
//        d1.super.print();        //This is not working, why??
    }
}
