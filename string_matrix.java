import java.util.*;
class string_matrix
{
    public static void main(String args[])
    {
        System.out.println("Enter Matrix Size:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        char[][] matrix = new char[n][n];
        int x=0,y=0;
        sc.nextLine();
        
        for(int i = 0; i < n; i++) {
            for (int j=0; j<n; j++){
                
                System.out.println("Enter element");
                matrix[i][j]=sc.next().charAt(0);
                for(int a =0; a < i-1; a++) {
                    for (int b=0; b<j-1; b++){
                        if (matrix[a][b]==matrix[i][j])
                        {
                            break;
                        }
                    }
                }
            }
        }
        for(int i = 0; i < n; i++) {
            for (int j=0; j<n; j++){
                System.out.println(matrix[i][j]);
            }
        }   
        System.out.println("Enter element to be searched");
        char s= sc.next().charAt(0);
        for(int i = 0; i < n; i++) {
            for (int j=0; j<n; j++){
                if (matrix[i][j]==s)
                {
                    x=i;
                    y=j;
                    break;
                }
            }
        }
        for (int i=0;i<y;i++){
            System.out.println(matrix[x][i]);
        }
        for (int i=0;i<x;i++){
            System.out.println(matrix[i][y]);
        }  
    }
}
