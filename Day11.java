import java.util.*;
public class Day11 {
    public static void changetime(String str)
    {
        if(str.contentEquals("12:00:00AM"))
        {
            System.out.println("00:00:00");
            return;
        }
        else if(str.substring(8,10).contentEquals("PM"))
        {
            int time=Integer.parseInt(str.substring(0,2));
            time=time+12;
            String mil_time=String.valueOf(time)+str.substring(2,8);
            System.out.println(mil_time);
            return;

        }
        else
        {
            System.out.println(str);
            return;
        }

    }
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        String time=s.nextLine();
        changetime(time);

    }
}
