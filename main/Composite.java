import java.util.Scanner;
class Composite
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        int n,c=0;
        System.out.println("Enter a number");
        n=sc.nextInt();
        for(int i=1;i<=n;i++)
        {
            if(n%i==0)
            c++;}
            if(c>2)
            System.out.println(n + " is composite.");
            else
            System.out.println(n + " is not composite");
        }
    }