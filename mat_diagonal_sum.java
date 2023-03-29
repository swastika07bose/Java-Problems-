import java.util.*;
class mat_diagonal_sum
{
    public static void main (String args[])
    {
         Scanner sc=new Scanner(System.in);
         System.out.println("Enter the number of rows for a square matrix (between 3 and 10): ");
         int m=sc.nextInt();
         if(m<=3||m>=10){
            System.out.println("THE MATRIX SIZE IS OUT OF RANGE");
         }
         else{
            int a[][]=new int[m][m];
            int b[]=new int[m*m];
            int i,j,c,t;
            System.out.println("Enter "+(m*m)+" elements");
            for(i=0;i<m;i++){
                for(j=0;j<m;j++){
                    a[i][j] = sc.nextInt();
                }
            }
            System.out.println("\nORIGINAL MATRIX: ");
            c=0;
            for(i=0;i<m;i++){
                for(j=0;j<m;j++){
                     System.out.print(a[i][j]+ "   ");
                     if(i!=0 && j!=0 && i!=m-1 && j!=m-1)
                        b[c++]=a[i][j];
                }
                System.out.println();
            }
            for(i = 0; i < c; i++){
                for(j = i+1; j < c; j++){

                    if(b[i] > b[j]){
                        t = b[i];
                        b[i] = b[j];
                        b[j] = t;
                    }
                }
            }
            c = 0;
            for(i=0;i<m;i++){
                for(j=0;j<m;j++){
                     if(i!=0 && j!=0 && i!=m-1 && j!=m-1)
                        a[i][j]=b[c++];
                }
            }
            System.out.println("\nREARRANGED MATRIX: ");
            for(i=0;i<m ;i++){
                for(j=0;j<m;j++){
                     System.out.print(a[i][j]+ "   ");
                }
                 System.out.println();
            }
            System.out.println("\nDIAGONAL ELEMENTS: ");
            int sum=0;
            for(i=0;i<m;i++){
                for(j=0;j<m;j++){
                    if(i==j || i+j==m-1)
                    {
                        System.out.print(a[i][j]+ "   ");
                        sum=sum+a[i][j];
                    }
                    else
                     System.out.print("   ");
                }
                System.out.println();
            }
            System.out.println("Sum of Diagonal Elements= "+ sum);
        }
    }
}