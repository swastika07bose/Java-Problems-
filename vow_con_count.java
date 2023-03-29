import java.util.*;
class vow_con_count
{
     public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a sentence:");
        String str = in.nextLine();
        str = str + " ";
        String word = "", mWord = "";
        int count = 0, maxCount = 0;
        char ch;
        String w="";
        int v=0, c=0;
        int len = str.length();
        System.out.println("Word \t\tVowels \t\tConsonants");
        for (int i=0;i<len;i++)
        {
            ch=str.charAt(i);
            if (ch!=' ')
            {
                w=w+ch;
            }
            else
            {
                int l1=((w.trim()).length());
                for (int j=0;j<l1;j++)
                {
                    char ch1=w.charAt(j);
                    if (ch1=='a' || ch1=='e' || ch1=='i' ||ch1=='o' || ch1=='u' || ch1=='A'|| ch1=='E' || ch1=='I' || ch1=='O'|| ch1=='U')
                    {
                        v++;
                    }
                    else
                    {
                        c++;
                    }
                }
                System.out.println(w+"\t\t"+ v+"\t\t"+c);
                w="";
                v=0;
                c=0;
            }
        }
    }
}