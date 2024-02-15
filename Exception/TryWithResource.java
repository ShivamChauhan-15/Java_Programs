package Exception;

class MyResources implements AutoCloseable{
    void open(){
        System.out.println("Opening Resources");
    }
    @Override
    public void close() throws Exception {
        System.out.println("Closing Resources");
    }
}
public class TryWithResource {
    public static void main(String[] args) throws Exception {
        try(MyResources resource=new MyResources()){
            resource.open();
        }
//        catch (Exception e){
//            e.printStackTrace();
//        }

    }
}
