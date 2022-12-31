import java.util.Scanner;
class Twist
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        int n,copy,d,c=0;
        System.out.println("Enter a number");
        n=sc.nextInt();copy=n;
        while(n!=0)
        {
            d=n%10;n=n/10;c++;}
            if((copy%10)%2==0 && (copy/(int)Math.pow(10,c-1))%2!=0)
            System.out.println(copy + " is twist number.");
            else
            System.out.println(copy + " is not twist number.");
        }
    }