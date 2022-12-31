import java.util.Scanner;
class PearrePartner
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        int a,b,p,q,c1=0,c2=0;
        System.out.println("Enter 2 numbers");
        a=sc.nextInt();b=sc.nextInt();p=a;q=b;
        while(p!=0)
        {p=p/10;c1++;}
            while(q!=0)
            {q=q/10;c2++;}
            if((a/(int)Math.pow(10,c1-1))==b%10 && (b/(int)Math.pow(10,c2-1))==a%10)
            System.out.println(a + " and " + b + " are pearre partners.");
            else
            System.out.println(a + " and " + b + " are not pearre partners.");
        }
    }