package MethodReferencePractice;

interface Finder{
    int find(String s1,String s2);
}
class IndexOf{
     int search(String s1,String s2){
        return s1.indexOf(s2);
    }
}
public class ParameterMethodRefernce {
    public static void main(String[] args) {
        IndexOf i=new IndexOf();
        Finder f1=i::search;
//        Finder f=IndexOf::search;
        System.out.println(f1.find("Shivam","a"));
    }

}
