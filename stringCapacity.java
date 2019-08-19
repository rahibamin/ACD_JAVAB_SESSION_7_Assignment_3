package Session7.Assignment3;

import java.util.Scanner;

public class stringCapacity {
	public static void main(String[] args) {


		StringBuilder sb = new StringBuilder();

		
		Scanner sc = new Scanner (System.in);
		System.out.print("Enter a String: ");
		String x = sc.next();

		sb.append(x);
		System.out.println("String capacity: " +sb.capacity());
		System.out.println("String Lenght: " +sb.length());
		
		
		System.out.print("Enter another String: ");
		 x = sc.next();
		sb.append(x);
		System.out.println("String capacity after Append: " +sb.capacity());
		System.out.println("String Lenght: " +sb.length());
		System.out.println("String after Appending: " +sb);
		
		
		
	}
	
	
}
