import java.util.Scanner;
class Amicable
{public static void main()
    {Scanner sc = new Scanner(System.in);
        int a,b,i,s=0;System.out.println("Enter 2 numbers");a=sc.nextInt();b=sc.nextInt();
        for(i=1;i<a;i++)
        {if(a%i==0)
            s=s+i;
        }
            
            if(b==s)
            {s=0;
                for(i=1;i<b;i++)
        {
            if(b%i==0)
            s+=i;}
            if(a==s)
            System.out.println(a + " and "+b+ " are amicable pairs.");
            else
            System.out.println(a + " and "+b+ " are not amicable pairs.");}
            else
            System.out.println(a + " and "+b+ " are not amicable pairs.");
        }
    }