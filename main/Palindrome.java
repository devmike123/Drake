import java.util.Scanner;
class Palindrome
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        int n,copy,d,rev=0;
        System.out.println("Enter a number");
        n=sc.nextInt();copy=n;
        while(n!=0)
        {
            d=n%10;n=n/10;rev=rev*10+d;}
            if(rev==copy)
            System.out.println(copy + " is palindrome.");
            else
            System.out.println(copy + " is not palindrome.");
        }
    }