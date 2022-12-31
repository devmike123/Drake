import java.util.Scanner;
class Perfect
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        int n,s=0;
        System.out.println("Enter a number");
        n=sc.nextInt();
        for(int i=1;i<n;i++)
        {
            if(n%i==0)
            s+=i;}
            if(s==n)
            System.out.println(n + " is perfect.");
            else
            System.out.println(n + " is not perfect.");
        }
    }