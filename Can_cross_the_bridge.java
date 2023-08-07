import java.util.Scanner;
public class kg
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int y=sc.nextInt();
        int z=sc.nextInt();
        int p=(z-y)/x;
        System.out.println(p);
    }
}