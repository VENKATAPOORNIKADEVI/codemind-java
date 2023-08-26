import java.util.Scanner;
public class air
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int t=0,w1=0,w2=0;
        int[] a = new int[n];
        for(int i=0;i<n;i++)
        {
            a[i] = sc.nextInt();
        }
        int wt=sc.nextInt();
        for(int i=0;i<n;i++)
        {
            if(a[i] > wt)
            {
                w1+=2;
            }
            else
            {
                w2+=1;
            }
            t=w1+w2;
        }
        System.out.println(t);
        
    }
}