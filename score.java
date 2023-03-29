import java.util.*;
class score
{
    public static void main(String args[])
    {
        bestfour bf=new bestfour();
        bf.input();
        bf.bestsubject();
    }
}
class isc_scores
{
    int[][] number;
    int k,s=0;
    isc_scores()
    {
        number= new int[6][2];
        k=0;
    }
    void input()
    {
        for(int i=0;i<6;i++)
        {
            Scanner sc= new Scanner(System.in);
            System.out.print("Enter Subject Code: ");
            number[i][0]=sc.nextInt();
            System.out.print("Enter marks of Subject: ");
            number[i][1]=sc.nextInt();
            s=s+number[i][1];
        }
        System.out.println("Total marks  "+s);
    }
    int point()
    {
        int marks=number[k][1];
        if(marks>=90)
            return 1;
        else if(marks>=80 && marks<90)
            return 2;
        else if(marks>=70 && marks<80)
            return 3;
        else if(marks>=60 && marks<70)
            return 4;
        else if(marks>=50 && marks<60)
            return 5;
        else if(marks>=40 && marks<50)
            return 6;
        else 
            return 0;
    }
}
class bestfour extends isc_scores
{
    int s=0;
    void bestsubject()
    {
        int a,b,c;
        for(a=0;a<6;a++)
        {
            for(b=0;b<5-a;b++)
            {
                if(number[b][0]<number[b+1][0])
                {
                    c=number[b+1][0];
                    number[b+1][0]=number[b][0];
                    number[b][0]=c;
                }
            }
        }
        for(a=0;a<6;a++)
        {
            s+=number[a][0];
            number[a][1]=point();
        }
        System.out.println("Top 4 points are:");
        for(a=0;a<4;a++)
            System.out.println(number[a][1]);
    }
}
