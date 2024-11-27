import java.util.Scanner;

public class now3 {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);
        
        // Prompt the user to enter the first number
        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();
        
        // Prompt the user to enter the second number
        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();
        
        // Close the Scanner object to prevent resource leak
        scanner.close();
        
        // Calculate the sum of num1 and num2
        int sum = num1 + num2;
        
        // Display the result
        System.out.println("Sum of " + num1 + " and " + num2 + " is: " + sum);
    }
}
