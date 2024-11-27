import java.util.Scanner;
 class program_02
{
   public static void main (String[] args)
   {
      System.out.println("enter no:");
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    if(n>0)
    {
      System.out.println("N is positive");
    }
    else if(n<0)
    {
      System.out.println("N is nagative");
    }
    else
    {
      System.out.println ("N is zero");
    }
   }
}