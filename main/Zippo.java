import java.util.Scanner;
class Zippo
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        int n,d,copy,c=0,z;
        System.out.println("Enter a number");
        n=sc.nextInt();copy=n;
        while(n!=0)
        {
            n=n/10;c++;}
            z=(copy%(int)Math.pow(10,c-1))-(copy%10);
            if(z==0)
            System.out.println(copy + " is zippo number.");
            else
            System.out.println(copy + " is not zippo number.");
        }
    }