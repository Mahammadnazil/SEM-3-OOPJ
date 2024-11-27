/*1-WAP that create an array, take the size of array from the user, 
take the array member from the user and display it using loop.(A)*/

import java.util.*;
public class LAB_4_1
{
	public static void main  (String [] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of arrey:");
		int n = sc.nextInt();
		int [] arr = new int[n];

		for(int i=0;i<n;i++)
		{
			System.out.println("Enter "+i+" the element:");
			arr[i]= sc.nextInt();
		}

		for(int i=0;i<n;i++)
		{
			System.out.println(arr[i]);
		}
	}
}
