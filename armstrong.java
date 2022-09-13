public class armstrong{

    public static void main(String[] args) {
        int n=2,c=0,j=0,g,r;
        g=n;
        for(;g!=0;g/=10,++c);
        g=n;
        for(;g!=0;g/=10){
            r=g%10;
            j+=Math.pow(r, c);
        }
        System.out.println((n==j)?"armStrong":"not Armstrong");


    }
}
