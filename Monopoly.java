import java.util.Scanner;
public class mono
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int test=sc.nextInt();
        while(test!=0)
        {   int a,b,c;
            a=sc.nextInt();
            b=sc.nextInt();
            c=sc.nextInt();
            if ((a+b)<c || (b+c)<a || (c+a)<b)
            {
                System.out.println("YES");
            }
            else
            {
                System.out.println("NO");
            }
        test-=1;
        }

    }
}