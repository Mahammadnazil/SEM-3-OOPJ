import java.util.Scanner;
public class Lab2_3{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter n1 and n2 here:");
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		System.out.println("Enter your choice:");
		int ch = sc.nextInt();
		switch(ch)
		{
			case 1:
				System.out.println(a+b);
				break;
			case 2:
				System.out.println(a-b);
				break;
			case 3:
				System.out.println(a*b);
				break;
			case 4:
				System.out.println(a/b);
				break;
			default:
				System.out.println("Invlaid Choice");
		}
	}
}