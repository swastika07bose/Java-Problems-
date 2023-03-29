import java.util.*;
class time_add
{
    int hr, min, sec, t_hr, t_min, t_sec;
    time_add()
    {
       hr=0;
       min=0;
       sec=0;
       t_hr=0;
       t_min=0;
       t_sec=0;
    }
    void input()
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter hours in time ");
        hr=sc.nextInt();
        System.out.println("enter minutes in time ");
        min=sc.nextInt();
        System.out.println("enter seconds in time ");
        sec=sc.nextInt();
        System.out.println("Time= "+hr+":"+min+":"+sec);
    }
    void time_add()
    {
        t_hr= t_hr+hr;
        t_min= t_min+min;
        t_sec= t_sec+sec;
        if (t_sec>=60)
        {
            t_min++;
            t_sec=t_sec%60;
        }
        if (t_min>=60)
        {
            t_hr++;
            t_hr=t_hr%60;
        }
    }
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        time_add tad=new time_add();
        System.out.println("Enter number of times you want to add:");
        int n= sc.nextInt();
        for (int i=0; i<n; i++)
        {
            tad.input();
            tad.time_add();
        }
        System.out.println("Added Time="+tad.t_hr+":"+tad.t_min+":"+tad.t_sec);
    }
}