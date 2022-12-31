import java.util.Scanner;
class Spy
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        int n,copy,d,s=0,p=1;
        System.out.println("Enter a number");
        n=sc.nextInt();copy=n;
        while(n!=0)
        {
            d=n%10;n=n/10;s=s+d;p=p*d;}
            if(s==p)
            System.out.println(copy + " is spy number.");
            else
            System.out.println(copy + " is not spy number.");
        }
    }