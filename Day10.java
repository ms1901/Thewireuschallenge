import java.util.*;
public class Day10 {
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        int no_of_elements=s.nextInt();
        int left_rot=s.nextInt();
        int[] arr=new int[no_of_elements];
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=s.nextInt();

        }
        int[] output=new int[no_of_elements];
        int right=no_of_elements-left_rot;
        for(int i=0;i<arr.length;i++)
        {
            int a=(i+right)%no_of_elements;
            output[a]=arr[i];


        }
        for(int i=0;i< output.length;i++)
        {
            System.out.print(output[i]+" ");
        }


    }
}
