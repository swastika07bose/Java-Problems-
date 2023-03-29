import java.util.*;
class binomial
{
    int n,r;
    public binomial()
    {
        n=0;
        r=0;
    }
    public void read()
    {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter value of n in ncr: ");
        n=sc.nextInt();
        System.out.print("Enter value of r in ncr: ");
        r=sc.nextInt();
    }
    int fact(int a)
    {
        int fact=1;
        for(int i=1;i<=a;i++)
        {    
              fact=fact*i;    
        }    
        return fact;
    }
    public void prog()
    {
        int a= fact(n);
        int b= fact(n-r);
        int c= fact(r);
        int ncr= a/(b*c);
        System.out.print("value is: "+ ncr);
    }
    public static void main()
    {
        binomial p= new binomial();
        p.read();
        p.prog();
    }
}