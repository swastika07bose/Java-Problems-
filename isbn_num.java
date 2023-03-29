import java.util.*;
class isbn_num
{
    public static void main (String args[])
    {
        int isbn;
        int s=0,i,t,d,dnum;
        String st;
        Scanner sc=new Scanner(System.in);
        System.out.print("Input a 10-digit ISBN number: ");
        isbn=sc.nextInt();
        st=""+isbn;
        if (st.length()!= 10) {
            System.out.println("Illegal ISBN");
            return;
        }
        s=0;
        for (i=0; i<st.length(); i++) {
            d=Integer.parseInt(st.substring(i,i+1));
            dnum=i+1;
            t=dnum*d;
            s+=t;
        }
        if ((s%11)!=0) 
        {
            System.out.println("Illegal ISBN");
        } 
        else 
        {
            System.out.println("Legal ISBN");
        }
    }
}