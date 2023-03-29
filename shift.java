import java.util. Scanner;
public class shift  
{    
    Scanner sc=new Scanner(System.in);
    int mat[][]=new int[25][25];  
    int m,n;  
    shift(int mm, int nn)  
    {  
        m=mm;  
        n=nn;  
    }
    void input()
    {
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                mat[i][j]=sc.nextInt();
            }
        }
    }
    void cyclic(shift P)
    {
        for(int i=0;i<m;i++)     
            for(int j=0;j<n;j++)  
            {    
                if(i!=0)          
                    mat[i-1][j]=P.mat[i][j];   
                else                      
                    mat[m-1][j]=P.mat[0][j];   
            }   
    }
    void display()
    {
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                  System.out.print(mat[i][j]+"\t");                                                                                                    
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
        if(a>5||b>5)
        {
            System.out.println("Size more than 5x5");
        }
        else
        {
            shift X=new shift(a,b);
            shift Y=new shift(a,b);
            System.out.println("Enter elements in Matrix X");
            X.input();
            Y.cyclic(X);
            System.out.println("Initial Array is: ");
            X.display();
            System.out.println("Final Array is: ");
            Y.display();
        }
    }
}