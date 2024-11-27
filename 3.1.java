import java.util.*;

public class LAB_3_1
{
   public static double SIC (double p,double r,double t)
   {
   return p*r*t/100;
   }
   public static void main (String [] args)
      {
    Scanner sc=new Scanner(System.in);
    System.out.println("enter value of p,t,r:");
    double p=sc.nextDouble();
    double r=sc.nextDouble();
    double t=sc.nextDouble();
   System.out.println(LAB_3_1.SIC(p,r,t));
   }
}