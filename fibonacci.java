import java.util.Scanner;
public class fibonacci {

    public static void main(String[] args) {
    
    Scanner input = new Scanner(System.in);
    int n,first=0,second=1,third;
    n=input.nextInt();
    System.out.println(first);
    System.out.println(second5);
    for(int i=0;i<=n;i++)
    {
        third=first+second;
        first=second;
        second=third;
        System.out.println(third);
    }
    

}
    
}
