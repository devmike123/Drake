import java.util.Scanner;
class Automorphic
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        int n,copy,c=0;
        System.out.println("Enter a number");
        n=sc.nextInt();copy=n;
        while(n!=0)
        {
            n=n/10;c++;}
            if((copy*copy)%(int)Math.pow(10,c)==copy)
            System.out.println(copy + " is automorphic number.");
            else
            System.out.println(copy + " is not automorphic number.");
        }
    }