import java.util.Scanner;
public class book
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] a = new int[n];
        int[] b = new int[n];
        int c=0,d=0;
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
           
        }
        for(int i=0;i<n;i++)
        {
            b[i]=sc.nextInt();
           
        }
        
        for(int i=0;i<n;i++)
        {
              c += a[i];
              d += b[i];
        }
        int s=d-c;
        if(s<0)
        {
            System.out.println(0);
        }
        else
        {
            System.out.println(s);
        }
    }
}