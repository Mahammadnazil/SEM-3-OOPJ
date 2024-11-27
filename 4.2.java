import java.util.Scanner;
public class Lab4_2{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of array: ");
		int n = sc.nextInt();
		int []arr = new int[n];
		for (int i=0; i<n; i++) {
			System.out.println("Enter "+i+"element: ");
			arr[i] = sc.nextInt();
		}
		int even=0, odd=0;
		for (int i=0; i<n; i++) {
			if (arr[i]%2==0) {
				even++;
			}
			else{
				odd++;
			}
		}
		System.out.println("Odd: " +odd + "even: " +even);
	}
}