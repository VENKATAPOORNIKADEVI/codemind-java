import java.util.Scanner;
public class inc
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int s=sc.nextInt();
        int t=sc.nextInt();
        int b=sc.nextInt();
        System.out.printf("%d KB",s*t*b);
    }
}