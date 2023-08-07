import java.util.Scanner;
public class cap
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        double p=sc.nextDouble();
         double r=sc.nextDouble();
         double t=sc.nextDouble();
        double ci=p*Math.pow((1+r/100),t)-p;
        System.out.printf("%.2f",ci);
    }
}