import java.util.Scanner;
class Narcissistic
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        int n,d,copy,c=0,s=0;
        System.out.println("Enter a number");
        n=sc.nextInt();copy=n;
        while(n!=0)
        {
            n=n/10;c++;}
            n=copy;
            while(n!=0)
        {
            d=n%10;n=n/10;s+=(int)Math.pow(d,c);}
        
        if(copy==s)
        System.out.println(copy + " is narcissistic number.");
        else
        System.out.println(copy + " is not narcissistic number.");
    }
}