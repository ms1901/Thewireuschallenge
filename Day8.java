import java.util.*;
public class Day8 {
    public static void main(String[] args)
    {
        HashMap<String,Integer> map=new HashMap<>();
        Scanner s=new Scanner(System.in);
        int number_input=s.nextInt();
        s.nextLine();
        while(number_input>0)
        {
            String str=s.nextLine();
            map.put(str,map.getOrDefault(str,0)+1);
            number_input--;
        }
        int output=s.nextInt();
        s.nextLine();
        while(output>0)
        {
            String str=s.nextLine();
            System.out.println(map.getOrDefault(str,0));


            output--;
        }

    }
}
