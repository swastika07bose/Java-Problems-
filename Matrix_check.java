import java.util. Scanner;
public class Matrix_check 
{    
    Scanner sc=new Scanner(System.in);
    int arr[][]=new int[25][25];  
    int m,n;
    int cnt;
    Matrix_check(int mm, int nn)  
    {  
        m=mm;  
        n=nn;  
    }
    void fillarray()
    {
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                arr[i][j]=sc.nextInt();
            }
        }
    }
    void check(Matrix_check A,Matrix_check B)
    {
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(B.arr[i][j]==A.arr[i][j])
                {
                    cnt++;
                }
            }
        }
        if(cnt==(m+n))
        {
            System.out.println("The 2 Matrix are equal");
        }
        else 
        {
            System.out.println("The 2 Matrix are not equal");
        }
    }
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of array");
        int a=sc.nextInt();
        int b=sc.nextInt();
        if(a>25||b>25)
        {
            System.out.println("Size more than 25x25");
        }
        else
        {
            Matrix_check X=new Matrix_check(a,b);
            Matrix_check Y=new Matrix_check(a,b);
            System.out.println("Enter elements in Matrix X");
            X.fillarray();
            System.out.println("Enter elements in Matrix Y");
            Y.fillarray();
            Y.check(X,Y);
        }
    }
}
