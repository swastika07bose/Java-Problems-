import java.util.*;
class wordpile
{
    char ch[];
    int capacity, top;
    public wordpile(int cap)
    {
        capacity=cap;
        top=-1;
        ch=new char[capacity];
    }
    void pushchar(char v)
    {
        if(top+1==capacity)
            System.out.println("wordpile is full");
        else
            ch[++top]=v;
    }
    char popchar()
    {
        if(top==-1)
            return '#';
        else
            { return ch[top--];
                
            }
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in); 
        
        System.out.println("number of characters"); 
        int n=sc.nextInt();  
        if(n>20)  
            n=20;  
        wordpile obj=new wordpile(n);
        while(true)  
        {
            System.out.println("1.Push");  
            System.out.println("2.Pop");
            System.out.println("3.Display");
            System.out.println("4. Exit");
            System.out.print("Enter choice:");  
            int choice=sc.nextInt();  
            switch(choice)  
            {  
                case 1: 
                    System.out.print("Enter the character:");  
                    char c=sc.next().charAt(0);  
                    obj.pushchar(c);  
                    break;  
                case 2: 
                    c=obj.popchar();  
                    if(c=='#') 
                        System.out.println("Empty stack.");  
                    else  
                        System.out.println(c+" popped.");  
                        break;
                case 3:
                    for(int i=0; i<=obj.top; i++)
                    {
                       // System.out.println(ch[i]," ");
                       System.out.print(obj.ch[i]+" ");
                    }
                    break;
                 case 4: System.exit(0);   
                
            }
        }
    }
}