import java.util.Scanner;
public class car
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        int x=sc.nextInt();
        int ct=1;
        if(n1>n2)
        {
            System.out.println("-1");
        }
        else
        {
            int a=n1;
            int b=n2;
            if(a+x>=b)
            {
                ct++;
                a+=n1;
                b+=n2;
            }
            System.out.println(ct);
        }
    }
}