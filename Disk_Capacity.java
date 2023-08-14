import java.util.Scanner;
public class cap
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int s=sc.nextInt();
        int t=sc.nextInt();
        int b=sc.nextInt();
        //int c=(s*t*b)*2;
        System.out.printf("%d",(s*t*b*512)*2);
        
    }
}