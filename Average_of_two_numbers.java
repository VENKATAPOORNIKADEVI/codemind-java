import java.util.Scanner;
public class cap
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        float a=sc.nextFloat();
        float b=sc.nextFloat();
        float c=(a+b)/2;
        System.out.printf("Average of %.0f and %.0f is: %.2f",a,b,c);
    }
}