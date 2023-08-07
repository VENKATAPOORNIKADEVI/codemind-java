import java.util.Scanner;
public class in
{
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        int inc=sc.nextInt();
        double cm=2.54*inc;
        System.out.printf("%.2f",cm);
    }
}