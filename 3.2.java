import java.util.*;
public class LAB_3_2
{
   public static int MAX (int a,int b,int c)
 {
   if (a>b && a>c)
   {
      return a;
   }
   else if (b>c)
   {
      return b;
   }
   else
   {
      return c;
   }
}
   public static void main (String [] args)
   {
    Scanner sc=new Scanner(System.in);
    System.out.println("enter value of a,b,c:");
    int a=sc.nextInt();
    int b=sc.nextInt();
    int c=sc.nextInt();
    LAB_3_2 maximum= new LAB_3_2();
   System.out.println(" value is :"+maximum.MAX(a,b,c));
   }
}