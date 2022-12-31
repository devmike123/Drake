import java.util.Scanner;
class Armstrong
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        int n,copy,d,s=0;
        System.out.println("Enter a number");
        n=sc.nextInt();copy=n;
        while(n!=0)
        {d=n%10;n=n/10;s+=(d*d*d);}
            if(s==copy)
            System.out.println(copy + " is armstrong number.");
            else
            System.out.println(copy + " is not armstrong number.");
        }
    }