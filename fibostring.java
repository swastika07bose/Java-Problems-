import java.util.*;
class fibostring
{
    String x,y,z;
    int n;
    public fibostring()
    {
        x="a";
        y="b";
        z="ba";
    }
    void accept()
    {
        Scanner Sc= new Scanner(System.in);
        System.out.println("Enter number of terms");
        n=Sc.nextInt();
    }
    void generate()
    {
        System.out.print(x+","+y);
        for(int i=0;i<=n-2;i++)
        {
            System.out.print(","+z);
            x=y;
            y=z;
            z=y+x;
            z=y.concat(x);
        }
    }
    public static void main()
    {
        fibostring fs= new fibostring();
        fs.accept();
        fs.generate();
    }
}