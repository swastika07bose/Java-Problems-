import java.util.*;
class Stock1
{
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter Item name: ");
        String item=sc.next();
        System.out.print("Enter Item quantity: ");
        int qty=sc.nextInt();
        System.out.print("Enter Item rate: ");
        int rate=sc.nextInt();
        System.out.print("Enter new Item quantity: ");
        int pqty=sc.nextInt();
        System.out.print("Enter new Item rate: ");
        int prate=sc.nextInt();
        purchase st= new purchase(item, qty, rate, pqty, prate);
        st.display();
    }
}
class stock
{
    String item;
    int qty;
    int rate;
    int amt;
    stock(String i, int q, int r)
    {
        item=i;
        qty=q;
        rate=r;
        amt=qty*rate;
    }
    void display()
    {
        System.out.println("Name of the item: "+item);
        System.out.println("Quantity: "+qty);
        System.out.println("Rate per unit: "+rate);
        System.out.println("Net value: "+amt);
    }
}
class purchase extends stock
{
    int pqty;
    int prate;    
    purchase(String i, int q, int r, int pq, int pr)
    {
        super(i,q,r);
        pqty=pq;
        prate=pr;
    }
    void update()
    {
        qty+=pqty;
        if(prate!=rate)
            rate=prate;
        amt=qty*rate;
    }
    void display()
    {
        super.display();
        update();
        super.display();
    }
}