import java.util.Scanner;
class Lead
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        int n,copy,d,o=0,e=0;
        System.out.println("Enter a number");
        n=sc.nextInt();copy=n;
        while(n!=0)
        {
            d=n%10;n=n/10;
        if(d%2==0)
    e+=d;
else
o+=d;}
            if(o==e)
            System.out.println(copy + " is lead number.");
            else
            System.out.println(copy + " is not lead number.");
        }
    }