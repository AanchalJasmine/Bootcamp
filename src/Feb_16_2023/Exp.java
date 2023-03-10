package Feb_16_2023;

import java.util.Scanner;

public class Exp {
public static void main(String args[]) {
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter two interger values :");
	int a= sc.nextInt();
	int b= sc.nextInt();
	try {
		int c=a/b;
		System.out.println(c);
	}
	catch(Exception e){
		System.out.println(e);
		System.out.println("Enter 2nd no. other than zero");
		System.out.println(e.getMessage());
		
	}
}

}
