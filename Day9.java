import java.util.*;
public class Day9 {
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        int arr_size=s.nextInt();
        int[] arr=new int[arr_size];
        for(int i=0;i<arr_size;i++)
        {
            arr[i]=s.nextInt();
        }
        //inplace exchange
        for(int i=0;i<arr_size/2;i++)
        {
            int temp_var=arr[i];
            arr[i]=arr[arr_size-i-1];
            arr[arr_size-i-1]=temp_var;
        }
        for(int i=0;i<arr_size;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}
