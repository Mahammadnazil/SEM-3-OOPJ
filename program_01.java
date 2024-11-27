//1. WAP to nd a diameter from given area of circle. (A)

import java.util.Scanner;
public class program_01
{
   public static void main (String args[])
   {
      System.out.println("enter area of circle:");
    Scanner sc=new Scanner(System.in);
    double area=sc.nextDouble();
    double r=Math.sqrt(area /3.14);
    double d=2*r;
   System.out.println("D="+d);
   }
}