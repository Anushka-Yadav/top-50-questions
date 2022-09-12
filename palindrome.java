import java.util.Scanner;
public class palindrome {
    public static void main(String[] args) 
    
    {
        Scanner sc=new Scanner(System.in);
        String word=new String();
        
        word=sc.nextLine();
        String n=reverse(word);
        reverse(word);
        System.out.println(word);
        System.out.println(n);
        if(word.equals(n))
        {System.out.println("palindrome");}
        else{System.out.println("not palindrome");}
    }
        static String reverse(String word)
        {
            int l=word.length();
            String reverseword="";
            for(int i=l-1;i>=0;i--)
            {
                reverseword=reverseword+word.charAt(i);
            }
            return reverseword;
        }
 }
    

