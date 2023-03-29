import java.util.Scanner;
public class del_from_string
{
    public static void main(String args[])
    {
        int i=0,count=1,len=0,pos=0;
        char ch=' ',last=' ';
        String s="",news="",wd="",wd1="";
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter sentence: ");
        s=sc.nextLine();
        len=s.length();
        last=s.charAt(len - 1);
        if(last != '.' && last != '?' && last != '!')
        {
            System.out.println("Invalid input");
            return;
        }
        s=s.toUpperCase();
        System.out.print("Word to be deleted: ");
        wd = sc.next();
        wd = wd.toUpperCase();
        System.out.print("The Word pisition in the sentence: ");
        pos = sc.nextInt();
        for(i=0;i< len;i++)
        {
            ch=s.charAt(i);
            if(ch==' '||ch=='.'||ch=='?'||ch=='!')
            {
                if(wd1.equals(wd)==true && (count)==pos)
                {
                    news=news;
                }
                else
                {
                    news=news+wd1+ch;
                }
                wd1="";
                count++;
            }
            else
            {
                wd1=wd1+ch;
            }
        }
        System.out.println("new sentence:"+news);
    }
}
        