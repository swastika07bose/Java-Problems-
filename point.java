import java.util.*;
class point
{
    int x,y;
    public point()
    {
        x=0;
        y=0;
    }
    public void readpoint()
    {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter x and y coordinate value: ");
        x=sc.nextInt();
        y=sc.nextInt();
    }
    public point midpoint(point a, point b)
    {
        point c=new point();
        c.x=(a.x+b.x)/2;
        c.y=(a.y+b.y)/2;
        return c;
    }
    public void displaypoint()
    {
        System.out.println("("+x+","+y+")");
    }
    public static void main()
    {
        point p= new point();
        point q= new point();
        point r= new point();
        System.out.print("for Point P ");
        p.readpoint();
        System.out.print("for Point P ");
        q.readpoint();
        r=r.midpoint(p,q);
        System.out.print("Point P ");
        p.displaypoint();
        System.out.print("Point Q ");
        q.displaypoint();
        System.out.print("Midpoint ");
        r.displaypoint();
    }
}