import java.util.Scanner;
class Micro
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        int n,copy,d,c=0;
        System.out.println("Enter a number");
        n=sc.nextInt();copy=n;
        while(n!=0)
        {
            d=n%10;n=n/10;
        if(d%2==0)
    c++;}
            if(c>0)
            System.out.println(copy + " is micro number.");
            else
            System.out.println(copy + " is not micro number.");
        }
    }