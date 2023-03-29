import java.util. Scanner;
public class mixer 
{    
    Scanner sc=new Scanner(System.in);
    int arr[]=new int[10];  
    int n;  
    mixer(int nn)  
    {  
        n=nn;  
    }
    void accept()
    {
        System.out.println("Enter matrix in ascending order");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
    }
    mixer mix(mixer A)
    {
        mixer B=new mixer(n+A.n);
        int x=0;
        for(int i=0;i<n;i++)
        {
            B.arr[x++]=arr[i];
        }
        for(int j=0;j<A.n;j++)
        {
            B.arr[x++]=A.arr[j];
        }
        return B;
    }
    void display()
    {
        for(int i=0;i<n;i++)
        {
            System.out.println(arr[i]);
        }
    }
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of array");
        int a=sc.nextInt();
        mixer x=new mixer(a);
        mixer y=new mixer(a);
        x.accept();
        y.accept();
        mixer z=x.mix(y);
        z.display();
    }
}