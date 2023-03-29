import java.util.*;
class mul
{
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter number");
        int n=sc.nextInt();
        int i;
        for (i=1;i<=n;i++)
        {
            int b=i*n;
            System.out.println(n+"x"+i+"="+b);
        }
    }
}