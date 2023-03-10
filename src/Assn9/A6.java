package Assn9;

import java.util.Scanner;

public class A6 {
	public static void main(String args[]) {
		        Scanner input = new Scanner(System.in);
		        System.out.println("Enter length: ");
		        int a = input.nextInt();
		        System.out.println("Enter breath: ");
		        int b = input.nextInt();
		       System.out.println("Area of Rectangle " + (a*b));
		       System.out.println("Perimeter of Rectangle " + (2*(a+b)));
	}
}
