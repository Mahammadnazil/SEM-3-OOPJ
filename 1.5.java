import java.util.*;
public class METER_to_FEET{
	public static void main(String args[]){

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter value of Meter:");
		double m = sc.nextDouble();
		double feet = m*3.28084 ;
		System.out.println(m+"meter="+feet+"ft");
	}
}