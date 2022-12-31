import java.util.Scanner;
class Twin
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        int a,b,i,c=0;
        System.out.println("Enter 2 numbers");
        a=sc.nextInt();b=sc.nextInt();
        if(Math.abs(a-b)==2)
        {
            for(i=1;i<=a;i++)
            {
                if(a%i==0)
                c++;}
                if(c==2)
                {c=0;
                    for(i=1;i<=b;i++)
            {
                if(b%i==0)
                c++;}
                if(c==2)
            System.out.println(a + " and "+b+ " are twin prime.");
            else
            System.out.println(a + " and "+b+ " are not twin prime.");}
            else
            System.out.println(a + " and "+b+ " are not twin prime.");}
        else
            System.out.println(a + " and "+b+ " are not twin prime.");
        }
    }