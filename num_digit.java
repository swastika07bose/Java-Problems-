import java.util.*;
class num_digit
{
    public static void main(String args[])
    {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter m: ");
        int m =sc.nextInt();
        System.out.print("Enter n: ");
        int n =sc.nextInt();
        if (m>=100 && m<=10000 && n<100) {
            while(true){
            int x=m; 
            int s=0; 
            int cnt=0;
            int num;
            while (x>0) {
                num=x%10;
                s+=num;
                x/=10;
                cnt++;
            }
            if (s==n) {
                System.out.println("The smallest required number is:"+m);
                System.out.println("The number of digits is:"+cnt);
                break;
            }
            m++;
            }
        }
        else
            System.out.println("Invalid Input");
    }
}