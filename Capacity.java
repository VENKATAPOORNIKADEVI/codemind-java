import java.util.Scanner;
public class cap
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        int s=sc.nextInt();
        int b=sc.nextInt();
        int cap=(2*t*s*b)/2;
        System.out.printf("%d KB",cap);
    }
}