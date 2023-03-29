import java.util.*;
class symmetric_matrix
{
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
        boolean sym = true;
        for (i=0; i<m; i++)
        {
            for (j=0; j<m; j++)
            {
                if(arr[i][j]!=arr[j][i])
                {
                    sym=false;
                    break;
                }
            }
        }
        if (sym)
            System.out.println("The matrix is symmetric");
        else
            System.out.println("The matrix is not symmetric");
        }
        else
        {
            System.out.println("The matrix is out of range");
        }
    }
}