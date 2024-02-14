import java.util.*;
public class Example
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number:");
        int n=sc.nextInt();
        int [] arr=new int[n];
        Map<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<n;i++)
            arr[i]=sc.nextInt();

        for(int i=0;i<n;i++){
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);

        }
        for(Map.Entry<Integer,Integer> m:map.entrySet()){
            if(m.getValue()==1)
                System.out.println(m.getKey());
        }

    }
}