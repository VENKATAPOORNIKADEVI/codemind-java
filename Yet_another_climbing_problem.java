import java.util.Scanner;
public class yet
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t!=0)
        {
            int a=sc.nextInt();
            int b=sc.nextInt();
            int c=(a/b)+(a%b);
            System.out.println(c);
            t-=1;
        }
    }
}