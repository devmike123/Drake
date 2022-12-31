import java.util.Scanner;
class Histro
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        int n,copy,d,s=0;
        System.out.println("Enter a number");
        n=sc.nextInt();copy=n;
        while(n!=0)
        {
            d=n%10;n=n/10;
        if(d%2!=0)
        s+=d*d*d;}
            System.out.println("The Histro Pair of " + copy + " = " +s);
        }
    }