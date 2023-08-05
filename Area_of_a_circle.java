import java.util.Scanner;
public class area
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        double r=sc.nextInt();
        double ar=3.14*r*r;
        System.out.printf("%.2f",ar);
    }
}