package GenericExample;

class GenericFunctionExample {
    // A Generic method example
    static <T> void genericDisplay(T element)
    {
        System.out.println(element.getClass().getName()
                + " = " + element);
    }
    static <T extends Number> double add(T e1,T e2){
        return e1.doubleValue()+e2.doubleValue();
    }
    // Driver method
    public static void main(String[] args)
    {
        genericDisplay(11);
//        genericDisplay("GeeksForGeeks");
//        genericDisplay(1.0);
        double sum=add(4,5);
        System.out.println(sum);
    }
}
