import java.util. Scanner;
public class Matrix  
{    
    Scanner sc=new Scanner(System.in);
    int arr[][]=new int[25][25];  
    int m,n;  
    Matrix(int mm, int nn)  
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
    Matrix SubMat(Matrix A)
    {
        Matrix B=new Matrix(m,n);
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                B.arr[i][j]=arr[i][j]-A.arr[i][j];
            }
        }
        return B;
    }
    void display()
    {
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                  System.out.print(arr[i][j]+"\t");                                                                                                    
            }
            System.out.println();
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
            Matrix X=new Matrix(a,b);
            Matrix Y=new Matrix(a,b);
            Matrix Z=new Matrix(a,b);
            System.out.println("Enter elements in Matrix X");
            X.fillarray();
            System.out.println("Enter elements in Matrix Y");
            Y.fillarray();
            System.out.println("Matrix X-Matrix Y");
            Z=X.SubMat(Y);
            Z.display();
        }
    }
}
