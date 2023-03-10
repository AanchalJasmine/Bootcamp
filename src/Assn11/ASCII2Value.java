package Assn11;

import java.util.Scanner;

public class ASCII2Value {
	public static void main(String args[]) {
		Scanner L2 = new Scanner(System.in);
		System.out.println("Enter any character :");
		char L1 = L2.next().charAt(0);
		int L = L1;
		System.out.println("The ASCII value of character is "+ L);
		
	}

}
