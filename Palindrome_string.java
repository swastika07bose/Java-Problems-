import java.util.*;
public class Palindrome_string
{
    public static boolean isPalindrome (String w)
    {
        boolean p= true;
        int len= w.length();
        for (int i=0; i<len; i++){
            if (w.charAt(i) != w.charAt(len-1-i)){
                p=false;
                break;
            }
        }
        return p;
    }
    public static String word (String w){
        int len=w.length();
        char l=w.charAt(len-1);
        int i = len-1;
        while (w.charAt(i)==l){
            i--;
        }
        StringBuffer sb = new StringBuffer(w);
        for (int j=i; j>=0; j--) {
            sb.append(w.charAt(j));
        }
        return sb.toString();
    }
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the Sentence:");
        String str = in.nextLine().trim().toUpperCase();
        int len = str.length();
        char last= str.charAt(len-1);
        if (last !='.' && last !='?' && last!='!'){
            System.out.println("Invalid Input");
            return;
        }
        String rs= str.substring(0, len-1);
        StringTokenizer st= new StringTokenizer(rs);
        StringBuffer sb= new StringBuffer();
        while (st.hasMoreTokens()){
            String word= st.nextToken();
            boolean ispalin= isPalindrome(word);
            if (ispalin){
                sb.append(word);
            }
            else{ 
                String pword= word(word);
                sb.append(pword);
            }
            sb.append(" ");
        }
        String convert= sb.toString().trim();
        System.out.println(str);
        System.out.println(convert);
    }
}