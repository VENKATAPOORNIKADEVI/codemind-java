import java.util.*;
public class ele
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = sc.nextInt();
        for(int i=1;i<=a;i++)
        {
            if(i%2!=0)
            System.out.printf("%d x %d = %d%n",n,i,n*i);
            else
            {
                continue;
            }
        }
    }
}