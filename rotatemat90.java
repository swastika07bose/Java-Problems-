import java.util.*;
class rotatemat90
{
    static void rotate90(int mat[][],int n)  
    {    
        for(int i=0;i<n;i++)  
        {  
            for(int j=i;j<n;j++)  
            {  
                int temp=mat[i][j];  
                mat[i][j]=mat[j][i];  
                mat[j][i]=temp;  
            }  
        }  
        for(int i=0;i<n;i++)  
        {  
            int l=0, h=n-1;  
            while(l<h)  
            {  
                int temp=mat[i][l];  
                mat[i][l]=mat[i][h];  
                mat[i][h]=temp;  
                l++;  
                h--;  
            }  
        }  
        System.out.println("90 degrees Rotated Matrix is: ");  
        for (int i=0;i<n;i++)
        {
            for (int j=0;j<n;j++)
            {
                System.out.print(mat[i][j]+" ");
            }
            System.out.println();
        }
    }  
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter Size of Matrix: ");
        int m=sc.nextInt();
        if (m>2 && m<10)
        {
        int[][] arr=new int[m][m];
        System.out.println("Enter "+(m*m)+" elements");
        int i,j;
        for (i=0;i<m;i++)
        {
            for (j=0;j<m;j++)
            {
                arr[i][j]=sc.nextInt();
            }
        }
        for (i=0;i<m;i++)
        {
            for (j=0;j<m;j++)
            {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        rotate90(arr,m);
        }
        else
        {
            System.out.println("The matrix is out of range");
        }
    }
}