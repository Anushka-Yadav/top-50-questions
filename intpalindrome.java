import java.util.Scanner;
public class intpalindrome{
    
public static int reversenum(int n){
    int reversenum=0;
    while(n!=0){
        int remainder=n%10;
        reversenum=reversenum*10+remainder;
        n/=10;    
    }
        return reversenum;
}
public static void main(String[] args) {
        
    Scanner sc = new Scanner(System.in);
    int n=sc.nextInt();
    
    System.out.println((n==reversenum(n))?"palindrome":"not palindrome");

}
}
