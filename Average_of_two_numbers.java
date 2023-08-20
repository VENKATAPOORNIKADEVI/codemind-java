import java.util.Scanner;
public class cross
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        float x=sc.nextFloat();
        float y=sc.nextFloat();
        double s= (x+y)/2;
        System.out.printf("Average of %.0f and %.0f is: %.2f",x,y,s);
    }
}