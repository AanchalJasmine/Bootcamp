package Assn9;

import java.util.Scanner;

public class A14 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first number:");
		int num1 = sc.nextInt();
		String result=(num1%2==0) ? "number is even" : "number is odd";
		System.out.println(result);
	}
}
