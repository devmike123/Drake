import java.util.Scanner;
class Krishnamurthy
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        int n,copy,d,s=0,i,f;
        System.out.println("Enter a number");
        n=sc.nextInt();copy=n;
        while(n!=0)
        {d=n%10;n=n/10;f=1;
        for(i=1;i<=d;i++)
    f*=i;s+=f;}
            if(s==copy)
            System.out.println(copy + " is krishnamurthy number.");
            else
            System.out.println(copy + " is not krishnamurthy number.");
        }
    }