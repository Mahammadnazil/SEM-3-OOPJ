import java.util.Scanner;
public class Lab3_3{
	public static double area (double r){
		return 3.14*r*r;
	}
	public static double area (double h, double b){
		return 0.5*b*h;
	}
	public static float area (float a){
		return a*a;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the radius here: ");
		double r = sc.nextDouble();
		System.out.println("Enter base and height here: ");
		double b = sc.nextDouble();
		double h = sc.nextDouble();
		System.out.println("Enter the side of square here: ");
		float a = sc.nextFloat();
		System.out.println("The area of circle is " + area(r));
		System.out.println("The area of triangle is " + area(h,b));
		System.out.println("The area of square is " + area(a));
	}
}